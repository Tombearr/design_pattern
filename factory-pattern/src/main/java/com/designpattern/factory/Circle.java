package com.designpattern.factory;

/**
 * 圆形 - 具体产品类
 * 实现Shape接口的具体形状类
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("绘制一个圆形");
    }
}