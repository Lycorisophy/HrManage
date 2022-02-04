package cn.lysoy.hr.bean;

import lombok.Data;
import javax.persistence.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import java.math.*;
import java.util.*;

/**
 * @author lysoy
 * @TODO: 考勤表
 * @create: 2022/02/04 17:51
 */
@Data
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "asessment")
public class Asessment {
    /**
     * 考勤编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "asessment_id")
    private Integer asessmentId;

    /**
     * 考勤时间
     */
    @Column(name = "asessment_date")
    private Date asessmentDate;

    /**
     * 员工编号
     */
    @Column(name = "emp_id")
    private Integer empId;

    /**
     * 1迟到 2早退 3旷工
     */
    @Column(name = "asessment_type")
    private Integer asessmentType;

    /**
     * 扣除薪资
     */
    @Column(name = "deduction_salary")
    private Double deductionSalary;

    /**
     * 状态 1正常 2删除
     */
    @Column(name = "asessment_status")
    private Integer asessmentStatus;

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