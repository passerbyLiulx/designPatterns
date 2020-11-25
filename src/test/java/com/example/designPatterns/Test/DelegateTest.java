package com.example.designPatterns.Test;

import com.example.designPatterns.service.Impl.LeaderServiceImpl;

/**
 * 委派模式测试
 */
public class DelegateTest {
    public static void main(String[] args) {
        new LeaderServiceImpl().doWork("打印文件");
        new LeaderServiceImpl().doWork("测试项目");
    }
}
