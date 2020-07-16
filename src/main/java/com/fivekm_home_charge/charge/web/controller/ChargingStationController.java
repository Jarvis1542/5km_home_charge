package com.fivekm_home_charge.charge.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

@Controller
public class ChargingStationController {


    //@GetMapping("/chargingStation/{itemid}")
    @RequestMapping(value="/chargingStation/{itemid}", method = RequestMethod.GET)
    public String main(HttpSession httpSession, @PathVariable String itemid){
        System.out.println(itemid);
        System.out.println("페이지 접속 시도 : SCS 등록("+itemid+"");
        System.out.println("현재세션유저아이디 : " + httpSession.getAttribute("userId"));
        return "/chargingStation/" + itemid;
    }

    @GetMapping("/chargingStation")
    public String chargingStation() {
        return "/chargingStation/chargingStation";
    }
/*
    @GetMapping("/chargingStation/index")
    public String chargingStationIndex() {
        return "/chargingStation/index";
    }

    @GetMapping("/chargingStation/chargingRegister")
    public String chargingRegister(){
        System.out.println("페이지 접속 시도 : SCS 등록(chargingRegister)");
        return "/chargingStation/chargingRegister";
    }

    @GetMapping("/chargingStation/chargingSearch")
    public String chargingSearch(){
        System.out.println("페이지 접속 시도 : SCS 찾기(chargingSearch)");
        return "/chargingStation/chargingSearch";
    }

    @GetMapping("/chargingStation/chargingHistory")
    public String chargingHistory(){
        System.out.println("페이지 접속 시도 : SCS 내역(chargingHistory)");
        return "/chargingStation/chargingHistory";
    }

    @GetMapping("/chargingStation/upload")
    public String upload(){
        System.out.println("페이지 접속 시도 : SCS 등록(upload)");
        return "/chargingStation/upload";
    }
*/
}
