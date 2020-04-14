var numberSides = promt("How many sides does the die have?");

function rollDice(numberSides) {
  return Math.floor(Math.random() * numberSides) + 1;
}

for (var i = 0; i < 100; i++){
  console.log(rollDice(numberSides));
}
