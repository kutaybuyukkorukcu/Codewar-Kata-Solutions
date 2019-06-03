function diffArray(arr1, arr2) {
  return [
    ...diff(arr1, arr2),
    ...diff(arr2, arr1)
  ]
  
  function diff(x, y) {
    return x.filter(u => y.indexOf(u) === -1);
  }
}
