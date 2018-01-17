package com.xsl.bean;

/**
 * Created by xushilong on 2018/1/17.
 */
public class User {
    /**
     * 主键id
     */
    private String id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 年纪
     */
    private Integer age;
    /**
     * 性别,0男1女2基佬3百合4人妖
     */
    private Integer sex;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}
