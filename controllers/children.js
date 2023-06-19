const childrens = require('../assets/output.json')
const fs = require('fs');
function getChildrens(req, res) {
    console.log('get data')
    res.json(childrens)
}

function addChildrens(req, res) {
    const newChildrenData = req.body;
    // console.log(childrens.children)
    // console.log(childrens.children[0].children[0].children)

    childrens.children.push(newChildrenData);
    const data = JSON.stringify(childrens)
    try {
        fs.writeFileSync('./assets/output.json', data);
        // file written successfully
    } catch (err) {
        console.error(err);
    }
    res.json(childrens)
}

function getChildrensByCountry(req, res) {
    const reqCountry = req.params.country;
    console.log('reqCountry: ', reqCountry)
    console.log(childrens.children[0].children)
    console.log('---------------')
    const resultChildrens = childrens.children[0].children.map((item) => {
        console.log('---------------')

        console.log(item.children[0].children)
        console.log('---------------')

        return item.children[0].children.filter((item2) => {
            console.log('item2 = ', item2)
            console.log('country = ', item2.country)
            return item2.country == reqCountry;
        });
    })
    res.json(resultChildrens)
}

function generate(req, res) {
    const t0 = performance.now()
    const size = req.params.size;
    const array = []
    for (let i = 0; i <= size; i++) array.push(i)
    const array2 = Array.from({ length: size }, (_, i) => i++)

    const t1 = performance.now()
    res.send({
        'array': array2,
        'runtime': t1 - t0
    })
}
