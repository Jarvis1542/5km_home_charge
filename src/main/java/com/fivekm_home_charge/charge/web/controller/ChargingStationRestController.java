package com.fivekm_home_charge.charge.web.controller;

import com.fivekm_home_charge.charge.service.ChargingStationService;
import com.fivekm_home_charge.charge.web.dto.ChargingStationSaveDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

@RestController
public class ChargingStationRestController {

    @Autowired
    ChargingStationService chargingStationService;

    public static String uploadpath = "D:\\uploadTest\\";

    @PostMapping("/scs/rest/save")
    public void insertChargingStation(ChargingStationSaveDto chargingStationSaveDto, HttpSession httpSession, MultipartFile file1, MultipartFile file2)
            throws Exception {
        httpSession.getAttribute("userId");

        try{
            file1.transferTo(new File(uploadpath + file1.getOriginalFilename()));
            file2.transferTo(new File(uploadpath + file2.getOriginalFilename()));
            chargingStationSaveDto.setImage1(uploadpath + file1.getOriginalFilename());
            chargingStationSaveDto.setImage2(uploadpath + file2.getOriginalFilename());
            chargingStationService.insertChargingStation(chargingStationSaveDto);
        } catch (IllegalStateException | IOException e){
            e.printStackTrace();
        }

        System.out.println(chargingStationSaveDto.toString());
//        System.out.println(file1.getOriginalFilename() + "/" + file2.getOriginalFilename());
//        System.out.println("충전소 이름" + chargingStationSaveDto.getChargeName());
//        System.out.println("운영기관" + chargingStationSaveDto.getOperation());
//        System.out.println("운영시간" + chargingStationSaveDto.getOperationTime());
//        System.out.println("충전 속도" + chargingStationSaveDto.getChargeSpeed());
//        System.out.println("우편번호" + chargingStationSaveDto.getPostcode());
//        System.out.println("도로주소" + chargingStationSaveDto.getRoadAddress());
//        System.out.println("상세주소" + chargingStationSaveDto.getDetailAddress());
//        System.out.println("참고항목" + chargingStationSaveDto.getExtraAddress());
//        System.out.println("사진1" + chargingStationSaveDto.getImage1());
//        System.out.println("사진2" + chargingStationSaveDto.getImage2());
//        System.out.println("케이블" + chargingStationSaveDto.getCable());
//        System.out.println("충전 타입" + chargingStationSaveDto.getChargeType());


    }
}
