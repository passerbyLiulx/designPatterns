package com.example.designPatterns.Test;

import com.example.designPatterns.service.Impl.AudiServiceImpl;
import com.example.designPatterns.service.Impl.CarTemplateServiceImpl;
import com.example.designPatterns.service.Impl.LandRoverServiceImpl;

/**
 * Template模板模式
 */
public class TemplateTest {
    public static void main(String[] args) {
        CarTemplateServiceImpl car1 = new LandRoverServiceImpl("路虎");
        CarTemplateServiceImpl car2 = new AudiServiceImpl("奥迪");
        car1.buildCar();
        car2.buildCar();
    }
}
