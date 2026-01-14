package FlatM8.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Apartment {
    @Id
    @GeneratedValue
    private UUID apartmentId;
    private String name;
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;
    private String address;
    private String city;
    private String country;
    private Double price;
    private String description;

}
