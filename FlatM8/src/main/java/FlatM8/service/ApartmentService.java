package FlatM8.service;

import FlatM8.repository.ApartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ApartmentService {

    @Autowired
    public ApartmentService(ApartmentRepository apartmentRepository) {
    }
}
