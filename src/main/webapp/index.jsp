<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Aktualna pogoda</title>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
          integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

    <script src="scripts/ajax.js"></script>
</head>
<body>
    <div class="container">
        <div class="col-md-offset-3 col-md-8" style="margin-top: 1em">
            <a class="btn btn-info" href="/weather?cityId=6695624" role="button">Warszawa</a>
            <a class="btn btn-info" href="/weather?cityId=3099434" role="button">Gdańsk</a>
            <a class="btn btn-info" href="/weather?cityId=3094802" role="button">Kraków</a>
            <a class="btn btn-info" href="/weather?cityId=3081368" role="button">Wrocław</a>
            <a class="btn btn-info" href="/weather?cityId=3088171" role="button">Poznań</a>
            <a class="btn btn-info" href="/weather?cityId=3093133" role="button">Łódź</a>
            <a class="btn btn-info" href="/weather?cityId=3096472" role="button">Katowice</a>
        </div>
        <div class="col-md-offset-3 col-md-8" style="margin-top: 1em">
            <button class="btn btn-info" onclick="requestWeatherForCity(6695624)" role="button">Warszawa</button>
            <button class="btn btn-info" onclick="requestWeatherForCity(3099434)" role="button">Gdańsk</button>
            <button class="btn btn-info" onclick="requestWeatherForCity(3094802)" role="button">Kraków</button>
            <button class="btn btn-info" onclick="requestWeatherForCity(3081368)" role="button">Wrocław</button>
            <button class="btn btn-info" onclick="requestWeatherForCity(3088171)" role="button">Poznań</button>
            <button class="btn btn-info" onclick="requestWeatherForCity(3093133)" role="button">Łódź</button>
            <button class="btn btn-info" onclick="requestWeatherForCity(3096472)" role="button">Katowice</button>
        </div>
        <div id="weather" class="col-md-offset-4 col-md-4 " style="margin-top: 1em"></div>
    </div>
</body>
</html>
