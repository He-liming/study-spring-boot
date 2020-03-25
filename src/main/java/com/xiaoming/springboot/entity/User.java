package com.xiaoming.springboot.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "t_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private Long userId;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private Long deptId;

    @Column
    private String email;

    @Column
    private String mobile;

    @Column
    private String status;

    @Column
    private Date createTime;

    @Column
    private Date modifyTime;

    @Column
    private Date lastLoginTime;

    @Column(name = "ssex")
    private String sex;

    @Column
    private String avatar;

    @Column
    private String theme;

    @Column
    private String isTab;

    @Column
    private String description;
}
