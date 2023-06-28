function getSum(req, res) {
    const a = req.query.a;
    const b = req.query.b;
    res.send((Number(a) + Number(b)).toString())
}

function checkPrime(req, res) {
    const a = req.params.a;
    if (a < 2) return res.send(false)
    for (let i = 2; i <= Math.sqrt(a); i++) {
        if (a % i == 0) return res.send(false)
    }
    res.send(true)
}

function findMax(req, res) {
    const arr = req.body;
    let findMax = arr[0]
    for (let i of arr) {
        if (findMax < i) findMax = i
    }
    res.json(findMax)
}

function reverseString(req, res) {
    const a = req.params.text
    const reversed = a.split("").reverse().join("")
    res.json(reversed)
}

function checkPalindrome(req, res) {
    const a = req.params.text
    const reversed = a.split("").reverse().join("")
    res.json(a == reversed)
}

function countFrequency(req, res) {
    const a = req.query.a
    const text = req.query.text
    const arrText = text.split("")
    let count = 0
    for (let i of arrText) {
        if (i == a) count++
    }
    res.json(count)
}

function ramdomText(req, res) {
    const length = req.params.length
    const chars = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789';
    let str = '';
    for (let i = 0; i < length; i++) {
        str += chars.charAt(Math.floor(Math.random() * chars.length))
    }
    res.json(str)
}

function calculateFactorial(req, res) {
    const a = req.params.a
    let factorial = 1;
    for (let i = 1; i <= a; i++) {
        factorial *= i
    }
    res.json(factorial)
}

function sortIncrease(req, res) {
    const arr = req.body
    for (let i = 0; i <= arr.length - 2; i++) {
        for (let j = i + 1; j <= arr.length - 1; j++) {
            if (arr[i] > arr[j]) {
                let temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
        }
    }
    res.json(arr)
}

function checkAnagram(req, res) {
    const arr1 = req.body.arr1
    const arr2 = req.body.arr2
    if (arr1.length != arr2.length) return res.json(false)
    const length = arr1.length
    for (let i = 0; i < length; i++) {
        if (arr1[i] != arr2[length - 1 - i]) return res.json(false)
    }
    res.json(true)
}

function createBookObject(req, res) {
    const tilte = req.body[0]
    const author = req.body[1]
    const publishingYear = req.body[2]
    const book = { tilte, author, publishingYear }
    res.json(book)

}

function createRectangle(req, res) {
    const width = Number(req.query.width)
    const height = Number(req.query.height)
    const rectangle = {
        width,
        height,
        area: Number(width) * Number(height)
    }
    res.json(rectangle)
}

function evenArray(req, res) {
    const arr = req.body
    const evenArr = arr.filter((number) => number >= 0)
    res.json(evenArr)
}

function createRandomNumber(req, res) {
    const a = Number(req.query.a)
    const b = Number(req.query.b)
    console.log('a = ', a, ', b = ', b)
    res.json(Math.floor((Math.random() * (b - a + 1)) + a))
}

function perfectNumber(req, res) {
    const n = req.params.n
    let arr = []
    for (let i = 6; i <= n - 1; i++) {
        let sum = 0
        for (j = 1; j < i; j++) {
            if (i % j == 0) sum += j
            if (sum > i) break
        }
        if (sum == i) arr.push(j)
    }
    res.json(arr)
}

function checkIncreaseArr(req, res) {
    const arr = req.body
    for (let i = 0; i < arr.length - 1; i++){
        if (arr[i] > arr[j]) return res.json(false)
    }
    res.json(true)
}

function fizzbuzz(req, res) {
    const n = Number(req.params.n)
    // if(n % 3 == 0 && n % 5 == 0) return res.json('FizzBuzz')
    // if(n % 3 == 0) return res.json('Fizz')
    // if(n % 5 == 0) return res.json('Buzz')
    // res.json('')

    // c2
    let str = ''
    if (n % 3 == 0) str += 'Fizz'
    if (n % 5 == 0) str += 'Buzz'
    res.json(str)
}

function getCharacterNth(req, res) {
    const str = req.body.str
    const pos = req.body.pos
    res.json(str.charAt(pos - 1))
}

module.exports = {
    getSum,
    checkPrime,
    findMax,
    reverseString,
    checkPalindrome,
    countFrequency,
    ramdomText,
    calculateFactorial,
    sortIncrease,
    checkAnagram,
    createBookObject,
    createRectangle,
    evenArray,
    createRandomNumber,
    perfectNumber,
    fizzbuzz,
    getCharacterNth,
    checkIncreaseArr
}