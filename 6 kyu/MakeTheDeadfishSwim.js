function parse( data ) {  
  var v = 0, output = []
  for (var c of data) {
    switch (c) {
      case 'i' : v++;            break;
      case 'd' : v--;            break;
      case 's' : v=v*v;          break;
      case 'o' : output.push(v); break;
    }
  }
  return output;
}
