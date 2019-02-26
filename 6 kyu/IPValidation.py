import re
def is_valid_IP(string):
    base_regexp = re.compile('^\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}$')
    res = base_regexp.match(string)
    if res is None:
        return False
    sub = string.split('.')
    idx = 0
    for value in sub:
        if idx == 0 and value == '0':
            return False
        if idx > 0 and len(value) > 1 and value[0] == '0':
            return False
        if 0 < int(value) < 256:
            pass
        else:
            return False
        idx += 1
    return True
