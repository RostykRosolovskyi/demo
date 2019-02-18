package com.example.demo.controller;


import com.example.demo.component.MyComponent;
import com.example.demo.repository.MyRepository;
import com.example.demo.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Scope("prototype")
public class MyController {
    @Autowired
    private MyComponent myComponent;
    @Autowired
    private MyService myService;
    @Autowired
    MyRepository myRepository;
    @GetMapping("/myString")
    public String myString() {
        if(myComponent!=null) {
            myComponent.work();
            myService.serveme();
            myService.ConvertToUpperCase();
        }
        return "MyController String";
    }
    @PostMapping("/post")
    public ResponseEntity response()
    {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Greate Responce");
    }
    @RequestMapping(value = " /order/{orderId}", method = RequestMethod.GET)
    public String PathString(@PathVariable("orderId") String s)
    {
        return s+"smtth";
    }

}
