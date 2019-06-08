function uniteUnique() {
  var concatArr = [];
  var i = 0;
  while (arguments[i]){
    concatArr = concatArr.concat(arguments[i]); i++;
  }
  
  uniqueArray = concatArr.filter((item, i) => (concatArr.indexOf(item) == i));
  
  return uniqueArray;
}
