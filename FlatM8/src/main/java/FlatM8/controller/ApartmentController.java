package FlatM8.controller;

import FlatM8.model.Apartment;
import FlatM8.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apartments")
public class ApartmentController {

    @Autowired
    private ApartmentService apartmentService;

    @GetMapping
    public List<Apartment> getAllApartments() {
        return this.apartmentService.getAllApartments();
    }

    @GetMapping("/{apartmentId}")
    public Apartment getApartmentById(@RequestParam("apartmentId") String apartmentId) {
        return this.apartmentService.getApartmentById(apartmentId);
    }

    @PostMapping
    public ResponseEntity<Apartment> createApartment(@RequestBody Apartment apartment) {
        return ResponseEntity.ok(this.apartmentService.createApartment(apartment));
    }

    @DeleteMapping
    public void deleteApartment(@RequestParam("apartmentId") String apartmentId) {
        this.apartmentService.deleteApartment(apartmentId);
    }
}
