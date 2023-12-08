fetch('https://fakestoreapi.com/products')
    .then((data) => {
        return data.json();
    })
    .then((completeddata) => {
        let data1 = "";
        completeddata.forEach((values) => { // Changed map to forEach
            data1 += `<div class="card">
                <h1 class="t1">${values.title}</h1>
                <img src="${values.image}" alt="img1" class="images"></img>
                <p>${values.description}</p>
                <p class="c1">${values.category}</p>
                <p class="p1">${values.price}</p>
            </div>`;
        });
        document.getElementById("cards").innerHTML = data1;
    })
    .catch((err) => {
        console.log(err);
    });
