package org.grails.guides
import org.grails.guides.services.MakeService
import org.grails.guides.services.ModelService
import org.grails.guides.services.VehicleService

class BootStrap {

    MakeService makeService
    ModelService modelService
    VehicleService vehicleService
    
    def init = { servletContext ->
        vehicleService.save("Pickup", "Toyota", "Titan", 2020)
    }
    def destroy = {
    }
}
