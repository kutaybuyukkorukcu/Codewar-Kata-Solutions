def narcissistic( value ):
    sum = 0
    for i in str(value):
        sum = sum + (int(i) ** len(str(value)))
    if (sum == value):
        return True
    return False
    
#chkd
