package FlatM8.service;

import FlatM8.model.Apartment;
import FlatM8.repository.ApartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;

public class ApartmentService {

    private ApartmentRepository apartmentRepository;
    @Autowired
    public ApartmentService(ApartmentRepository apartmentRepository) {
    }


    public List<Apartment> getAllApartments() {
        return this.apartmentRepository.findAll();
    }

    public Apartment getApartmentById(String apartmentId) {
        return this.apartmentRepository.findById(UUID.fromString(apartmentId)).orElse(null);
    }
}
