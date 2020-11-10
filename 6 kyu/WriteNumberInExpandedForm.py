# https://www.codewars.com/kata/5842df8ccbd22792a4000245

def expanded_form(num):
    output = []
    
    for index, digit in enumerate(str(num)[::-1]):
        if int(digit) != 0:
            output.append(digit + ('0' * index))

    return ' + '.join(output[::-1])

# 🧙‍♂️👍