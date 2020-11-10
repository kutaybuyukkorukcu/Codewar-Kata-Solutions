# https://www.codewars.com/kata/52761ee4cffbc69732000738

def goodVsEvil(good, evil):
    gList = [1, 2, 3, 3, 4, 10]
    eList = [1, 2, 2, 2, 3, 5, 10]
    goodList = good.split(" ")
    evilList = evil.split(" ")
    g = sum(gList[en]*i for en, i in enumerate(map(int, goodList)))
    e = sum(eList[en]*i for en, i in enumerate(map(int, evilList)))
    if g > e:
        return "Battle Result: Good triumphs over Evil"
    if g < e:
        return "Battle Result: Evil eradicates all trace of Good"
    else:
        return "Battle Result: No victor on this battle field"

# 🧙‍♂️👍