package cn.lysoy.hr.bean;

import lombok.Data;
import javax.persistence.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import java.math.*;
import java.util.*;

/**
 * @author lysoy
 * @TODO: 招聘信息表（面试登记表）
 * @create: 2022/02/04 17:51
 */
@Data
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "recruit")
public class Recruit {
    /**
     * 招聘编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recruit_id")
    private Integer recruitId;

    /**
     * 姓名
     */
    @Column(name = "person_name")
    private String personName;

    /**
     * 性别（1男 2 女）
     */
    @Column(name = "person_sex")
    private Integer personSex;

    /**
     * 面试时间
     */
    @Column(name = "recruit_date")
    private Date recruitDate;

    /**
     * 毕业院校
     */
    @Column(name = "graduation_school")
    private String graduationSchool;

    /**
     * 毕业时间
     */
    @Column(name = "graduation_date")
    private Date graduationDate;

    /**
     * 学历（1专科2本科3硕士4博士）
     */
    @Column(name = "education")
    private Integer education;

    /**
     * 1未处理 2已通过 3未通过
     */
    @Column(name = "recruit_result")
    private Integer recruitResult;

    /**
     * 状态 1正常 2删除
     */
    @Column(name = "recruit_status")
    private Integer recruitStatus;

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