package uz.bakhromjon.hibernatespecification.template;

import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import uz.bakhromjon.hibernatespecification.region.Region;

import java.util.List;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Repository
@Transactional
public interface TemplateRepository extends JpaRepository<Template, Long>, JpaSpecificationExecutor<Template> {
    List<Template> findAll(Specification<Template> spec);

    Page<Template> findAll(Specification<Template> spec, Pageable pageable);

    List<Template> findAll(Specification<Template> spec, Sort sort);
}
