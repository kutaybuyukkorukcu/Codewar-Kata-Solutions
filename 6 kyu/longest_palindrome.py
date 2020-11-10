# https://www.codewars.com/kata/54bb6f887e5a80180900046b

def longest_palindrome(s):
  results = []  
  for i in range(len(s)):
    for j in range(0,i):
      chunk = s[j:i+1]
      if chunk == chunk[::-1]:
        results.append(chunk)
  if not s:
    return 0
  else:
      return len(max(results, key=len))

# 🧙‍♂️👍