package com.example.mvc20220927hyeseong.controller;


import com.example.mvc20220927hyeseong.dto.TestReqDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class pageController {

    @GetMapping("/test1")
    public String test1(Model model){
        return "test_page1";
    }

    @GetMapping("/test2")
    public String test2(){
        System.out.println("test2");
        return "test/test_page2";
    } @GetMapping("/test4")
    public String test4(Model model,TestReqDto testReqdto){
        
        System.out.println(testReqdto);

        model.addAttribute("data",testReqdto.getStrData());
        model.addAttribute("name",testReqdto.getName());
        model.addAttribute("number",testReqdto.getNumber());
        return "test/test_page4";
    }
}




