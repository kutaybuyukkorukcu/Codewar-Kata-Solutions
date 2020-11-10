# https://www.codewars.com/kata/526233aefd4764272800036f

def matrix_addition(a, b):
    for i in range(len(a)):
        for j in range(len(a[0])):
            a[i][j] = a[i][j] + b[i][j]
    return a

# 🧙‍♂️👍