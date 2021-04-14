package com.example.demo2;

/**
 * @Description:
 * @Author: yangjiling
 * @Email: jilingy@foxmail.com
 * @Date: 2021/4/8
 **/
public class UserServiceImpl implements UserService{

    @Override
    public void add() {
        System.out.println("使用了add方法 ");
        System.out.println("增加");
    }

    @Override
    public void delete() {
        System.out.println("删除");
    }

    @Override
    public void update() {
        System.out.println("更新");
    }

    @Override
    public void query() {
        System.out.println("查询");
    }
}
