package com.fivekm_home_charge.charge.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class OtherServiceController {

    @RequestMapping(value="/otherService/{itemid}", method = RequestMethod.GET)
    public String main(HttpSession httpSession, @PathVariable String itemid){
        System.out.println(itemid);
        System.out.println("페이지 접속 시도 : SCS 등록("+itemid+"");
        System.out.println("현재세션유저아이디 : " + httpSession.getAttribute("userId"));
        return "/otherService/" + itemid;
    }
    @GetMapping("/otherService")
    public String otherService() {
        return "/otherService/otherService";
    }
/*
    @GetMapping("/otherService/parkingMap")
    public String ParkingMap() {
        return "/otherService/parkingMap";
    }

    @GetMapping("/otherService/EZCharging")
    public String EZCharging() {
        return "/otherService/EZCharging";
    }

    @GetMapping("/otherService/QnA")
    public String QnA() {
        return "/otherService/QnA";
    }

    @GetMapping("/otherService/bestQnA")
    public String bestQnA() {
        return "/otherService/bestQnA";
    }

 */
}
