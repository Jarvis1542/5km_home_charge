package com.fivekm_home_charge.charge.mapper;

import com.fivekm_home_charge.charge.web.dto.ChargingStationSaveDto;

public interface ChargingMapper {
    public void insertChargingStation(ChargingStationSaveDto chargingStationSaveDto) throws Exception;
}
