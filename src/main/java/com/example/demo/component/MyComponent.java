package com.example.demo.component;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Random;

@Component
public class MyComponent {
    int randomnuber;
   @PostConstruct
    public void RandomWords() {
       System.out.println("Created");
        Random random = new Random();
        randomnuber = random.nextInt();
    }
    public String work()
    {
       return "Random word" + randomnuber;
    }

}
