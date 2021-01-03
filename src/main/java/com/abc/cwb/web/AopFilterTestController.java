package com.abc.cwb.web;


import com.abc.cwb.service.TestService;
import com.abc.cwb.service.impl.CommonService;
import com.abc.cwb.service.impl.PrototypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("aop")
public class AopFilterTestController {

    @Autowired
    private TestService testService;
    @Autowired
    private CommonService commonService;
    @Autowired
    private PrototypeServiceImpl prototypeService
            ;

    @RequestMapping("/prototype")
    public String prototype(){
        prototypeService.print();
        return "success";
    }

    @RequestMapping("/noAop")
    public String noAop(){
        testService.print1();
        testService.addPrint1();
        return "success";
    }

    @RequestMapping("/methodFiltern")
    public String methodFilter1(){
        commonService.reflect();
        return "success";
    }

    @RequestMapping("/methodFiltery")
    public String methodFilter2(){
        commonService.addReflect();
        return "success";
    }
}
