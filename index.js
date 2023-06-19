const express = require('express')
const app = express()
const port = 8000

const childrenController = require('./controllers/children')

app.use(express.json());
app.use(express.urlencoded({ extended: true }));

app.listen(port, () => {
    console.log(`app running on port ${port}`)
})