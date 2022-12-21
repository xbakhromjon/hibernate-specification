package uz.bakhromjon.hibernatespecification.region;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Repository
public interface RegionRepository extends JpaRepository<Region, Long>,
        JpaSpecificationExecutor<Region> {
    List<Region> findAll(Specification<Region> spec);

    Page<Region> findAll(Specification<Region> spec, Pageable pageable);

    List<Region> findAll(Specification<Region> spec, Sort sort);
}
