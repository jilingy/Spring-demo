package com.example.demo3;

/**
 * @Description:
 * @Author: yangjiling
 * @Email: jilingy@foxmail.com
 * @Date: 2021/4/14
 **/
public class Client {
    public static void main(String[] args) {
        Host host=new Host();

        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setRent(host);

        Rent proxy = (Rent) pih.getProxy();

    }
}
