package com.tedblob.beanfactory.models;

public class SampleBean {

    private int value;

    public SampleBean(int value) {
        System.out.println("SampleBean initialized");
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
