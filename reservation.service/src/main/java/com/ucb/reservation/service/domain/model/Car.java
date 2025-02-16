package com.ucb.reservation.service.domain.model;

import com.ucb.reservation.service.domain.vo.CarId;
import com.ucb.reservation.service.domain.vo.CarModel;
import com.ucb.reservation.service.domain.vo.LicencePlateNumber;
import com.ucb.reservation.service.domain.vo.Manufacturer;
import lombok.Data;

@Data
public class Car {
    private CarId id;
    private Manufacturer manufacturer;
    private LicencePlateNumber licencePlateNumber;
    private CarModel model;

}
