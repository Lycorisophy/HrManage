package cn.lysoy.hr.repository;


import cn.lysoy.hr.bean.Achives;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author lysoy
 * @TODO: 档案表 repository
 * @create: 2022/02/04 17:51
 */
public interface AchivesRepository extends JpaRepository<Achives,Integer> {
}