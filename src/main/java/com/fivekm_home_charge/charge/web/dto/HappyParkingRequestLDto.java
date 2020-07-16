package com.fivekm_home_charge.charge.web.dto;

import lombok.Data;

@Data
public class HappyParkingRequestLDto {
    private final String parkingName;
    private final String parkingType;
    private final String min30Fee;
    private final String addMin10Fee;
    private final String place;
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
}
