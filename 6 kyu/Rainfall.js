function mean(town, strng) {
    return calculateData(town, strng, d => d.reduce((p, c) => p + c) / d.length);
}

function variance(town, strng) {
    const avg = mean(town, strng);
    return calculateData(town, strng, d => d.reduce((p, c) => p + Math.pow(c - avg, 2) , 0) / d.length);
}

#Will cont