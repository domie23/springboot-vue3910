package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *打卡信息：(PunchInInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "PunchInInformation")
public class PunchInInformation implements Serializable {

    //PunchInInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "punch_in_information_id")
    private Integer punch_in_information_id;
    // 所在社区
    @Basic
    private String community;
    // 小区名称
    @Basic
    private String community_name;
    // 封面图片
    @Basic
    private String cover_photo_;
    // 小区地址
    @Basic
    private String cell_address;
    // 小区简介
    @Basic
    private String community_profile;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
