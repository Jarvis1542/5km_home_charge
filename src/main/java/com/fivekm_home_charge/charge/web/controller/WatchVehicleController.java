package com.fivekm_home_charge.charge.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class WatchVehicleController {
    @GetMapping("/watchVehicle")
    public String watchVehicle(HttpSession httpSession, Model model)
    {
        model.addAttribute("member",httpSession.getAttribute("user"));
        return "/watchVehicle/watchVehicle";
    }
}
