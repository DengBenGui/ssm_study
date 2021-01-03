package com.abc.cwb.web;

import com.abc.cwb.pojo.BaseResponse;
import com.abc.cwb.pojo.UserPojo;
import com.abc.cwb.service.UserService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Administrator
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/test01")
    public String test01(){
        userService.addOneUserById(1);
        return "success";
    }

    @PostMapping(value = "/postOneUser", headers = "content-type=application/json;charset=UTF-8")
    public BaseResponse postOneUser(@RequestBody UserPojo user,  HttpServletRequest req, HttpServletResponse rsp){
        BaseResponse br = new BaseResponse();
        br.setRetCode("0000");
        UserPojo oneUserById = userService.getOneUserById(user.getUserId());
        br.setData(oneUserById);
        return br;
    }
    @PostMapping(value = "/postOneUserById", headers = "content-type=application/json;charset=UTF-8")
    public BaseResponse postOneUserById(@RequestBody JSONObject jsonObject,  HttpServletRequest req, HttpServletResponse rsp){
        BaseResponse br = new BaseResponse();
        br.setRetCode("0000");
        String sId = jsonObject.get("id").toString();
        Integer id = StringUtils.hasText(sId)? Integer.parseInt(sId) : null;
        UserPojo oneUserById = userService.getOneUserById(id);
        br.setData(oneUserById);
        return br;
    }



    @GetMapping(value = "/getOneUserById", headers = "content-type=application/json;charset=UTF-8")
    public BaseResponse getOneUserById(@RequestParam Integer id, HttpServletRequest req, HttpServletResponse rsp){
        BaseResponse br = new BaseResponse();
        br.setRetCode("0");
        UserPojo oneUserById = userService.getOneUserById(id);
        br.setData(oneUserById);
        return br;
    }

    @GetMapping(value = "/getOneUserById/{id}", headers = "content-type=application/json;charset=UTF-8")
    public BaseResponse getOneUserByIdPath(@PathVariable Integer id,  HttpServletRequest req, HttpServletResponse rsp){
        BaseResponse br = new BaseResponse();
        br.setRetCode("00");
        UserPojo oneUserById = userService.getOneUserById(id);
        br.setData(oneUserById);
        return br;
    }

}
