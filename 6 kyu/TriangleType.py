# https://www.codewars.com/kata/53907ac3cd51b69f790006c5

def triangle_type(a, b, c):
    tri = sorted([a, b, c])
    if tri[0] + tri[1] <= tri[2]:
        return 0
    elif tri[0]**2 + tri[1]**2 > tri[2]**2:
        return 1
    elif tri[0]**2 + tri[1]**2 == tri[2]**2:
        return 2
    else:
        return 3

# 🧙‍♂️👍
