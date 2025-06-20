package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *社区疫情：(CommunityEpidemic)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "CommunityEpidemic")
public class CommunityEpidemic implements Serializable {

    //CommunityEpidemic编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "community_epidemic_id")
    private Integer community_epidemic_id;
    // 社区名称
    @Basic
    private String community_name;
    // 外出人数
    @Basic
    private Integer number_of_people_going_out;
    // 居民人数
    @Basic
    private Integer number_of_residents;
    // 隔离人数
    @Basic
    private Integer isolation_number;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
