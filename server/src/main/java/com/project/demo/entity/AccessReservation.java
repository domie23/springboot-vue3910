package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *出入预约：(AccessReservation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "AccessReservation")
public class AccessReservation implements Serializable {

    //AccessReservation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "access_reservation_id")
    private Integer access_reservation_id;
    // 居民信息
    @Basic
    private Integer resident_information;
    // 姓名
    @Basic
    private String full_name;
    // 联系电话
    @Basic
    private String contact_number;
    // 所在社区
    @Basic
    private String community;
    // 小区名称
    @Basic
    private String community_name;
    // 详细住址
    @Basic
    private String detailed_address;
    // 出入时间
    @Basic
    private String access_time;
    // 出发地
    @Basic
    private String place_of_departure;
    // 目的地
    @Basic
    private String destination;
    // 出入疫区
    @Basic
    private String access_to_epidemic_areas;
    // 出行方式
    @Basic
    private String travel_mode;
    // 出行备注
    @Basic
    private String travel_notes;
    // 预约状态
    @Basic
    private String reservation_status;
    // 出行原由
    @Basic
    private String travel_reasons;
    // 预约回复
    @Basic
    private String reservation_reply;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
