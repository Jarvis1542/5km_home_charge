package com.fivekm_home_charge.charge.mapper;

import com.fivekm_home_charge.charge.web.dto.*;

import java.util.ArrayList;

public interface HappyParkingMapper {
    public void insertHappyParking(HappyParkingDto happyParkingDto) throws Exception;
    public HappyParkingRequestLDto requestHappyParking(String parkingName) throws Exception;
    public ArrayList<HappyParkingRequestListDto> happyParkingRequestList() throws Exception;
    public HappyParkingBookDto1 happyParkingBook1() throws Exception;
    public void updateLatLng(LatLngDto latLngDto) throws Exception;
    public void upadteComplete(HappyParkingDto happyParkingDto) throws Exception;
    public ArrayList<HappyParkingSearchDto> happyParkingSearch() throws Exception;
    public HappyParkingSearchDto selectParkingName(String parkingName) throws Exception;
}
