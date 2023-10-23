const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function ReverseWord(sentence) {
    let words = sentence.split(' ');

    let ReversedWord = words.map(word => {
        return word.split('').reverse().join('');
    });

    return ReversedWord.join(' ');
}

rl.question("Enter a sentence: ", (inputSentence) => {
    const reversedSentence = ReverseWord(inputSentence);
    console.log("Reversed Sentence:", reversedSentence);
    rl.close();
});
