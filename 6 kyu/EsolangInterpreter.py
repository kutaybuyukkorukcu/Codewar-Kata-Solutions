def my_first_interpreter(code):
    input, output = 0, " "
    for v in code:
        if v in '+':
          input = (input + 1) % 256
        elif v in '.': 
          output += chr(input)
    return output
