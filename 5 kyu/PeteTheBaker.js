var cakes = (recipe, available) => {
  var rKeys = Object.keys(recipe);
  var aKeys = Object.keys(available);
  let answer = Infinity
  if (!rKeys.every(e => aKeys.includes(e))) {
    return 0;
  }
  rKeys.forEach(key => {
    if (available[key] / recipe[key] <= answer) {
      answer = available[key] / recipe[key];
    }
  })
  return Math.floor(answer);
}
