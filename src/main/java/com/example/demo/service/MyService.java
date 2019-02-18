package com.example.demo.service;

import com.example.demo.component.MyComponent;
import com.example.demo.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    @Autowired
    private MyComponent myComponent;
    public String ConvertToUpperCase()
    {
        return myComponent.work().toUpperCase();
    }


    public void serveme() {
        myComponent.work();
    }
}
