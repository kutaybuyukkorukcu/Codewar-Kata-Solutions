# https://www.codewars.com/kata/5539fecef69c483c5a000015

def prime(n):
    if n in (2, 3, 5): return True
    if n % 2 == 0 or n % 3 == 0: return False
    return all(n % i for i in range(5, int(n**.5)+1, 2))
        
def backwardsPrime(start, stop):
    return [x for x in range(start, stop + 1) if (str(x) != str(x)[::-1]) and prime(x) and prime(int(str(x)[::-1])) ]

# 🧙‍♂️👍