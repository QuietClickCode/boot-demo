package com.example.demo.domain;

import javax.persistence.*;

/**
 * Created by Administrator on 2018/3/9.
 */
@Entity
@Table(name="user")
public class User {
    private Integer id;
    private String username;
    private Integer age;
    private Integer customerid;

    @Id
    @Column(name="id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name="username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name="age")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Column(name="customerid")
    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", customerid=" + customerid +
                '}';
    }
}