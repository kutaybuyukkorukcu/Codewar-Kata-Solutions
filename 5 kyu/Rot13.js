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

// Alternative solution

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

function rot13(str) {
  return str.replace(/[a-z]/ig, function(x){
    return String.fromCharCode(x.charCodeAt(0) + (x.toLowerCase() <= 'm' ? 13: -13));
  });
}

//:vault-boy-thumps-up:
