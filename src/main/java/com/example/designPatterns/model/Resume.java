package com.example.designPatterns.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Closeable;
import java.io.IOException;

public class Resume implements Cloneable {

    Logger logger = LoggerFactory.getLogger(Resume.class);

    /**
     * 名称
     */
    private String name;

    /**
     * 生日
     */
    private String birthday;

    /**
     * 性别
     */
    private String sex;

    /**
     * 学校
     */
    private String school;

    /**
     * 工作年限
     */
    private String workingSeniority;

    /**
     * 公司
     */
    private String company;

    public Resume(String name) {
        this.name = name;
    }

    /**
     * 个人基本信息
     * @param birthday
     * @param sex
     * @param school
     */
    public void personInfo(String birthday,String sex,String school) {
        this.birthday = birthday;
        this.sex = sex;
        this.school = school;
    }

    /**
     * 工作经历
     * @param workingSeniority
     * @param company
     */
    public void workExperience(String workingSeniority, String company) {
        this.workingSeniority = workingSeniority;
        this.company = company;
    }

    /**
     * 克隆实例
     */
    public Object clone() {
        Resume resume = null;
        try {
            resume = (Resume) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return resume;
    }

    public void display() {
        logger.info("姓名：" + name);
        logger.info("生日：" + birthday + "，性别：" + sex + "，毕业学校：" + school);
        logger.info("工作年限：" + workingSeniority + "，公司：" + company);
    }
}
