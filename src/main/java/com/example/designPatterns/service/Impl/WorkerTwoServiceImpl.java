package com.example.designPatterns.service.Impl;

import com.example.designPatterns.service.WorkService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WorkerTwoServiceImpl implements WorkService {

    private Logger logger = LoggerFactory.getLogger(WorkerTwoServiceImpl.class);

    @Override
    public void doWork(String work) {
        logger.info("workerTwo要做的具体的事情：" + work);
    }
}
