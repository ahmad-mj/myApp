<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'vehicle.label', default: 'Vehicle')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
    <div id="content" role="main">
        <section class="row colset-2-its">
            <h1>Welcome ${name}!</h1> 

            <h4>${flash.message}</h4>  

            <p>There are ${vehicleTotal} vehicles in the database.</p> 

            <form action="/home/updateName" method="post" style="margin: 0 auto; width:320px"> 
                <input type="text" name="name" value="" id="name">
                <input type="submit" name="Update name" value="Update name" id="Update name">
            </form>

        </section>
        <div id="list-vehicle" class="content scaffold-list" role="main">
        
    </div>
        <%-- <a href="#list-vehicle" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
        <div class="nav" role="navigation">
            <ul>
                <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
                <li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
            </ul>
        </div>
        <div id="list-vehicle" class="content scaffold-list" role="main">
            <h1><g:message code="default.list.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
                <div class="message" role="status">${flash.message}</div>
            </g:if>
            <f:table collection="${vehicleList}" />

            <div class="pagination">
                <g:paginate total="${vehicleCount ?: 0}" />
            </div>
        </div> --%>
    </body>
</html>