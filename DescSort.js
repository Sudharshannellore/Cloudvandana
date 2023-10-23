const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Enter numbers separated by commas: ', (inputString) => {
    rl.close();

    // Split the input string into an array of numbers
    const inputArray = inputString.split(',').map(Number);

    // Sort the array in descending order
    inputArray.sort((a, b) => b - a);

    // Display the sorted array
    console.log(inputArray);
});
