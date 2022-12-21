package uz.bakhromjon.hibernatespecification.specification;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import lombok.*;

import java.util.List;

/**
 * @author : Ahrorjon Isroilov
 * @project : nomakler
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PageableRequest {
    @Schema(description = "На страницу", example = "10")
    private int perPage = 10;

    @Schema(description = "Страница", example = "1")
    private int page = 0;

    @Schema(description = "Сортировать данные")
    private Sort sort = new Sort();

    @Valid
    private List<SearchCriteria> search;
}
