def ip_to_int32(ip):
    binary = " "
    ip = ip.split(".")
    for i in ip:
        temp = bin(int(i))[2:] #i dont want 0b that's why we're using [2:]
        binary += "0" * (8 - len(temp)) + temp
    return int(binary,2)
