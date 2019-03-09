var nbrOfLaps = function (x, y) {
  var count = x
  while(count%y !== 0){
    count += x
  }
  return [count/x, count/y];
}
