package uz.bakhromjon.hibernatespecification.specification;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

/**
 * @author : Ahrorjon Isroilov
 * @project : nomakler
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Sort  {
    @Schema(description = "Имя полей", example = "modifiedDate")
    private String name = "modifiedDate";

    @Schema(description = "Сортировать по направлению", example = "desc")
    private String direction = "asc";
}
