package org.grails.guides
import org.grails.guides.services.VehicleService

class HomeController {

    VehicleService vehicleService

   def index() {
        respond([name: session.name ?: 'User', vehicleTotal: Vehicle.count()]) 

        def vehicles = vehicleService.listAllVehicles()
        render(view:'index', model:[vehicleList: vehicles])
    }

    def updateName(String name) {
        session.name = name 

        flash.message = "Name has been updated" 

        redirect action: 'index' 
    }
    
    def save() {
        String name = params.name
        String makeName = params.make
        String modelName = params.model
        Integer year = params.int('year')

        vehicleService.save(name, makeName, modelName, year)

        redirect(action: "index")
    }

}
