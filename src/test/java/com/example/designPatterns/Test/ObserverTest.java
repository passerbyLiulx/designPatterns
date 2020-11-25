package com.example.designPatterns.Test;

import com.example.designPatterns.service.Impl.UserServiceImpl;
import com.example.designPatterns.service.Impl.WeChatServerServiceImpl;
import com.example.designPatterns.service.ObServerService;

/**
 * 观察者模式测试
 */
public class ObserverTest {
    public static void main(String[] args) {
        WeChatServerServiceImpl server = new WeChatServerServiceImpl();
        ObServerService userZhang = new UserServiceImpl("ZhangSan");
        ObServerService userLi = new UserServiceImpl("LiSi");
        ObServerService userWang = new UserServiceImpl("WangWu");
        // 订阅
        server.registerObserver(userZhang);
        server.registerObserver(userLi);
        server.registerObserver(userWang);
        server.infomation("php是世界上最好的语言");
        // 取消
        server.registerObserver(userLi);
        server.infomation("java是世界上最好的语言");
    }
}
