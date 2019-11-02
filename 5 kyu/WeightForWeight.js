function orderWeight(str) {
  return str
    .split(' ')
    .map(item => {
      const weight = item.split('').reduce((a, b) => Number(a) + Number(b), 0)
      return { item, weight };
    })
    .sort(
      (a, b) =>
        a.weight === b.weight ? a.item.localeCompare(b.item) : a.weight - b.weight
    )
    .map(({ item }) => item)
    .join(' ');
}

//:vault-boy-thumps-up:
