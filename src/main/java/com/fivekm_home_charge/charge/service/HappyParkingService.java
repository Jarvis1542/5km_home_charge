package com.fivekm_home_charge.charge.service;

import com.fivekm_home_charge.charge.mapper.HappyParkingMapper;
import com.fivekm_home_charge.charge.web.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class HappyParkingService {
    @Autowired(required = false)
    private HappyParkingMapper happyParkingMapper;

    public void insertHappyParking(HappyParkingDto happyParkingDto) throws Exception{
        happyParkingMapper.insertHappyParking(happyParkingDto);
    }

    public HappyParkingRequestLDto requestHappyParking(String parkingName) throws Exception{
        return happyParkingMapper.requestHappyParking( parkingName);
    }

    public ArrayList<HappyParkingRequestListDto> happyParkingRequestList() throws Exception{
        return happyParkingMapper.happyParkingRequestList();
    }

    public HappyParkingBookDto1 happyParkingBook1() throws Exception{
        return happyParkingMapper.happyParkingBook1();
    }

    public void updateLatLng(LatLngDto latLngDto) throws Exception{
        happyParkingMapper.updateLatLng(latLngDto);
    }

    public void upadteComplete(HappyParkingDto happyParkingDto) throws Exception{
        happyParkingMapper.upadteComplete(happyParkingDto);
    }

    public ArrayList<HappyParkingSearchDto> happyParkingSearch() throws Exception{
        return happyParkingMapper.happyParkingSearch();
    }

    public HappyParkingSearchDto selectParkingName(String parkingName) throws Exception{
        System.out.println("서비스 : " + parkingName);
        return happyParkingMapper.selectParkingName(parkingName);
    }
}