package com.fivekm_home_charge.charge.web.dto;

import lombok.Data;

import java.util.Date;

@Data
public class HappyParkingSearchDto {
    private final String PARKINGIDX;
    private final String PARKINGNAME;
    private final String PARKINGTYPE;
    private final int MIN30FEE;
    private final int ADDMIN10FEE;
    private final int PLACE;
    private final String SAMPLE4_POSTCODE;
    private final String SAMPLE4_ROADADDRESS;
    private final String SAMPLE4_JIBUNADDRESS;
    private final String SAMPLE4_DETAILADDRESS;
    private final String SAMPLE4_EXTRAADDRESS;
    private final double LAT;
    private final double LNG;
    private final String DAYTIME;
    private final String WEETIME;
    private final String HOLTIME;
    private final String APTMAP;
    private final String PARKINGPIC;
    private final String ID;
    private final Date PARKINGDATE;
}
