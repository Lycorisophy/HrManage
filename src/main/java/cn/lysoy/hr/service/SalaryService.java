package cn.lysoy.hr.service;

import com.github.pagehelper.PageInfo;
import cn.lysoy.hr.bean.ResultObject;
import cn.lysoy.hr.bean.Salary;

/**
* 工资服务层
* @author hr
*
*/	
public interface SalaryService {
 
	/**
	 * 查询所有工资
	 * @param limit
	 * @param page
	 * @param salary
	 * @return
	 */
	public PageInfo<Salary>getAllSalary(int limit,int page,Salary salary);
	/**
	 * 增加工资
	 * @param salary
	 * @return
	 */
	public ResultObject<Integer>  addSalary(Salary salary);
	/**
	 * 修改工资
	 * @param salary
	 * @return
	 */
	public Integer updateSalary(Salary salary);
	
	
	
	

}
