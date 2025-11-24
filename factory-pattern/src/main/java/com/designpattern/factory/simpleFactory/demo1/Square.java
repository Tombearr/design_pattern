package com.designpattern.factory.simpleFactory.demo1;

/**
 * 正方形 - 具体产品类
 * 实现Shape接口的具体形状类
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("绘制一个正方形");
    }
}