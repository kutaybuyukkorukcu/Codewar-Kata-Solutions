# https://www.codewars.com/kata/522551eee9abb932420004a0

def nth_fib(n): 
    if n==1: 
        return 0
    elif n==2: 
        return 1
    else: 
        return nth_fib(n-1)+nth_fib(n-2) 

# 🧙‍♂️👍