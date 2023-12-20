package com.example.myscope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ScopeController {
    @Autowired
    private ScopeEntty scopeEntty1;

    @Autowired
    private ScopeEntty scopeEntty2;
@GetMapping("/get")
    public String getScope(){
        scopeEntty1.setMyWork("bean1 is working");
        scopeEntty2.setMyWork("bean2 is working");
        return String.format("first bean = %s \nsecond bean = %s",scopeEntty1.getMyWork(),scopeEntty2.getMyWork());
    }

}
