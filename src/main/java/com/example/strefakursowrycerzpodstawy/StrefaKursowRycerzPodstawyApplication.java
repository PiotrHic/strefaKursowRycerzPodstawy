package com.example.strefakursowrycerzpodstawy;

import com.example.strefakursowrycerzpodstawy.model.Castle;
import com.example.strefakursowrycerzpodstawy.model.Knight;
import com.example.strefakursowrycerzpodstawy.model.Quest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StrefaKursowRycerzPodstawyApplication {

    public static void main(String[] args) {



        ConfigurableApplicationContext ctx = SpringApplication.run(StrefaKursowRycerzPodstawyApplication.class, args);


        Knight first = new Knight("Piotr", 32, new Quest("Uratuj ksiezniczke!"));
        System.out.println(first);

        Knight second = new Knight("Artur", 31, new Quest("Zabij smoka!"));
        System.out.println(second);

//        ConfigurableApplicationContext ctx  = SpringApplication.run(StrefaKursowRycerzPodstawyApplication.class, args);
//
//        Castle castle1 = (Castle) ctx.getBean("castle");
//
//        System.out.println(castle1);
    }

}
