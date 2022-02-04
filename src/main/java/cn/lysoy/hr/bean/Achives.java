package cn.lysoy.hr.bean;

import lombok.Data;
import javax.persistence.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import java.math.*;
import java.util.*;

/**
 * @author lysoy
 * @TODO: 档案表
 * @create: 2022/02/04 17:51
 */
@Data
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "achives")
public class Achives {
    /**
     * 档案表编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Integer empId;

    /**
     * 
     */
    @Column(name = "emp_name")
    private String empName;

    /**
     * 性别
     */
    @Column(name = "emp_sex")
    private String empSex;

    /**
     * 地址
     */
    @Column(name = "emp_address")
    private String empAddress;

    /**
     * 
     */
    @Column(name = "emp_birth")
    private Date empBirth;

    /**
     * 身份证号
     */
    @Column(name = "emp_card")
    private String empCard;

    /**
     * 入职时间
     */
    @Column(name = "entry_time")
    private Date entryTime;

    /**
     * 职称
     */
    @Column(name = "emp_titles")
    private String empTitles;

    /**
     * 手机号
     */
    @Column(name = "mobile")
    private String mobile;

    /**
     * 毕业时间
     */
    @Column(name = "graduation_time")
    private Date graduationTime;

    /**
     * 毕业院校
     */
    @Column(name = "graduation_shcool")
    private String graduationShcool;

    /**
     * 学历（1专科2本科3硕士4博士）
     */
    @Column(name = "education")
    private Integer education;

    /**
     * 部门编号
     */
    @Column(name = "emp_depart")
    private Integer empDepart;

    /**
     * 状态（1在职，2离职 ）
     */
    @Column(name = "emp_status")
    private Integer empStatus;

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