# https://www.codewars.com/kata/57f8ff867a28db569e000c4a

def kebabize(string):
    res = ""
    for char in string:
      if char == char.lower() and char.isalpha():
        res += char
      elif char == char.upper() and char.isalpha():
        res = res + '-' + char
    return res.lstrip('-').lower()

# 🧙‍♂️👍