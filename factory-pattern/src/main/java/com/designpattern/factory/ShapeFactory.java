package com.designpattern.factory;

/**
 * 形状工厂 - 工厂类
 * 负责创建具体的形状产品
 */
public class ShapeFactory {
    /**
     * 根据类型创建形状
     * @param shapeType 形状类型字符串
     * @return 创建的形状对象
     */
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        
        // 根据传入的类型创建相应的形状对象
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        
        return null;
    }
}