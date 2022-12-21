package uz.bakhromjon.hibernatespecification.template;

/**
 * @author : Bakhromjon Khasanboyev
 **/

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.bakhromjon.hibernatespecification.region.Region;

import java.time.LocalDateTime;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Template {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Region region;
    private Double val;
    private String phoneNumber;
    private LocalDateTime date;
    @Enumerated(EnumType.STRING)
    private ETemplateType templateType;
}
