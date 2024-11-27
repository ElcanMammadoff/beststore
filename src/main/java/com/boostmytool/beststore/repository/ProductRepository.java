package com.boostmytool.beststore.repository;

import com.boostmytool.beststore.model.dto.ProductDto;
import com.boostmytool.beststore.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {


}
