package cn.lysoy.hr.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import cn.lysoy.hr.bean.Achives;

public interface AchivesService {
	/**
	 * @param limit
	 * @param page
	 * @param achives
	 * @return
	 */
	public PageInfo<Achives>getAllAchives(int limit,int page,Achives achives);
	/**
	 * @param achives
	 * @return
	 */
	public Integer addAchives(Achives achives);
	/**
	 * @param achives
	 * @return
	 */
	public Integer updateAchives(Achives achives);
	
	
	/**
	 * @param achives
	 * @return
	 */
	public Integer updateAchivesStatus(Achives achives);
	
	/**
	 * @return
	 */
	public List<Achives> getAllToSelect();


}
