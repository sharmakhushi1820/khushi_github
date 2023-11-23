        
        function check() {
            if (document.getElementById('checkedBox.id').checked == true) {
                document.getElementById("pic2").innerHTML = '<img src="e-book.jpg">   <img src="e-book2.webp">  <img src="e-book3.webp"> '
            }
            else {
                document.getElementById('pic2').innerHTML = ""

            }
        }


        var colorSwitchButton = document.getElementById("colorSwitchButton");


        colorSwitchButton.addEventListener("click", function () {

            var randomColor = getRandomColor();
            document.body.style.backgroundColor = randomColor;
        });


        function getRandomColor() {
            var letters = '0123456789ABCDEF';
            var color = '#';
            for (var i = 0; i < 6; i++) {
                color += letters[Math.floor(Math.random() * 16)];
            }
            return color;
        }