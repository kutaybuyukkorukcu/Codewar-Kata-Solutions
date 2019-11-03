function ipToInt32(ip){
  var binary32 = '';
  ip.split('.').map( (value) => {
    binary32 += ((+value).toString(2)).padStart(8,'0');
  });
  return parseInt(binary32,2);
}

//:vault-boy-thumps-up:
