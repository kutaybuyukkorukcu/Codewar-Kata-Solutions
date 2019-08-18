function rot13(message){
  const fHalf = Array.from("abcdefghijklmABCDEFGHIJKLM1234567890");
  const sHalf = Array.from("nopqrstuvwxyzNOPQRSTUVWXYZ1234567890"); 
  
  let result = '';

  message.split('').map( (value) => {
    let i = fHalf.indexOf(value);
    result += i < 0 ? fHalf[sHalf.indexOf(value)] : sHalf[i];
  });
  return result;
}

// Alternative solution that i saw

function rot13(message){
  var arr = message.split('');
  var lcase = 'abcdefghijklmnopqrstuvwxyzabcdefghijklmnop'.split('');
  var ucase = 'ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOP'.split('');
  for (var i = 0; i < arr.length; i++){
    var letter = '';
    if (arr[i].match(/[a-z]/)){
      letter = lcase.indexOf(arr[i]);
      arr[i] = lcase[letter+13];
    }else if (arr[i].match(/[A-Z]/)){
      letter = ucase.indexOf(arr[i]);
      arr[i] = ucase[letter+13];
    }
  }
  return arr.join('');
}
