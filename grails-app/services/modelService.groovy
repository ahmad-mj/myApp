package org.grails.guides.services
import org.grails.guides.Model
import org.grails.guides.Make
import grails.gorm.transactions.Transactional

@Transactional
class ModelService {
    def saveModel(String modelName, Make make) {
        def model = new Model(name: modelName, make: make)
        if (!model.save(flush: true)) {
            throw new RuntimeException("Failed to save model: ${model.errors}")
            model.save()
    }
    return model
}
}