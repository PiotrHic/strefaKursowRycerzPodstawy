package com.example.strefakursowrycerzpodstawy.model;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

// adnotacja
@Component
public class Castle {

    private String name = "East Watch";

    public Castle() {
        System.out.println("Dodany do kontenera!");
    }

    @PostConstruct
    public void build(){
        System.out.println("Wybudowano zamek - @PostConstruct");
    }

    @PreDestroy
    public void reatDown(){
        System.out.println("zamek zostal znisczony = @PreDestroy");
    }

    @Override
    public String toString() {
        return "Castle{" +
                "name='" + name + '\'' +
                '}';
    }
}
