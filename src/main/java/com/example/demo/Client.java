package com.example.demo;

/**
 * @Description:
 * @Author: yangjiling
 * @Email: jilingy@foxmail.com
 * @Date: 2021/4/7
 **/


public class Client {
    public static void main(String[] args) {
        Host host=new Host();
        //host.rent();
        Proxy proxy = new Proxy(host);
        proxy.rent();

    }
}
