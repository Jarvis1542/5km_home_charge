package com.fivekm_home_charge.charge.mapper;

import com.fivekm_home_charge.charge.web.dto.HappyParkingBookDto1;
import com.fivekm_home_charge.charge.web.dto.HappyParkingDto;
import com.fivekm_home_charge.charge.web.dto.HappyParkingRequestLDto;
import com.fivekm_home_charge.charge.web.dto.HappyParkingRequestListDto;

import java.util.ArrayList;

public interface HappyParkingMapper {
    public void insertHappyParking(HappyParkingDto happyParkingDto) throws Exception;
    public HappyParkingRequestLDto requestHappyParking(String parkingName) throws Exception;
    public ArrayList<HappyParkingRequestListDto> happyParkingRequestList() throws Exception;
    public HappyParkingBookDto1 happyParkingBook1() throws Exception;
}
