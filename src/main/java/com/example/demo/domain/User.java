package com.example.demo.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author zwq
 * user
 * Created by zwq on 2018/3/9.
 */
@Entity
@Table(name="user")
public class User implements Serializable {
    private Integer id;
    private String username;
    private Integer age;
    private Integer customerid;

    @Id
    @Column(name= "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name= "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name= "age")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Basic
    @Column(name= "customerid")
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(username, user.username) &&
                Objects.equals(age, user.age) &&
                Objects.equals(customerid, user.customerid);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, age, customerid, username);
    }
}