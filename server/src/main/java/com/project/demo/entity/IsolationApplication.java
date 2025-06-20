package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *隔离申请：(IsolationApplication)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "IsolationApplication")
public class IsolationApplication implements Serializable {

    //IsolationApplication编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "isolation_application_id")
    private Integer isolation_application_id;
    // 居民信息
    @Basic
    private Integer resident_information;
    // 姓名
    @Basic
    private String full_name;
    // 年龄
    @Basic
    private String age;
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
    // 隔离时间
    @Basic
    private String isolation_time;
    // 核酸报告
    @Basic
    private String nucleic_acid_report;
    // 审批状态
    @Basic
    private String approval_status;
    // 备注信息
    @Basic
    private String remark_information;
    // 审批回复
    @Basic
    private String approval_reply;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
