package com.fivekm_home_charge.charge.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyPageController {

    @GetMapping("/myPage")
    public String myPage() {
        return "/myPage/myPage";
    }

    @GetMapping("/myPage/memberEdit")
    public String memberEdit() {
        return "/myPage/memberEdit";
    }

    @GetMapping("/myPage/bookmark")
    public String bookmark() {
        return "/myPage/bookmark";
    }

    @GetMapping("/myPage/history")
    public String history() {
        return "/myPage/history";
    }
}
