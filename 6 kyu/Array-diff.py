# https://www.codewars.com/kata/523f5d21c841566fde000009

def array_diff(a, b):
    for i in b:
        a = [n for n in a if n != i]
    return a

# 🧙‍♂️👍
