package com.aashray.food.dto;

import com.aashray.food.entity.FoodType;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Positive;

import java.time.LocalDateTime;

public record UpdateDonationRequest(
        String foodName,

        @Positive
        Integer quantity,

        String quantityUnit,

        FoodType foodType,

        LocalDateTime preparedTime,

        @Future(message = "Expiry time must be in the future")
        LocalDateTime expiryTime,

        String pickupAddress,

        String city,

        String contactNumber
) {}
