function generateHashtag(str) {
  if (str === "") return false

  const camelCaseString = str
    .split(" ")
    .map(word => word.charAt(0).toUpperCase() + word.slice(1))
    .join("");

  const stringWithHashtag = "#${camelCaseString.trim()}"

  return stringWithHashtag.length > 140 ? false : stringWithHashtag
}
