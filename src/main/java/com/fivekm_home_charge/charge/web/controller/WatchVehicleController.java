package com.fivekm_home_charge.charge.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WatchVehicleController {
    @GetMapping("/watchVehicle")
    public String watchVehicle() {
        return "/watchVehicle/watchVehicle";
    }
}
