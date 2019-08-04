def my_first_interpreter(input)
  output = []
  cell = 0
  commands = input.delete('^+.')
  increment = commands.scan(/(^\.+)/)

#Will cont