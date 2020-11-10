# https://www.codewars.com/kata/587731fda577b3d1b0001196

def camel_case(string):
    hi = []
    output = []
    hi = string.split()
    for n in hi:
        output.append(n.capitalize())
    return ''.join(output)

# 🧙‍♂️👍