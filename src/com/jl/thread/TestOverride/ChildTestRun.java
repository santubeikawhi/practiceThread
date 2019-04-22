package com.jl.thread.TestOverride;

/**
 * @ClassName ChildTestRun
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/9 22:06
 * @Version 1.0
 */
public class ChildTestRun implements FatherInterface {
    @Override
    public void testRun() {
        System.out.println("ChildTestRun");
    }
}
