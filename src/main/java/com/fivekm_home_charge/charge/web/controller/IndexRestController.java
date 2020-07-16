package com.fivekm_home_charge.charge.web.controller;

import com.fivekm_home_charge.charge.service.MemberService;
import com.fivekm_home_charge.charge.web.dto.LoginDTO;
import com.fivekm_home_charge.charge.web.dto.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class IndexRestController {
    @Autowired
    MemberService memberService;

    @PostMapping("/rest/join")
    public void insertMembers(MemberDto memberDto, HttpSession httpSession) throws Exception {
        memberService.insertMembers(memberDto);
    }

    @PostMapping("/rest/checkId")
    public void checkId(String id){
        System.out.println("CON");
        memberService.checkId(id);
    }

    @PostMapping("/rest/login")
    public void login(LoginDTO loginDTO, Model model, HttpSession httpSession) throws Exception{
        httpSession.setAttribute("user", memberService.login(loginDTO));
        model.addAttribute("member", httpSession.getAttribute("user"));
        System.out.println("세션에 대한 정보"+ httpSession.getAttribute("user"));
       
    }
}
