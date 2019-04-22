package com.jl.thread.TestOverride;

/**
 * @ClassName ChildClass
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/9 22:05
 * @Version 1.0
 */
public class ChildClass extends FatherClass {
    public ChildClass(FatherInterface fatherInterface) {
        super(fatherInterface);
    }

    @Override
    public void testRun() {//子类的重写
        System.out.println("dasdfasdf");
    }
}
