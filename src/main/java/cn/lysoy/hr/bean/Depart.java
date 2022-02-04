package cn.lysoy.hr.bean;

import lombok.Data;
import javax.persistence.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import java.math.*;
import java.util.*;

/**
 * @author lysoy
 * @TODO: 部门表
 * @create: 2022/02/04 17:51
 */
@Data
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "depart")
public class Depart {
    /**
     * 部门编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "depart_id")
    private Integer departId;

    /**
     * 部门名称
     */
    @Column(name = "depart_name")
    private String departName;

    /**
     * 状态（1正常）
     */
    @Column(name = "depart_status")
    private Integer departStatus;

    /**
     * 成立时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 
     */
    @Column(name = "ext_a")
    private String extA;

    /**
     * 
     */
    @Column(name = "ext_b")
    private String extB;

    /**
     * 
     */
    @Column(name = "ext_c")
    private String extC;
}