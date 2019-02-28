def gps(s, x):
    if(len(x) <= 1):
        return 0
    output = []
    for i in range(0,len(x)-1):
        output.append((x[i+1] - x[i])*3600/s)
    return max(output)
