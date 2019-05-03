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
    try:
      return len(max(results, key=len))
    except ValueError:
      return 1
"""
def req(s):
  results = []  
  for i in range(len(s)):
    for j in range(0,i):
      chunk = text[j:i+1] #this is the first element of the string 
      if chunk == chunk[::-1]: #this is the first element of the string list reversed
        results.append(chunk)
  if not s:
    return 0
  else:
    try:
      return len(max(results, key=len))
    except ValueError:
      return 1
---------------------------------------------------------------------------------------
def longest_palindrome (s):
    longest = 0
    for left in range(len(s)):
        for right in range(len(s), left, -1):
            if s[left:right] in (s[left:right])[::-1]:
                longest = max(right-left, longest)
                break
    return longest
"""

#chkd
