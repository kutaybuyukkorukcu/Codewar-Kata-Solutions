function multiplicationTable(row,col){
  var multiArray = [];
  for (var i = 1; i < row+1; i++) {
    multiArray.push([]);
    for (var j = 1; j < col+1; j++) {
      multiArray[i-1].push((i) * (j));
    }
  }
  return multiArray;
}
