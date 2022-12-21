package uz.bakhromjon.hibernatespecification.region;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Region {
    @Id
    private Long id;
    private String name;

}