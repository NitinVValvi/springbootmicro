package com.cjc.main.homerepo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Customer;

@Repository
public interface HomeRepository extends CrudRepository<Customer, Integer>{

}
