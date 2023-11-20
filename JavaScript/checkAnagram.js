function areAnagrams(str1, str2) {
    // Remove spaces and convert both strings to lowercase
    str1 = str1.replace(/\s/g, '').toLowerCase();
    str2 = str2.replace(/\s/g, '').toLowerCase();

    if (str1.length !== str2.length) {
        return false;
    }

    const charCount1 = {};
    const charCount2 = {};

    // Count character frequencies in the first string
    for (const char of str1) {
        charCount1[char] = (charCount1[char] || 0) + 1;
    }

    // Count character frequencies in the second string
    for (const char of str2) {
        charCount2[char] = (charCount2[char] || 0) + 1;
    }

    // Compare character frequencies in both strings
    for (const char in charCount1) {
        if (charCount1[char] !== charCount2[char]) {
            return false;
        }
    }

    return true;
}

const str1 = "listen";
const str2 = "silent";

if (areAnagrams(str1, str2)) {
    console.log(`'${str1}' and '${str2}' are anagrams.`);
} else {
    console.log(`'${str1}' and '${str2}' are not anagrams.`);
}
