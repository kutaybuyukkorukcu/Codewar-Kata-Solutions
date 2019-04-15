def is_prime(num):
    flag = 0
    if(num == 0 or num == 1 or num<0):
        return False
    for i in range(2,num):
        if(num % i == 0):
            flag = 1
    if(flag == 1):
        return False
    return True
