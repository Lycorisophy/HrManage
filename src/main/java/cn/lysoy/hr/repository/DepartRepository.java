package cn.lysoy.hr.repository;


import cn.lysoy.hr.bean.Depart;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @TODO: 部门表 repository
 * @create: 2022/02/04 17:51
 */
public interface DepartRepository extends JpaRepository<Depart,Integer> {
}