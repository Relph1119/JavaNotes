package com.wdbyte.oop.abs;

/**
 * @author niulang
 * @date 2023/04/17
 */
public class Student extends AbsPerson {

    @Override
    public void sleep() {
        System.out.println("学生上课不能睡觉");
    }
}
