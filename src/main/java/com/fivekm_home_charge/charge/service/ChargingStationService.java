package com.fivekm_home_charge.charge.service;

import com.fivekm_home_charge.charge.mapper.ChargingMapper;
import com.fivekm_home_charge.charge.web.dto.ChargingStationSaveDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ChargingStationService {

    @Autowired(required = false)
    ChargingMapper chargingMapper;

    public void insertChargingStation(ChargingStationSaveDto chargingStationSaveDto) throws Exception {
        chargingMapper.insertChargingStation(chargingStationSaveDto);
    }
}
