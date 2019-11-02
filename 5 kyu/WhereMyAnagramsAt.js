function anagrams(word, words) {
  
  return words.filter((e) => {
    var anagrams = e.split('').sort().join('');
    var testWord = word.split('').sort().join('');

    return anagrams === testWord
  });
}

//:vault-boy-thumps-up:
