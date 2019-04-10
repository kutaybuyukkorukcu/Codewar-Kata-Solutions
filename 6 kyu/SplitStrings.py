def solution(s):
    if len(s) == 0:
        return []
    else:
        count = 0
        empty_str = ''
        result = []
        for s_itr in s:
            if count == 2:
                result.append(empty_str)
                count = 0
                empty_str = ''
            count += 1
            empty_str += s_itr
        result.append(empty_str)
        if len(result[-1]) == 1:
            result[-1] += '_'
        return result

#chkd
