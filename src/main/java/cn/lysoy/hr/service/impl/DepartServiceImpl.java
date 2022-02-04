package cn.lysoy.hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.lysoy.hr.bean.Depart;
import cn.lysoy.hr.mapper.DepartMapper;
import cn.lysoy.hr.service.DepartService;

/**
 * 部门服务实现层
 * 
 * @author hr
 *
 */
@Service
public class DepartServiceImpl implements DepartService {
	@Autowired
	private DepartMapper departMapper;

	@Override
	public PageInfo<Depart> getAllDepart(int limit, int page, Depart depart) {
		PageHelper.startPage(page, limit);
		// 查询数据
		List<Depart> list = departMapper.selectAll(depart);
		PageInfo<Depart> pageInfo = new PageInfo<Depart>(list);
		return pageInfo;
	}

	@Override
	public Integer addDepart(Depart depart) {
		// TODO Auto-generated method stub
		return departMapper.insert(depart);
	}

	@Override
	public Integer updateDepart(Depart depart) {
		// TODO Auto-generated method stub
		return departMapper.updateByPrimaryKey(depart);
	}

	/**
	 * 部门选择下拉框
	 * 
	 * @return
	 */
	@Override
	public List<Depart> getAlldepartSelect() {
		return departMapper.selectAll(new Depart());

	}

}
