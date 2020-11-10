# https://www.codewars.com/kata/5287e858c6b5a9678200083c

def narcissistic( value ):
    sum = 0
    for i in str(value):
        sum = sum + (int(i) ** len(str(value)))
    if (sum == value):
        return True
    return False
    
# 🧙‍♂️👍