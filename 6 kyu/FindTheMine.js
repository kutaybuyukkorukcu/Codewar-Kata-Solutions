function mineLocation(field){
  for (var r = 0; r < field.length; r++) {
    var c = field[r].indexOf(1);
    if (c >= 0) {
      return [r, c];
    }
  }  
}
