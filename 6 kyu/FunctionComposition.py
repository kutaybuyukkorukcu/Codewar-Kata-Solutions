import inspect
    
def compose(f, g):
    t = tuple(inspect.getargspec(g)[0])
    return lambda *t: f(g(*t))
