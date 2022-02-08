package com.simbirsoft.test.parsing.persistence.repository;

import com.simbirsoft.test.parsing.persistence.POs.SitePO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiteRepository extends CrudRepository<SitePO, Long> {
}
