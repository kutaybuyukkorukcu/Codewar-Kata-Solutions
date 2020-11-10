# https://www.codewars.com/kata/53368a47e38700bd8300030d

def namelist(names):
    if len(names) > 1:
        return '{} & {}'.format(', '.join(name['name'] for name in names[:-1]), names[-1]['name'])
    elif names:
        return names[0]['name']
    else:
        return ''
        
# 🧙‍♂️👍