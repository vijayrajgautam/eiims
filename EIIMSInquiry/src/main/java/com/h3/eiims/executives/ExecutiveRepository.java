package com.h3.eiims.executives;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExecutiveRepository extends CrudRepository<Executive, Integer>{

	
}
