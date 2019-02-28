class Automaton(object):

    def __init__(self):
        self.states = []
        self.automata = {
            (1, 1) : 2,
            (1, 0) : 1,
            (2, 1) : 2,
            (2, 0) : 3,
            (3, 1) : 2,
            (3, 0) : 2,
        }

    def read_commands(self, commands):
        c_state = 1
        for n in commands:
            c_state = self.automata[(c_state, int(n))]
            self.states.append((int(n), c_state))
        return (True if (c_state == 2) else False)
                
my_automaton = Automaton()
