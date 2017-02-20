package ru.kpfu.itis.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.kpfu.itis.spring.AppConfig;
import ru.kpfu.itis.spring.model.impl.fight.LiebeVsAmoreFight;

import java.util.Scanner;

/**
 * Created by Apraxin Vladimir on 14.2.17.
 */
public class Start {

    public static void main(String[] args) {

        System.out.println("eto moya rpg");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 for XML | Enter 2 for Annotations");
        int variable = scanner.nextInt();

        if (variable == 1) {
            ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        }
        switch (variable) {
            case 1:
                ApplicationContext contextXML = new ClassPathXmlApplicationContext("spring-config.xml");
                LiebeVsAmoreFight liebeVsAmoreFightXML = (LiebeVsAmoreFight) contextXML.getBean("liebeVsAmoreFight");
                System.out.println("XML-based game launch");
                liebeVsAmoreFightXML.start();
                break;
            case 2:
                AbstractApplicationContext contextAnnotaions = new AnnotationConfigApplicationContext(AppConfig.class);
                LiebeVsAmoreFight liebeVsAmoreFightAnnotations =
                        (LiebeVsAmoreFight) contextAnnotaions.getBean("liebeVsAmoreFight");
                System.out.println("Annotations-based game launch");
                liebeVsAmoreFightAnnotations.start();
                break;
            default:
                System.out.println("Try again with valid number");
                break;
        }

    }
}
