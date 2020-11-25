package com.example.designPatterns.service.Impl;

import com.example.designPatterns.service.WorkService;

import java.util.HashMap;
import java.util.Map;

public class LeaderServiceImpl implements WorkService {

    private Map<String, WorkService> workServiceMap = new HashMap<>();

    public LeaderServiceImpl() {
        workServiceMap.put("打印文件", new WorkerOneServiceImpl());
        workServiceMap.put("测试项目", new WorkerTwoServiceImpl());
    }

    @Override
    public void doWork(String work) {
        workServiceMap.get(work).doWork(work);
    }
}
