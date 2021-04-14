package com.example.demo3;

/**
 * @Description:
 * @Author: yangjiling
 * @Email: jilingy@foxmail.com
 * @Date: 2021/4/7
 **/
//房东

public class Host implements Rent {

    @Override
    public void rent() {
        System.out.println("房东要出租房子！");
    }
}
