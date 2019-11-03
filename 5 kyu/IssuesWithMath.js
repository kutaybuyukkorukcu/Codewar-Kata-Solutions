Math.round = number => {
  return (number - parseInt(number) >= 0.5) ? parseInt(number) + 1 : parseInt(number) ;
};

Math.ceil = number => {
  return (parseInt(number) === number) ? number : parseInt(number) + 1;
};

Math.floor = number => {
  return parseInt(number);
};

//:vault-boy-thumps-up:
