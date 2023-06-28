const express = require('express')
const app = express()
const port = 8000

const exerciseControllter = require('./controllers/exercise')

app.use(express.json());
app.use(express.urlencoded({ extended: true }));

// 1. sum
app.post('/sum', exerciseControllter.getSum)

// 2. check prime
app.post('/prime/:a', exerciseControllter.checkPrime)

// 3. find max in array
app.post('/findmax', exerciseControllter.findMax)

// 4. reserve string
app.post('/reserve-text/:text', exerciseControllter.reverseString)

// 5. check palindrome
app.post('/palindrome/:text', exerciseControllter.checkPalindrome)

// 6. count frequency
app.post('/count-frequency', exerciseControllter.countFrequency)

// 7. random string
app.post('/random-string/:length', exerciseControllter.ramdomText)

// 8. factorial
app.post('/factorial/:a', exerciseControllter.calculateFactorial)

// 9. sort increase
app.post('/sort-increase', exerciseControllter.sortIncrease)

// 10. check anagram
app.post('/check-nagram', exerciseControllter.checkAnagram)

// 11. create book object
app.post('/create-book-object', exerciseControllter.createBookObject)

// 12. create create rectangle
app.post('/create-rectangle', exerciseControllter.createRectangle)

// 13. even array
app.post('/even-array', exerciseControllter.evenArray)

// 14. create random number
app.post('/create-random-number', exerciseControllter.createRandomNumber)

// 15. perfect number
app.post('/perject-number/:n', exerciseControllter.perfectNumber)

// 16. check increase arr
app.post('/check-increase-arr', exerciseControllter.checkIncreaseArr)

// 17. reserve string
app.post('/reserve-text/:text', exerciseControllter.reverseString)



// fizzbuzz
app.post('/fizzbuzz/:n', exerciseControllter.fizzbuzz)

// CharacterNth
app.post('/character-nth', exerciseControllter.getCharacterNth)

app.listen(port, () => {
    console.log(`app listening on port ${port}`)
})