package com.jl.thread.TestOverride;

/**
 * @ClassName TestMain
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/9 22:10
 * @Version 1.0
 */
public class TestMain {
    public static void main(String[] args){
        ChildTestRun childTestRun = new ChildTestRun();
        ChildClass childClass = new ChildClass(childTestRun);
        childClass.testRun();//调用的是重写的类
    }
}
