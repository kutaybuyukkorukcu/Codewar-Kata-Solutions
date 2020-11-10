# https://www.codewars.com/kata/54e6533c92449cc251001667

def unique_in_order(iterable):
    list = []
    for item in iterable:
        if len(list) < 1 or not item == list[len(list) - 1]:
            list.append(item)
    return list
    
# 🧙‍♂️👍