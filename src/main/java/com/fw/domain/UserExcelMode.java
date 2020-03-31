package com.fw.domain;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

/**
 * @author yqf
 * @date 2020 下午12:12
 */
public class UserExcelMode extends BaseRowModel {

    @ExcelProperty(value = {"序号"},index = 0)
    private Integer num;
    @ExcelProperty(value = {"名字"},index = 1)
    private String name;
    @ExcelProperty(value = {"年龄"},index = 2)
    private Integer age;

    public UserExcelMode() {
    }

    public UserExcelMode(Integer num, String name, Integer age) {
        this.num = num;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserExcelMode{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
