package com.fivekm_home_charge.charge.web.controller;

import com.fivekm_home_charge.charge.service.HappyParkingService;
import com.fivekm_home_charge.charge.service.MemberService;
import com.fivekm_home_charge.charge.web.dto.LoginDTO;
import com.fivekm_home_charge.charge.web.dto.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
//    private ArrayList<MemberDto> list;
    @Autowired
    MemberService memberService;
    @Autowired
    HappyParkingService happyParkingService;

    public IndexController() {
//        list = new ArrayList<>();
//        MemberDto m1 = new MemberDto("u1", "1111", "u1@naevr.com");
//        MemberDto m2 = new MemberDto("u2", "2222", "u2@naevr.com");
//        MemberDto m3 = new MemberDto("u3", "3333", "u3@naevr.com");
//        list.add(m1);
//        list.add(m2);
//        list.add(m3);
    }

    @RequestMapping(value="/{itemid}", method = RequestMethod.GET)
    public String main(HttpSession httpSession, @PathVariable String itemid){
        System.out.println("index item id : " + itemid);
        System.out.println("현재세션유저아이디 : " + httpSession.getAttribute("user"));
        return "/" + itemid;
    }
    @RequestMapping(value="/index/{itemid}", method = RequestMethod.GET)
    public String index_main(HttpSession httpSession, @PathVariable String itemid){
        System.out.println("index item id : " + itemid);
        System.out.println("현재세션유저아이디 : " + httpSession.getAttribute("user"));
        return "/index/" + itemid;
    }
    @GetMapping({"/"})
    public String index(Model model, HttpSession httpSession) {
        httpSession.getAttribute("user");
        System.out.println("현제 세션 정보 : " + httpSession.getAttribute("user"));
        model.addAttribute("member",httpSession.getAttribute("user"));
        return "/index/index";
    }


    /*
    @GetMapping("/index/join")
    public String join() {
        return "/index/join";
    }

    @GetMapping("/index/login")
    public String login(){
        return "/index/login";
    }
    */

    @GetMapping("/index/login")
    public String login(HttpSession httpSession, Model model) throws Exception{
        System.out.println("세션정보 : " + httpSession.getAttribute("user"));
        model.addAttribute("member",httpSession.getAttribute("user"));
        return "/index/login";
    }

    @GetMapping("/logout")
    public String logout(HttpSession httpSession){
        httpSession.invalidate();
        return "redirect:/";
    }
/*
    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @GetMapping("/modal")
    public String modal(){
        return "/index/modal";
    }
*/
    @GetMapping("/multimodal")
    public String multimodal(@RequestParam String parkingName, Model model) throws Exception{
        model.addAttribute("book1", happyParkingService.happyParkingBook1());
        return "/index/multimodal";
    }
/*
    @GetMapping("/about")
    public String about(){
        return "/about";
    }


    @GetMapping
    public String pay(){
        return "/pay";
    }

 */
}
