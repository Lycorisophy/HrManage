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
@Table(name = "user")
public class User {
    /**
     * 用户编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 
     */
    @Column(name = "user_password")
    private String userPassword;

    /**
     * 1超管 2 普通管理员
     */
    @Column(name = "role")
    private Integer role;

    /**
     * 
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 1正常 2 锁定 3删除
     */
    @Column(name = "user_status")
    private Integer userStatus;

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