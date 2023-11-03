package ku.cs.kafe.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import jakarta.persistence.ManyToOne;


import java.util.UUID;


@Data
@Entity
public class Menu {
    @Id
    @GeneratedValue
    private UUID id;


    private String name;
    private double price;

    @ManyToOne
    private Category category;

}

/**
 ---------------------------------
 // Thanwarelee thnestummaroj
 // 6410450150
 ---------------------------------
 **/