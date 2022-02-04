package cn.lysoy.hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.lysoy.hr.bean.Asessment;
import cn.lysoy.hr.mapper.AsessmentMapper;
import cn.lysoy.hr.service.AsessmentService;
@Service
public class AsessmentServiceImpl implements AsessmentService {
	@Autowired
	private  AsessmentMapper asessmentMapper;
	@Override
	public PageInfo<Asessment> getAllAsessment(int limit, int page,
			Asessment asessment) {
		PageHelper.startPage(page, limit);
		//查询数据
		List<Asessment> list=asessmentMapper.selectAll(asessment);
		PageInfo<Asessment> pageInfo=new PageInfo<Asessment>(list);
		return pageInfo;
	}

	@Override
	public Integer addAsessment(Asessment asessment) {
		// TODO Auto-generated method stub
		return asessmentMapper.insert(asessment);
	}

	@Override
	public Integer updateAsessment(Asessment asessment) {
		// TODO Auto-generated method stub
		return asessmentMapper.updateByPrimaryKey(asessment);
	}
    /**
     * 更新状态
     * @param record
     * @return
     */
    @Override
	public int updateStatusByPoJo(Asessment record) {
    	return asessmentMapper.updateStatusByPoJo(record);
    }
}
