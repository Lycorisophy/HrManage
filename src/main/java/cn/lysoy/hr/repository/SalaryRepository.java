package cn.lysoy.hr.repository;


import cn.lysoy.hr.bean.Salary;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author lysoy
 * @TODO:  repository
 * @create: 2022/02/04 17:51
 */
public interface SalaryRepository extends JpaRepository<Salary,Integer> {
}