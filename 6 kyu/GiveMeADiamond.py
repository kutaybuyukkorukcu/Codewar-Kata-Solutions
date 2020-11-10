# https://www.codewars.com/kata/5503013e34137eeeaa001648

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

# 🧙‍♂️👍