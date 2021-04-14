package com.example.demo4;
import com.example.demo3.Rent;

import java.lang.annotation.Target;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description:
 * @Author: yangjiling
 * @Email: jilingy@foxmail.com
 * @Date: 2021/4/14
 **/
public class ProxyInvocationHandler implements InvocationHandler {
    //代理的接口
    private Object target;

    public void setTarget(Target target){
        this.target=target;
    }

    //生成得到代理的类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                target.getClass().getInterfaces(),this);
    }

    //处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质，就是使用反射机制实现的
        return method.invoke(target,args);
    }

}
