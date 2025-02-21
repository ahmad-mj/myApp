package org.grails.guides

class HomeController {


   def index() {
        respond([name: session.name ?: 'User', vehicleTotal: Vehicle.count()]) 

        def vehicles = Vehicle.list()
        render(view:'index', model:[vehicleList: vehicles])
    }

    def updateName(String name) {
        session.name = name 

        flash.message = "Name has been updated" 

        redirect action: 'index' 
    }

}
