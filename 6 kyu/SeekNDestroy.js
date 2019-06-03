/*Initial array (the first argument in the destroyer function), followed by one or more arguments 
Remove all elements from the initial array that are of the same value as these arguments.
destroyer([1, 2, 3, 1, 2, 3], 2, 3) */

function destroyer(arr) {
  var args = Array.from(arguments).slice(1);
  return arr.filter(function(val) {
    return !args.includes(val);
  });
}

// Alternative
const destroyer = (arr, ...args) => arr.filter(i => !args.includes(i));
