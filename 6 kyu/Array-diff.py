def array_diff(a, b):
    for i in b:
        a = [n for n in a if n != i]
    return a
