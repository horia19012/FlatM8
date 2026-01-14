package FlatM8.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
    private UUID apartmentId;
    private String name;
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;
    private String address;
    private String description;

}
