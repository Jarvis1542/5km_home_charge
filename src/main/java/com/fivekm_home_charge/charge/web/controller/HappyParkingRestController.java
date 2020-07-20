package com.fivekm_home_charge.charge.web.controller;

import com.fivekm_home_charge.charge.service.HappyParkingService;
import com.fivekm_home_charge.charge.web.dto.HappyParkingDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.util.ArrayList;

@Controller
public class HappyParkingRestController {
    @Autowired
    HappyParkingService happyParkingService;

    @PostMapping("/rest/happyParkingRegister")
    public String insertHappyParking(HappyParkingDto happyParkingDto, HttpSession httpSession,
                                     HttpServletResponse response, Model model) throws Exception{
        System.out.println("현제세션아이디 : " + httpSession.getAttribute("member"));
        System.out.println("해피파킹디티오 : " + happyParkingDto.toString());
        model.addAttribute("member",httpSession.getAttribute("user"));
        happyParkingService.insertHappyParking(happyParkingDto);
//        response.setContentType("text/html; charset=UTF-8");
//        PrintWriter out = response.getWriter();
//        out.println("<script>alert('주차장 등록 요청') window.location.href = '/' </script>");
//        out.flush();
        return "redirect:/";
    }

    }
