package org.grails.guides.services
import org.grails.guides.Make
import org.grails.guides.Model
import org.grails.guides.Vehicle
import grails.gorm.transactions.Transactional

@Transactional
class VehicleService {
    def getVehicleDetails() {
        return "Example Vehicle Details"
    }

    def save(String name, String makeName, String modelName, Integer year) {
            def make = Make.findByName(makeName) ?: new Make(name: makeName).save(flush: true)
            def model = Model.findByNameAndMake(modelName, make) ?: new Model(name: modelName, make: make).save(flush: true)
            def vehicle = new Vehicle(name: name, make: make, model: model, year: year)

        if (!vehicle.save(flush: true)) {
            throw new RuntimeException("Failed to save vehicle: ${vehicle.errors}")
        }
        return vehicle
     }

     def listAllVehicles() {
        Vehicle.list()
    }
    
     def getVehicle(Long id) {
        Vehicle.get(id)
    }
}
