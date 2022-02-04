package cn.lysoy.hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.lysoy.hr.bean.Achives;
import cn.lysoy.hr.mapper.AchivesMapper;
import cn.lysoy.hr.service.AchivesService;

@Service
public class AchivesServiceImpl implements AchivesService {
	@Autowired
	private  AchivesMapper achivesMapper;
	@Override
	public PageInfo<Achives> getAllAchives(int limit, int page, Achives achives) {
		PageHelper.startPage(page, limit);
		//查询数据
		List<Achives> list=achivesMapper.selectAll(achives);
		PageInfo<Achives> pageInfo=new PageInfo<Achives>(list);
		return pageInfo;
	}

	@Override
	public Integer addAchives(Achives achives) {
		// TODO Auto-generated method stub
		return achivesMapper.insert(achives);
	}

	@Override
	public Integer updateAchives(Achives achives) {
		// TODO Auto-generated method stub
		return achivesMapper.updateByPrimaryKey(achives);
	}
	/**
	 * @param Achives
	 * @return
	 */
	public Integer updateAchivesStatus(Achives achives) {
		return achivesMapper.updateAchivesStatus(achives);
	}
	//查询出下拉框
	@Override
	public List<Achives> getAllToSelect(){
		Achives achives=new Achives();
		achives.setEmpStatus(1);
		return achivesMapper.selectAll(achives);
	}
}
