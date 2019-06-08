function fearNotLetter(str) {
  var allChars = '';
  var notChars = new RegExp('[^'+str+']','g');
  // Another possible solution to consider (str.charCodeAt(i) - str.charCodeAt(i-1) > 1)
  
  for (var i = 0; allChars[allChars.length-1] !== str[str.length-1] ; i++)
    allChars += String.fromCharCode(str[0].charCodeAt(0) + i);

  return allChars.match(notChars) ? allChars.match(notChars).join('') : undefined;
}
