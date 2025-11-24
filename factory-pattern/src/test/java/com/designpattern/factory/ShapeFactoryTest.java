package com.designpattern.factory;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 形状工厂测试类
 * 测试ShapeFactory能否正确创建各种形状对象
 */
public class ShapeFactoryTest {

    /**
     * 测试创建圆形对象
     */
    @Test
    public void testCreateCircle() {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.getShape("CIRCLE");
        assertNotNull("应该返回非空的圆形对象", shape);
        assertTrue("应该返回Circle类型的对象", shape instanceof Circle);
    }

    /**
     * 测试创建矩形对象
     */
    @Test
    public void testCreateRectangle() {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.getShape("RECTANGLE");
        assertNotNull("应该返回非空的矩形对象", shape);
        assertTrue("应该返回Rectangle类型的对象", shape instanceof Rectangle);
    }

    /**
     * 测试创建正方形对象
     */
    @Test
    public void testCreateSquare() {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.getShape("SQUARE");
        assertNotNull("应该返回非空的正方形对象", shape);
        assertTrue("应该返回Square类型的对象", shape instanceof Square);
    }

    /**
     * 测试不区分大小写
     */
    @Test
    public void testCaseInsensitive() {
        ShapeFactory factory = new ShapeFactory();
        
        // 测试小写
        Shape circleLower = factory.getShape("circle");
        assertNotNull("应该返回非空的圆形对象", circleLower);
        assertTrue("应该返回Circle类型的对象", circleLower instanceof Circle);
        
        // 测试混合大小写
        Shape rectangleMixed = factory.getShape("ReCtAnGlE");
        assertNotNull("应该返回非空的矩形对象", rectangleMixed);
        assertTrue("应该返回Rectangle类型的对象", rectangleMixed instanceof Rectangle);
    }

    /**
     * 测试无效类型
     */
    @Test
    public void testInvalidType() {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.getShape("TRIANGLE");
        assertNull("对于无效类型应该返回null", shape);
    }

    /**
     * 测试空类型
     */
    @Test
    public void testNullType() {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.getShape(null);
        assertNull("对于null类型应该返回null", shape);
    }
}