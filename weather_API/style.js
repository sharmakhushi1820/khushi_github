const apiKey = "6eb1180161eccb06843669dbee0f87b3";
const searchBox = document.querySelector(".search input");
const searchBtn = document.querySelector(".search button");
const weatherIcon = document.querySelector(".weather-icon");
const errorDiv = document.querySelector(".error");
const weatherDiv = document.querySelector(".weather");
const cityElement = document.querySelector(".city");
const tempElement = document.querySelector(".temp");
const humidityElement = document.querySelector(".humidity");
const windElement = document.querySelector(".wind");

searchBtn.addEventListener("click", () => {
    const location = searchBox.value;
    const apiurl = `https://api.openweathermap.org/data/2.5/weather?q=${location}&units=metric&appid=${apiKey}`;
    checkWeather(location, apiurl);
});

async function checkWeather(location, apiurl) {
    try {
        const response = await fetch(apiurl);

        if (response.status === 404) {
            errorDiv.style.display = "block";
            weatherDiv.style.display = "none";
        } else {
            const data = await response.json();

            cityElement.innerHTML = data.name;
            tempElement.innerHTML = Math.round(data.main.temp) + "°C";
            humidityElement.innerHTML = data.main.humidity + "%";
            windElement.innerHTML = data.wind.speed + "km/h";

            if (data.weather[0].main.toLowerCase() === "clouds") {
                weatherIcon.src = "images/clouds.png";
            } else if (data.weather[0].main.toLowerCase() === "clear") {
                weatherIcon.src = "images/clear.png";
            } else if (data.weather[0].main.toLowerCase() === "rain") {
                weatherIcon.src = "images/rain.png";
            } else if (data.weather[0].main.toLowerCase() === "drizzle") {
                weatherIcon.src = "images/drizzle.png";
            } else if (data.weather[0].main.toLowerCase() === "mist") {
                weatherIcon.src = "images/mist.png";
            }

            weatherDiv.style.display = "block";
            errorDiv.style.display = "none";
        }
    } catch (error) {
        console.error("Error fetching weather data:", error);
        errorDiv.style.display = "block";
        weatherDiv.style.display = "none";
    }
}
