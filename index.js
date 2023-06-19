const express = require('express')
const app = express()
const port = 8000

const childrenController = require('./controllers/children')

app.use(express.json());
app.use(express.urlencoded({ extended: true }));
//

app.get('/childrens', childrenController.getChildrens)
app.post('/childrens', childrenController.addChildrens)
app.get('/childrens/:country', childrenController.getChildrensByCountry)
app.post('/benchmark/:size', childrenController.generate)


app.listen(port, () => {
    console.log(`app running on port ${port}`)
})