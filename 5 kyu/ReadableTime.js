function humanReadable(seconds) {

  const minutes = seconds / 60
  const realSeconds = Math.floor(seconds % 60)
  const realMinutes = Math.floor(minutes % 60)
  const realHour = Math.floor(minutes / 60)

  const readableHour =
    String(realHour).length === 1 ? "0" + String(realHour) : realHour

  const readableMinutes =
    String(realMinutes).length === 1
      ? "0" + String(realMinutes)
      : realMinutes

  const readableSeconds =
    String(realSeconds).length === 1
      ? "0" + String(realSeconds)
      : realSeconds

  return `${readableHour}:${readableMinutes}:${readableSeconds}`
}

// wowe

function humanReadable(seconds) {
  var pad = (x) => { return (x < 10) ? "0" + x : x; }
  return pad(parseInt(seconds / (60*60))) + ":" +
         pad(parseInt(seconds / 60 % 60)) + ":" +
         pad(seconds % 60)
}

//:vault-boy-thumps-up:
