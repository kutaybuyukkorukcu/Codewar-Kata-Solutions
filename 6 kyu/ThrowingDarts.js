function scoreThrows(radiuses){
  var n = radiuses.length;
  if(!n) { return 0;}
  var bonus = (radiuses.filter(a => a < 5).length === n) ? 100 : 0
  return radiuses.map(a => (a > 10) ? 0 : (a >= 5 && a <= 10) ? 5 : 10).reduce((b,c) => b + c) + bonus;
}
