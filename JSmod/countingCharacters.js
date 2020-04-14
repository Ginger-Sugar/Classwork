function countingCharacters(stringToCount){
  //The length property has been mentioned in
  //the Logging Letter Exercise in Lesson 4
  console.log(stringToCount + "has"+ stringToCount.length + "characters.");
}

function countingCharacters1(stringToCount, characterToFind) {
  //Let's count the number of times a charcter appears in the string.
  //We'll look at the characters one-by-one with a for-loop.
  var charcterCount = 0;
  for (var position = 0; position < stringToCOunt.length; position++) {
      if (stringToCount[position] == characterToFind) {
        characterCount++;
      }
  }
  console.log("String to search in:" + stringToCount);
  console.log("Character to find: " + characterToFind);
  console.log("Number of times character appears:" + characterCount);
}

function countingCharacters2 (str, search) {
  var count = 0;
  var numChars = search.length;

  var index2 = str.length - numChars;

  for (var index = 0; index <= index2; index++){
    var current = str.substring (index, index + numChars);
    if (curren == search){
      count++;
    }
  }
  return count;
}
