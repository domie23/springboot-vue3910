package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *打卡记录：(PunchInRecord)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "PunchInRecord")
public class PunchInRecord implements Serializable {

    //PunchInRecord编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "punch_in_record_id")
    private Integer punch_in_record_id;
    // 所在社区
    @Basic
    private String community;
    // 小区名称
    @Basic
    private String community_name;
    // 居民信息
    @Basic
    private Integer resident_information;
    // 姓名
    @Basic
    private String full_name;
    // 联系电话
    @Basic
    private String contact_number;
    // 打卡日期
    @Basic
    private Timestamp punch_in_date;
    // 打卡位置
    @Basic
    private String punch_in_position;
    // 测量体温
    @Basic
    private String measure_body_temperature;
    // 打卡备注
    @Basic
    private String punch_in_remarks;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
