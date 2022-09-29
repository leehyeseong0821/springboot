package com.example.mvc20220927hyeseong.controller.api;

import com.example.mvc20220927hyeseong.dto.UserReDto;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
public class UserTestApi {

    @ResponseBody
    @PostMapping("/api/test/user/param")
  public String addUserParam( //메소드이름 adduser
           @RequestParam String username,
           @RequestParam String password,
          @RequestParam String name,
          @RequestParam String email){

      Map<String,String> map = new HashMap<String, String>();

       map.put("username",username);
       map.put("password",password);
       map.put("name",name);
      map.put("email",email);

      System.out.println("map: " +map.toString());

      return map.toString();
  }
   @ResponseBody
    @PostMapping("/api/test/user/dto")
    public String addUserReDto (UserReDto userReDto){

//        Map<String,String> map = new HashMap<String, String>();
//
//        map.put("username",userReDto.getUsername());

//        map.put("password",userReDto.getPassword());
//        map.put("name",userReDto.getName();
//        map.put("email",userReDto.getEmail());
//
//        System.out.println("map: " +map.toString());

        return userReDto.toString();
    }
    @ResponseBody
    @PostMapping("/api/test/user/json")
    public Object addUserJSON(@RequestBody UserReDto userReDto){

        List<Map<Integer,UserReDto>> list = new ArrayList<Map<Integer,UserReDto>>();

        Map<Integer,UserReDto> map = null;
        for(int i=0; i<100;i++){
            if(i==0 || i%10==0){
             map = new TreeMap<Integer, UserReDto>();
            }
            map.put(i+1,userReDto);
            if((i- 9) % 10 ==0){
                list.add(map);
            }
        }
        return list;
    }
}
