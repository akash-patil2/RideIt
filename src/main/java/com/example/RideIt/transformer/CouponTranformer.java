package com.example.RideIt.transformer;


import com.example.RideIt.model.Coupon;

public class CouponTranformer {

    public static Coupon prepareCoupon(String couponCode, int discount){
        return Coupon.builder()
                .couponCode(couponCode)
                .percentageDiscount(discount)
                .build();
    }
}
