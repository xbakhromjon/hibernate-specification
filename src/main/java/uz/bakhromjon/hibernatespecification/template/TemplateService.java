package uz.bakhromjon.hibernatespecification.template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import uz.bakhromjon.hibernatespecification.specification.PageableRequest;
import uz.bakhromjon.hibernatespecification.specification.SearchSpecification;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Service
public class TemplateService {
    @Autowired
    private TemplateRepository repository;

    public Page<Template> filter(PageableRequest pageableRequest) {
        SearchSpecification<Template> spec = new SearchSpecification<>(pageableRequest.getSearch());
        Page<Template> list = null;
        if (pageableRequest.getSort() != null) {
            list = repository.findAll(spec, PageRequest.of(pageableRequest.getPage(),
                    pageableRequest.getPerPage(), getSort(pageableRequest)));
        } else {
            list = repository.findAll(spec, PageRequest.of(pageableRequest.getPage(),
                    pageableRequest.getPerPage()));
        }
        return list;
    }

    private Sort getSort(PageableRequest pageableRequest) {
        if (pageableRequest.getSort() == null) {
            return null;
        }
        if (pageableRequest.getSort().getDirection().equals("asc")) {
            return Sort.by(Sort.Order.asc(pageableRequest.getSort().getName()));
        } else {
            return Sort.by(Sort.Order.desc(pageableRequest.getSort().getName()));
        }
    }
}
