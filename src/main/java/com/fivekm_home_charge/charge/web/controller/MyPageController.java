package com.fivekm_home_charge.charge.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class MyPageController {

    @GetMapping("/myPage")
    public String myPage(HttpSession httpSession, Model model) {
        model.addAttribute("member",httpSession.getAttribute("user"));
        return "/myPage/myPage";
    }

    @GetMapping("/myPage/memberEdit")
    public String memberEdit(HttpSession httpSession, Model model) {
        model.addAttribute("member",httpSession.getAttribute("user"));
        return "/myPage/memberEdit";
    }

    @GetMapping("/myPage/bookmark")
    public String bookmark(HttpSession httpSession, Model model) {
        model.addAttribute("member",httpSession.getAttribute("user"));
        return "/myPage/bookmark";
    }

    @GetMapping("/myPage/history")
    public String history(HttpSession httpSession, Model model)
    {
        model.addAttribute("member",httpSession.getAttribute("user"));
        return "/myPage/history";
    }
}
