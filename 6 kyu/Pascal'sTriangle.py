# https://www.codewars.com/kata/5226eb40316b56c8d500030f

def pascals_triangle(n):
  if n == 1:
      return [1]
  prev = pascals_triangle(n - 1)
  return prev + [1 if i == 0 or i == n -1 else prev[-i] + prev[-(i + 1)] for i in range(n)]


# 🧙‍♂️👍