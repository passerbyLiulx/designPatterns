package com.example.designPatterns.service.Impl;

import com.example.designPatterns.service.WorkService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WorkerOneServiceImpl implements WorkService {

    private Logger logger = LoggerFactory.getLogger(WorkerOneServiceImpl.class);

    @Override
    public void doWork(String work) {
        logger.info("workerOne要做的具体的事情：" + work);
    }
}
