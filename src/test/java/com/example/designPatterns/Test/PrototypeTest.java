package com.example.designPatterns.Test;

import com.example.designPatterns.model.Resume;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 原型模式测试
 */
public class PrototypeTest {

    private static Logger logger = LoggerFactory.getLogger(StrategyTest.class);

    public static void main(String[] args) {
        // 原型A对象
        Resume resumeA = new Resume("James");
        resumeA.personInfo("2.16", "男", "清华大学");
        resumeA.workExperience("2018.09.05", "血色传媒");
        // 克隆B对象
        Resume resumeB = (Resume)resumeA.clone();
        logger.info("----------A----------");
        resumeA.display();
        logger.info("----------B----------");
        resumeB.display();
        // 测试 A==B  对任何的对象x，都有x.clone()!=x，即克隆对象与原对象不是同一个对象
        logger.info("resumeA == resumeB ?   " + (resumeA == resumeB));
        // 测试 A.getClass()==B.getClass()  对任何的对象x，都有x.clone().getClass()==x.getClass()，即克隆对象与原对象的类型一样。
        logger.info("A.getClass()==B.getClass() ?   " + (resumeA.getClass() == resumeB.getClass()));
    }
}
