package cn.lysoy.hr.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import cn.lysoy.hr.bean.Depart;

/**
* 部门服务层
* @author hr
*
*/	
public interface DepartService {
/**
 * @param limit
 * @param page
 * @param depart
 * @return
 */
public PageInfo<Depart>getAllDepart(int limit,int page,Depart depart);
/**
 * @param depart
 * @return
 */
public Integer addDepart(Depart depart);
/**
 * @param depart
 * @return
 */
public Integer updateDepart(Depart depart);

/**
 * 部门选择下拉框
 * @return
 */
public List<Depart>getAlldepartSelect();


}
