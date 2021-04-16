package com.tiagogomes.ecommerce.checkout.service;

import com.tiagogomes.ecommerce.checkout.entity.CheckoutEntity;
import com.tiagogomes.ecommerce.checkout.resource.checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);

    Optional<CheckoutEntity> updateStatus(String checkoutCode, CheckoutEntity.Status status);
}
