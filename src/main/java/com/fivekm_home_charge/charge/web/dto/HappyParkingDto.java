package com.fivekm_home_charge.charge.web.dto;

import lombok.Data;

import java.util.Date;

@Data
public class HappyParkingDto {
    private final String parkingName;
    private final String parkingType;
    private final int min30Fee;
    private final int addMin10Fee;
    private final int place;
    private final String sample4_postcode;
    private final String sample4_roadAddress;
    private final String sample4_jibunAddress;
    private final String sample4_detailAddress;
    private final String sample4_extraAddress;
    private final String dayTime;
    private final String weeTime;
    private final String holTime;
    private final String aptMap;
    private final String parkingPic;
    private final String id;
    private final Date parkingDate;
}
