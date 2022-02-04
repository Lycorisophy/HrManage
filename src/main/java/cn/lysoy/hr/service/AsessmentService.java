package cn.lysoy.hr.service;

import com.github.pagehelper.PageInfo;
import cn.lysoy.hr.bean.Asessment;

/**
* 服务层
* @author hr
*
*/	
public interface AsessmentService {
	/**
	 * @param limit
	 * @param page
	 * @param asessment
	 * @return
	 */
	public PageInfo<Asessment>getAllAsessment(int limit,int page,Asessment asessment);
	/**
	 * @param asessment
	 * @return
	 */
	public Integer addAsessment(Asessment asessment);
	/**
	 * @param asessment
	 * @return
	 */
	public Integer updateAsessment(Asessment asessment);
	
    /**
     * 更新状态
     * @param record
     * @return
     */
    public int updateStatusByPoJo(Asessment record);
}
