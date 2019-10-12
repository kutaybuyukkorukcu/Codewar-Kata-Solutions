// Splits values into two groups. If an element in filter is truthy, the corresponding element 
// in the collection belongs to the first group; otherwise, it belongs to the second group.

const bifurcate = (arr, filter) =>
                arr.reduce((acc, val, i) => 
                        (acc[filter[i] ? 0 : 1].push(val), acc), [[], []]);
  
Exp.
  bifurcate(['beep', 'boop', 'foo', 'bar'], [true, true, false, true]);
  // [ ['beep', 'boop', 'bar'], ['foo'] ]
