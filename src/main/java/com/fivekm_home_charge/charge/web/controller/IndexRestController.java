package com.fivekm_home_charge.charge.web.controller;

import com.fivekm_home_charge.charge.service.MemberService;
import com.fivekm_home_charge.charge.web.dto.LoginCheckDto;
import com.fivekm_home_charge.charge.web.dto.LoginDTO;
import com.fivekm_home_charge.charge.web.dto.Map1Dto;
import com.fivekm_home_charge.charge.web.dto.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
    public int checkId(LoginCheckDto loginCheckDto){
        System.out.println("아이디 중복체크: "+loginCheckDto.toString());
        return memberService.checkId(loginCheckDto);
    }

    @GetMapping("/rest/map/map1")
    public String insertData(Map1Dto map1Dto) throws Exception{
        map1Dto.toString();
        System.out.println("lat : " + map1Dto.getLat());
        System.out.println("lng : " + map1Dto.getLng());
        return "redirect:/";
    }

    @PostMapping("/rest/login")
    public Object login(LoginDTO loginDTO, Model model, HttpSession httpSession) throws Exception{
        httpSession.setAttribute("user", memberService.login(loginDTO));
        model.addAttribute("member", httpSession.getAttribute("user"));
        System.out.println("세션에 대한 정보"+ httpSession.getAttribute("user"));
        if(httpSession.getAttribute("user") == null) {
            return "로그인 실패";
        } else {
            return "로그인 성공";
        }

    }
}
