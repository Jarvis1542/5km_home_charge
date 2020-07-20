package com.fivekm_home_charge.charge.web.controller;

import com.fivekm_home_charge.charge.service.HappyParkingService;
import com.fivekm_home_charge.charge.web.dto.HappyParkingDto;
import com.fivekm_home_charge.charge.web.dto.LatLngDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class AdminRestController {

    @Autowired
    private HappyParkingService happyParkingService;

    @PostMapping("/admin/rest/happyParkingRequest")
    public void updateLatLng(LatLngDto latLngDto) throws Exception{
        System.out.println(latLngDto.toString());
        happyParkingService.updateLatLng(latLngDto);
    }

    @PostMapping("/admin/happyParkingRequestList")
    public String happyParkingUpdateComplete(HappyParkingDto happyParkingDto, HttpSession httpSession, Model model) throws Exception{
        System.out.println(happyParkingDto.toString());
        model.addAttribute("member",httpSession.getAttribute("user"));
        return "/admin/happyParkingRequestList";
    }
}