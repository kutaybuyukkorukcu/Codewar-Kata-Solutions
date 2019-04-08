def diamond(n):
    if n < 1 or  n % 2 == 0:
        return None
    else:
        diamond = ""
        for i in range(n):
            diamond += " " * abs((n/2) - i)
            diamond += "*" * (n - abs((n-1) - 2 * i))
            diamond += "\n"
        return diamond
        
"""
def diamond(n):
    if n%2 == 0 or n < 1:
        return None
    else:
        dia = ["*" * n]
        for i in range(1, int((n+1)/2)):
            dia.insert(0, (" " * i) + (("*") * (n - 2 * i)))
            dia.append((" " * i) + (("*") * (n - 2 * i)))
    return "\n".join(dia) + "\n"
"""
