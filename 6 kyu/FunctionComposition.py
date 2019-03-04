import inspect
    
def compose(f, g):
    t = tuple(inspect.getargspec(g)[0])
    return lambda *t: f(g(*t))

""" js format 

function compose(f,g) {
  return function(i) {
    if (arguments.length > 1)
      return f.call(null, g.apply(null, arguments));
    else
      return f(g(i));
  }
}

"""
