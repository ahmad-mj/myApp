<%@ page import="org.grails.guides.Vehicle" %>
<html>
<html>
<head>
    <meta name="layout" content="public"/>
    <title>Home Page</title>
</head>
<body>

<div id="content" role="main">
    <section class="row colset-2-its">
        <h1>Welcome ${name}!</h1> 

        <g:if test="${flash.message}"> 
            <div class="message" role="status">${flash.message}</div>
        </g:if>

        <p>There are ${vehicleTotal} vehicles in the database.</p>
        <h1>Vehicle List</h1>
        <ul>
            <% vehicleList.each { vehicle -> %>
                <li>
                    <g:link controller="vehicle" action="show" id="${vehicle.id}">
                        ${vehicle.name} - ${vehicle.year} ${vehicle.make.name} ${vehicle.model.name}
                    </g:link>
                </li>
            <% } %>
        </ul>

        <g:form action="/home/updateName" method="post" style="margin: 0 auto; width:320px"> 
            <input type="text" name="name" value="" id="name">
            <input type="submit" name="Update name" value="Update name" id="Update name">
        </g:form>

        <h2>Add New Vehicle</h2>
        <g:form controller="home" action="save" style="margin: 0 auto; width:320px">
            <label>Name: <g:textField name="name" /></label><br/>
            <label>Year: <g:textField name="year" /></label><br/>
            <label>Make: <g:textField name="make" /></label><br/>
            <label>Model: <g:textField name="model" /></label><br/>
            <g:submitButton name="Create" value="Add Vehicle"/>
        </g:form>

    </section>
</div>

</body>
</html>