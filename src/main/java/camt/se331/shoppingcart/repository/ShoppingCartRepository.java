package camt.se331.shoppingcart.repository;

import camt.se331.shoppingcart.entity.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by liuyahong on 2016/3/28.
 */
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart,Long> {
        }

