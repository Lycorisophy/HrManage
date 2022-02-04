package cn.lysoy.hr.repository;


import cn.lysoy.hr.bean.Recruit;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @TODO: 招聘信息表（面试登记表） repository
 * @create: 2022/02/04 17:51
 */
public interface RecruitRepository extends JpaRepository<Recruit,Integer> {
}