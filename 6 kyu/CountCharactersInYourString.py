def count(string):
    res = {}
    if (string == ""):
        return {}
    for i in string:
        if i in res:
            res[i] += 1
        else:
            res[i] = 1
    return res
