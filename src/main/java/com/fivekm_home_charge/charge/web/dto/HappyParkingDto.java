package com.fivekm_home_charge.charge.web.dto;

import lombok.Data;

import java.util.Date;

@Data
public class HappyParkingDto {
    private String parkingName;
    private String parkingType;
    private int min30Fee;
    private int addMin10Fee;
    private int place;
    private String sample4_postcode;
    private String sample4_roadAddress;
    private String sample4_jibunAddress;
    private String sample4_detailAddress;
    private String sample4_extraAddress;
    private String dayTime;
    private String weeTime;
    private String holTime;
    private String aptMap;
    private String parkingPic;
    private String id;
    private Date parkingDate;
}
