class Person:
    def __init__(self, name):
        self.name = name
    def greet(self, your_name):
        return "Hello {you}, my name is {me}".format(you=your_name, me=self.name)
