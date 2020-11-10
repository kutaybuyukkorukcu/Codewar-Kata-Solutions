// https://www.codewars.com/kata/564057bc348c7200bd0000ff

function loopSum(arr) {
    let pattern = [1, 10, 9, 12, 3, 4];
    return arr.reduce((a,b,i) => +(a) + (b*pattern[i%pattern.length]));
}

function thirt(num) {
    let arr = String(num).split("").reverse(), next, ans = 0;
    while(next != ans) {
        ans = loopSum(arr);
        arr = String(ans).split("").reverse();
        next = loopSum(arr);
    }
    return +arr.reverse().join("");
}

// 🧙‍♂️👍