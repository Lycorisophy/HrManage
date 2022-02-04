package cn.lysoy.hr.repository;


import cn.lysoy.hr.bean.Asessment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @TODO: 考勤表 repository
 * @create: 2022/02/04 17:51
 */
public interface AsessmentRepository extends JpaRepository<Asessment,Integer> {
}