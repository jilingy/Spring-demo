package com.example.demo;

/**
 * @Description:
 * @Author: yangjiling
 * @Email: jilingy@foxmail.com
 * @Date: 2021/4/7
 **/
public class Proxy implements Rent{
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }


    public void rent(){
        host.rent();
        seeHouse();
        heTong();
        fare();
    }

    public void seeHouse(){
        System.out.println("中介带你看房");
    }

    public void heTong(){
        System.out.println("租借合同");
    }

    public void fare(){
        System.out.println("收中介费");
    }
}
