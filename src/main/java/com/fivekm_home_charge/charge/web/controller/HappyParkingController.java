package com.fivekm_home_charge.charge.web.controller;

import com.fivekm_home_charge.charge.service.HappyParkingService;
import com.fivekm_home_charge.charge.web.dto.HappyParkingDto;
import com.fivekm_home_charge.charge.web.dto.HappyParkingRequestListDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class HappyParkingController {
    @Autowired
    HappyParkingService happyParkingService;

    @GetMapping("/happyParking")
    public String happyParking(HttpSession httpSession, Model model) {
        model.addAttribute("member",httpSession.getAttribute("user"));
        return "/happyParking/happyParking";
    }

    //@GetMapping("/happyParking/{itemid}/")

    @GetMapping("/happyParking/happyParkingRegister")
    public String happyParkingRegister(HttpServletRequest request, HttpServletResponse response,
                                       Model model, HttpSession httpSession){
        System.out.println("주차장등록현재세션아이디 : " +  httpSession.getAttribute("user"));
        model.addAttribute("member",httpSession.getAttribute("user"));
        return "/happyParking/happyParkingRegister";
    }

    @GetMapping("/happyParking/happyParkingSearch")
    public String happyParkingSearch(Model model, HttpSession httpSession) throws Exception{
        model.addAttribute("user", httpSession.getAttribute("userId"));
        model.addAttribute("parking", happyParkingService.happyParkingSearch());
        return "/happyParking/happyParkingSearch";
    }

    @GetMapping("/happyParking/happyParkingSearch1")
    public String happyParkingSearch2(Model model) throws Exception{
        model.addAttribute("parking", happyParkingService.happyParkingSearch());
        return "/happyParking/happyParkingSearch2";
    }


    @GetMapping("/happyParking/happyParkingHistory")
    public String happyParkingHistory(){
        return "/happyParking/happyParkingHistory";
    }


   /* @RequestMapping(value="/happyParking/{itemid}", method = RequestMethod.GET)
    public String main(HttpSession httpSession, @PathVariable String itemid,
                       HttpServletRequest request,
                       HttpServletResponse response, Model model) throws Exception {
        model.addAttribute("member",httpSession.getAttribute("user"));
        System.out.println("itemid : " + itemid);
        if(itemid.equals("happyParkingRegister")) {
            HttpSession session = request.getSession();
            System.out.println("주차장등록현재세션아이디 : " + httpSession.getAttribute("user"));
            model.addAttribute("member", session.getAttribute("user"));
        } else if(itemid.equals("happyParkingSearch")) {
            model.addAttribute("book1", happyParkingService.happyParkingBook1());
        }

        return "/happyParking/" + itemid;
    }*/

    @GetMapping("/happyParking/requestHappyParking/{parkingName}")
    public String requestHappyParking(@PathVariable String parkingName, HttpSession httpSession, Model model) throws Exception{
        model.addAttribute("member",httpSession.getAttribute("user"));
        model.addAttribute("request", happyParkingService.requestHappyParking(parkingName));
        return "/admin/happyParkingRequest";
    }
/*
    @GetMapping("/happyParking/happyParkingRegister")
    public String happyParkingRegister(HttpServletRequest request, HttpServletResponse response,
                                       Model model){
        HttpSession session = request.getSession();
        System.out  .println("주차장등록현재세션아이디 : " +  session.getAttribute("userId"));
        model.addAttribute("user", session.getAttribute("userId"));
        return "/happyParking/happyParkingRegister";
    }

    @GetMapping("/happyParking/happyParkingSearch")
    public String happyParkingSearch(Model model) throws Exception{
        model.addAttribute("book1", happyParkingService.happyParkingBook1());
        return "/happyParking/happyParkingSearch";
    }

    @GetMapping("/happyParking/happyParkingHistory")
    public String happyParkingHistory(){
        return "/happyParking/happyParkingHistory";
    }

    @GetMapping("/admin/happyParkingRequestList")
    public String happyParkingRequestList(Model model) throws Exception{
        model.addAttribute("requestList", happyParkingService.happyParkingRequestList());
        return "/admin/happyParkingRequestList";
    }
*/



}
