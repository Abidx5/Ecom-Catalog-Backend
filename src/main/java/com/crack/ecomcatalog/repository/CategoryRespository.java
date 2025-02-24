package com.crack.ecomcatalog.repository;

import com.crack.ecomcatalog.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRespository extends JpaRepository<Category, Long> {

}
