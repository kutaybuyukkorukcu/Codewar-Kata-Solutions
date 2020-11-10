# https://www.codewars.com/kata/52945ce49bb38560fe0001d9

def pascal(p):
    result = []
    for i in range(p):
        if i == 0:
            result.append([1])
        else:
            result.append([1] + [result[i - 1][j] + result[i - 1][j + 1] for j in range(len(result[i - 1]) - 1)] + [1])
    return result

# 🧙‍♂️👍