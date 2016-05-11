
function requestWeatherForCity(cityId) {
    var xmlHttpRequest = new XMLHttpRequest();
    var url = "weather?cityId=" + cityId;

    xmlHttpRequest.open("GET", url, true);
    xmlHttpRequest.onreadystatechange = getWeatherReadyStateHandler(xmlHttpRequest);
    xmlHttpRequest.send();
}

function getWeatherReadyStateHandler(xmlHttpRequest) {
    return function () {
        if (xmlHttpRequest.readyState == 4) {
            if (xmlHttpRequest.status == 200) {
                document.getElementById("weather").innerHTML = xmlHttpRequest.responseText;
            } else {
                document.getElementById("weather").innerHTML = "Nie udało się wczytać pogody";
            }
        }
    };
}