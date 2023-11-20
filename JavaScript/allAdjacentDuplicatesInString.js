function allAdjacentDuplicatesInString(s) {
    const result = [];
    for (const char of s) {
        if (result.length === 0 || char !== result[result.length - 1]) {
            result.push(char);
        } else {
            result.pop(); // Remove the adjacent duplicate
        }
    }
    return result.join('');
}

const input = "abbaca";
const output = allAdjacentDuplicatesInString(input);
console.log("Original string: " + input);
console.log("String after removing adjacent duplicates: " + output);
