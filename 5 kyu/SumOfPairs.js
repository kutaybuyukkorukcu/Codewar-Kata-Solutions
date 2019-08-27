var sum_pairs = function(ints, s) {
    var map = {}, pairMaxIndex = ints.length - 1, pair;

    for (let i = 0; i <= pairMaxIndex; i++) {
        var a = ints[i];
        var b = s - a;
        var j = map[b];
        if (j !== undefined && i <= pairMaxIndex && j <= pairMaxIndex) {
            pairMaxIndex = i > j ? i : j;
            pair = i < j ? [a, b] : [b, a];
        }
        var tmp = map[a];
        if (tmp === undefined || i < tmp) {
            map[a] = i;
        }
    }
    return pair;
};
