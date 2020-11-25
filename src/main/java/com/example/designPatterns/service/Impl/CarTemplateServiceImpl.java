package com.example.designPatterns.service.Impl;

public abstract  class CarTemplateServiceImpl {

    protected String name;

    protected CarTemplateServiceImpl(String name){
        this.name = name;
    }

    protected abstract void buildWheel();

    protected abstract void buildEngine();

    protected abstract void buildCarbody();

    protected abstract void buildCarlight();

    public final void buildCar() {
        buildWheel();
        buildEngine();
        buildCarbody();
        buildCarlight();
    }
}
