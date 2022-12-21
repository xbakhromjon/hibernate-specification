package uz.bakhromjon.hibernatespecification.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import uz.bakhromjon.hibernatespecification.region.Region;
import uz.bakhromjon.hibernatespecification.region.RegionRepository;

import java.util.List;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    private RegionRepository regionRepository;

    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String ddl;

    @Override
    public void run(String... args) throws Exception {
        if (ddl.contains("create")) {
            Region reg1 = new Region(1L, "namangan");
            Region reg2 = new Region(2L, "tashkent");
            Region reg3 = new Region(3L, "fergana");
            regionRepository.saveAll(List.of(reg1, reg2, reg3));
        }
    }
}
