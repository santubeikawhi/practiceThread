package com.jl.thread.TestOverride;

/**
 * @ClassName FatherClass
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/9 22:01
 * @Version 1.0
 */
public class FatherClass implements FatherInterface{

    private FatherInterface t;

    public FatherClass(FatherInterface fatherInterface) {
        this.t = fatherInterface;
    }

    @Override
    public void testRun() {
        if(t !=null){
            t.testRun();
        }
    }
}
