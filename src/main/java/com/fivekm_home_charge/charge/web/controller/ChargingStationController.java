package com.fivekm_home_charge.charge.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

@Controller
public class ChargingStationController {

//    @RequestMapping(value="/chargingStation/{itemid}", method = RequestMethod.GET)
//    public String main(Model model, HttpSession httpSession, @PathVariable String itemid){
//        model.addAttribute("member",httpSession.getAttribute("user"));
//        System.out.println(itemid);
//        System.out.println("페이지 접속 시도 : chargingStation/" + itemid);
//        System.out.println("현재세션유저아이디 : " + httpSession.getAttribute("userId"));
//        return "/chargingStation/" + itemid;
//    }

    @GetMapping("/chargingStation/chargingRegister")
    public String chargingRegister(Model model, HttpSession httpSession){
        return "/chargingStation/chargingRegister";
    }

    @GetMapping("/chargingStation/chargingSearch")
    public String chargingSearch(Model model, HttpSession httpSession){
        return "/chargingStation/chargingSearch";
    }

    @GetMapping("/chargingStation/chargingHistory")
    public String chargingHistory(Model model, HttpSession httpSession){
        return "/chargingStation/chargingHistory";
    }

}
