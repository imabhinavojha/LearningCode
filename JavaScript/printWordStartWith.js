function printWordsStartingWithO(input) {
    const words = input.split(' ');
    for (const word of words) {
        if (word.startsWith('O') || word.startsWith('o')) {
            console.log(word);
        }
    }
}

const input = "Abhinav Ojha is good";
printWordsStartingWithO(input);
