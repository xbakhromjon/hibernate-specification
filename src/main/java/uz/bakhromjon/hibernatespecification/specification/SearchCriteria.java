package uz.bakhromjon.hibernatespecification.specification;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author : Ahrorjon Isroilov
 * @project : nomakler
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SearchCriteria {
    @Schema(description = "ключ", example = "name")
    private String key;

    @Pattern(regexp = "^(^(!=)?|^(<=)?|^(>=)?|^(=)?|^(<)?|^(>)?)$")
    @Schema(description = "Операция", example = "=")
    private String operation;

    @Schema(description = "Значение", example = "John")
    private Object value;
}
