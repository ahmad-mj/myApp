package org.grails.guides
import org.grails.guides.services.MakeService
import org.grails.guides.services.ModelService
import org.grails.guides.services.VehicleService

class BootStrap {

    MakeService makeService
    ModelService modelService
    VehicleService vehicleService
    def init = { servletContext ->
// Create Makes
    def toyota = makeService.saveMake('Toyota')
    def volkswagen = makeService.saveMake('Volkswagen')
// Create Models
    def titan = modelService.saveModel('Titan', toyota)
    def leaf = modelService.saveModel('Leaf', toyota)
    def windstar = modelService.saveModel('Windstar', volkswagen)
// Create Vehicles
    vehicleService.save('Pickup', toyota, titan, 2020)
    vehicleService.save('Kombi', volkswagen, windstar, 2021)
    vehicleService.save('Sedan', toyota, leaf, 2019)

    }
    def destroy = {
    }
}
