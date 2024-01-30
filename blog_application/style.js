document.querySelectorAll('a[href^="#"]').forEach(anchor => {
    anchor.addEventListener('click', function (e) {
        e.preventDefault();

        document.querySelector(this.getAttribute('href')).scrollIntoView({
            behavior: 'smooth'
        });
    });
});

//  .............................................................

    let form = document.querySelector('form');

    form.addEventListener('submit', (event) => {
        let name = event.target.name.value;
        let phone = event.target.phone.value;
        let email = event.target.email.value;
        let message = event.target.message.value;

        let userData = JSON.parse(localStorage.getItem('userDetails')) || [];
        userData.push({
            'name': name,
            'email': email,
            'phone': phone,
            'message': message
        });

        localStorage.setItem('userDetails', JSON.stringify(userData));
        // console.log(userData) 
        // console.log(name, phone, email, message)
        event.preventDefault();
    });
