package com.tiagogomes.ecommerce.checkout.repository;

import com.tiagogomes.ecommerce.checkout.entity.CheckoutEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CheckoutRepository extends JpaRepository<CheckoutEntity, Long> {

    Optional<CheckoutEntity> findByCode(String code);
}
