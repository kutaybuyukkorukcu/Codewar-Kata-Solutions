def unique_in_order(iterable):
    list = []
    for item in iterable:
        if len(list) < 1 or not item == list[len(list) - 1]:
            list.append(item)
    return list
    
#chkd
