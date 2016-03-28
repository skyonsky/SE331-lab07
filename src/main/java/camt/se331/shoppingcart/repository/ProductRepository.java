package camt.se331.shoppingcart.repository;

import camt.se331.shoppingcart.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Dto on 2/7/2015.
 */
public interface ProductRepository extends JpaRepository<Product,Long> {
    public List<Product> findByNameLike(String name);
    public List<Product> findByNameOrDescriptionContainingIgnoreCase(String name,String description);
}

