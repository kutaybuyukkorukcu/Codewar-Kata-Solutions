function groupByCommas(n) {
  var m = n.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",");
  return m;
}
