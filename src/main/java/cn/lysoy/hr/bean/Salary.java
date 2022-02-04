package cn.lysoy.hr.bean;

import lombok.Data;
import javax.persistence.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import java.math.*;
import java.util.*;

/**
 * @author lysoy
 * @TODO:
 * @create: 2022/02/04 17:51
 */
@Data
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "salary")
public class Salary {
    /**
     * 薪资单编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "salary_id")
    private Integer salaryId;

    /**
     * 员工编号
     */
    @Column(name = "emp_id")
    private Integer empId;

    /**
     * 基本工资
     */
    @Column(name = "base_salary")
    private Double baseSalary;

    /**
     * 绩效
     */
    @Column(name = "achievements")
    private Double achievements;

    /**
     * 项目奖金
     */
    @Column(name = "bonus")
    private Double bonus;

    /**
     * 考勤扣除
     */
    @Column(name = "check_deduction")
    private Double checkDeduction;

    /**
     * 实发工资
     */
    @Column(name = "sum_salary")
    private Double sumSalary;

    /**
     * 薪资月份
     */
    @Column(name = "salary_month")
    private Date salaryMonth;

    /**
     * 薪资状态(1未发放2已发放)
     */
    @Column(name = "salary_status")
    private Integer salaryStatus;

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