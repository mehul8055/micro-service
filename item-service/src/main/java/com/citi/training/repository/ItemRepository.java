package com.citi.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.citi.training.model.Item;

/**
 * @author Admin
 *
 */
@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{

}
