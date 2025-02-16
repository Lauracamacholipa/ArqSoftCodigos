package com.ucb.reservation.service.domain.vo;

import java.util.UUID;

public class CarId {
    private UUID id;
    private CarId(UUID id){
        this.id=id;
    }
    public CarId withId(String id){
        return new CarId(UUID.fromString(id));
    }
    public static CarId withoutId(){
        return new CarId(UUID.randomUUID());
    }
}
