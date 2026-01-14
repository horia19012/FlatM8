package FlatM8.controller;

import FlatM8.model.Apartment;
import FlatM8.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/apartments")
public class ApartmentController {

    @Autowired
    private ApartmentService apartmentService;

    @GetMapping
    public List<Apartment> getAllApartments() {
        return this.apartmentService.getAllApartments();
    }

    @GetMapping
    public Apartment getApartmentById(@RequestParam("apartmentId") String apartmentId) {
       return this.apartmentService.getApartmentById(apartmentId);
    }
}
