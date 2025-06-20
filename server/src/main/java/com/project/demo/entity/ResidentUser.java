package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *居民用户：(ResidentUser)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ResidentUser")
public class ResidentUser implements Serializable {

    //ResidentUser编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "resident_user_id")
    private Integer resident_user_id;
    // 姓名
    @Basic
    private String full_name;
    // 性别
    @Basic
    private String gender;
    // 年龄
    @Basic
    private String age;
    // 所在社区
    @Basic
    private String community;
    // 小区名称
    @Basic
    private String community_name;
    // 详细住址
    @Basic
    private String detailed_address;
    // 用户编号
    @Id
    @Column(name = "user_id")
    private Integer userId;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
