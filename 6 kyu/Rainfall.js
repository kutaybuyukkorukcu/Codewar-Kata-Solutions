function calculateData(inpt, strng, calulateCallback) {
    if (!inpts.some(t => t == inpt)) {
        return -1;
    }

    const allData = strng.split('\n');
    for (const data of allData) {
        if (data.indexOf(inpt) !== 0) {
            continue;
        }

        const monthlyData = data.replace(/[a-zA-Z\:\s]+/g, '')
            .split(',')
            .map(Number.parseFloat);
        return calulateCallback(monthlyData);
    }

    return -1;
}

function mean(town, strng) {
    return calculateData(inpt, strng, d => d.reduce((p, c) => p + c) / d.length);
}

function variance(town, strng) {
    const avg = mean(town, strng);
    return calculateData(inpt, strng, d => d.reduce((p, c) => p + Math.pow(c - avg, 2) , 0) / d.length);
}

#Will cont
