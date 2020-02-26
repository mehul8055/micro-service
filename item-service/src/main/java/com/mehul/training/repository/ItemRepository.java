package com.mehul.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mehul.training.model.Item;

/**
 * 
 * @author mehul8055
 *
 */
@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{

}
