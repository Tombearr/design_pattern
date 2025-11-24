package com.designpattern.factory;

/**
 * 工厂模式演示类
 * 展示如何使用工厂模式创建不同的形状对象
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        // 创建形状工厂
        ShapeFactory shapeFactory = new ShapeFactory();
        
        // 使用工厂创建圆形
        Shape circle = shapeFactory.getShape("CIRCLE");
        // 调用圆形的绘制方法
        circle.draw();
        
        // 使用工厂创建矩形
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        // 调用矩形的绘制方法
        rectangle.draw();
        
        // 使用工厂创建正方形
        Shape square = shapeFactory.getShape("SQUARE");
        // 调用正方形的绘制方法
        square.draw();
    }
}