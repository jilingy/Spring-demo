package com.example.demo2;

/**
 * @Description:
 * @Author: yangjiling
 * @Email: jilingy@foxmail.com
 * @Date: 2021/4/8
 **/
public class Client {

    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.add();
    }
}
