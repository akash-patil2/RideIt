package com.example.RideIt.service;


import com.example.RideIt.model.Coupon;
import com.example.RideIt.repository.CouponRepository;
import com.example.RideIt.transformer.CouponTranformer;
import org.springframework.stereotype.Service;

@Service
public class CouponService {


    private final CouponRepository couponRepository;

    public CouponService(CouponRepository couponRepository) {
        this.couponRepository = couponRepository;
    }


    public String addCoupon(String couponCode, int discount) {

        Coupon coupon = CouponTranformer.prepareCoupon(couponCode, discount);
        couponRepository.save(coupon);
        return "Coupon added successfully!!";
    }
}
