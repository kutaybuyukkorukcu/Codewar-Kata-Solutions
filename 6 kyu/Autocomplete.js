function autocompleteFilter(input, dictionary){
  var cleanInput = "";

  for (var j=0;j<input.length;j++){
    if (input[j].match(/[a-zA-Z ]/)){cleanInput += input[j]}
  }

  return (dictionary.filter(function(element){
    return (cleanInput.toLowerCase() == element.slice(0, cleanInput.length))
  })).slice(0,5);
}