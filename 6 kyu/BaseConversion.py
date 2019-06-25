    def convert_01(self, input, source, target):
        if source == target:
            return input

        def str_to_num(strng, source):
            ret = 0
            base = len(source)
            for i, c in enumerate(reversed(strng)):
                ret += source.index(c) * (base ** i)
            return ret

        def num_to_str(num, target):
            ret = ''
            base = len(target)
            while True:
                num, rem = divmod(num, base)
                ret += target[rem]
                if num <= 0:
                    return ret[::-1]

        return num_to_str(str_to_num(input, source), target)

    def convert_02(self, input, source, target):
        base_in = len(source)
        base_out = len(target)
        acc = 0
        for d in input:
            acc *= base_in
            acc += source.index(d)
        out = ''
        while True:
            out = target[acc % base_out] + out
            acc //= base_out
            if acc == 0:
                return out
                
                
#will ref
