import re
def vowel_indices(word):
    c = 1
    i = 0
    lis = []
    hmm = re.search(r'[AEIOUYaeiouy]',word)
    if hmm:
        print(1)
    else:
        return []
    for n in word:
        stt = re.search(r'[AEIOUYaeiouy]',n)
        if stt:
            lis.insert(i, c)
            i = i + 1
        c = c + 1
    return lis
     
