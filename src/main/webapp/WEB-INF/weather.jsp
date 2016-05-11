<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div>
    <table class="table table-striped">
        <tr>
            <th class="col-md-6 text-right">Miasto</th>
            <td class="col-md-6"><c:out value="${weather.city}"/></td>
        </tr>
        <tr>
            <th class=" text-right">Temperatura</th>
            <td><c:out value="${weather.temperature}"/></td>
        </tr>
        <tr>
            <th class=" text-right">Zachmurzenie</th>
            <td><c:out value="${weather.cloudiness}"/></td>
        </tr>
        <tr>
            <th class=" text-right">Prędkość wiatru</th>
            <td><c:out value="${weather.windSpeed}"/></td>
        </tr>
        <tr>
            <th class=" text-right">Ciśnienie</th>
            <td><c:out value="${weather.pressure}"/></td>
        </tr>
    </table>
</div>
