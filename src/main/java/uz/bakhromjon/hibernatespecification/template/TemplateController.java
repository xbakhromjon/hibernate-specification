package uz.bakhromjon.hibernatespecification.template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.bakhromjon.hibernatespecification.specification.PageableRequest;


import java.util.List;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@RestController
@RequestMapping("/template")
public class TemplateController {
    @Autowired
    private TemplateService service;

    @PostMapping("/filter")
    public Page<Template> filter(@RequestBody PageableRequest pageableRequest) {
        return service.filter(pageableRequest);
    }
}
