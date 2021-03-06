package com.fivekm_home_charge.charge.web.controller;

import com.fivekm_home_charge.charge.service.HappyParkingService;
import com.fivekm_home_charge.charge.service.MemberService;
import com.fivekm_home_charge.charge.web.dto.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class AdminController {
    @Autowired
    private MemberService memberService;
    @Autowired
    private HappyParkingService happyParkingService;

    @GetMapping("/admin/chargingRequest")
    public String chargingRequest(Model model, HttpSession httpSession){
        model.addAttribute("member",httpSession.getAttribute("user"));
        return "/admin/chargingRequest";
    }

    @GetMapping("/admin/happyParkingRequest")
    public String happyParkingRequest(Model model, HttpSession httpSession){
        model.addAttribute("member",httpSession.getAttribute("user"));
        return "/admin/happyParkingRequest";
    }

    @GetMapping("/admin/happyParkingRequestList")
    public String happyParkingRequestList(Model model, HttpSession httpSession) throws Exception{
        model.addAttribute("member",httpSession.getAttribute("user"));
        model.addAttribute("requestList", happyParkingService.happyParkingRequestList());
        return "/admin/happyParkingRequestList";
    }

    @GetMapping("/admin/memberList")
    public String memberList(Model model, HttpSession httpSession) throws Exception {
        model.addAttribute("member",httpSession.getAttribute("user"));
        model.addAttribute("users",memberService.getMembers());
        System.out.println(memberService.getMembers());
        return "/admin/memberList";
    }
}
