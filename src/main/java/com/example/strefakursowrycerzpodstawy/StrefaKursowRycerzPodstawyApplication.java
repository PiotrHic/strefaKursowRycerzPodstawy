package com.example.strefakursowrycerzpodstawy;

import com.example.strefakursowrycerzpodstawy.model.Knight;
import com.example.strefakursowrycerzpodstawy.model.Quest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrefaKursowRycerzPodstawyApplication {

    public static void main(String[] args) {
        SpringApplication.run(StrefaKursowRycerzPodstawyApplication.class, args);

        Knight first = new Knight("Piotr", 32, new Quest("Uratuj ksiezniczke!"));
        System.out.println(first);

        Knight second = new Knight("Artur", 31, new Quest("Zabij smoka!"));
        System.out.println(second);
    }

}
