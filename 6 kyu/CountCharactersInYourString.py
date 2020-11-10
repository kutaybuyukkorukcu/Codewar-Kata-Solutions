# https://www.codewars.com/kata/52efefcbcdf57161d4000091

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

# 🧙‍♂️👍