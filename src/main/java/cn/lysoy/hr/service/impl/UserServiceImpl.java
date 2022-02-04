package cn.lysoy.hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.lysoy.hr.bean.ResultObject;
import cn.lysoy.hr.bean.User;
import cn.lysoy.hr.mapper.UserMapper;
import cn.lysoy.hr.service.UserService;
import cn.lysoy.hr.util.Constant;

/**
 * 用户服务层实现
 * @author hr
 *
 */
@Service
public class UserServiceImpl implements UserService {
	/**
	 * 用户数据层接口
	 */
	@Autowired
	private UserMapper userMapper;
	
	/**
	 * 查询所有用户
	 */
	@Override
	public PageInfo<User> getAllUser(int limit,int page,User user) {
		//开启分页
		PageHelper.startPage(page, limit);
		//查询数据
		List<User> list=userMapper.selectAll(user);
		PageInfo<User> pageInfo=new PageInfo<User>(list);
		return pageInfo;
	}
	/**
	 * 增加账号
	 * @return 数据集合
	 */
	@Override
	public ResultObject<Integer> addUser(User user) {
		User check=new User();
		check.setUserName(user.getUserName());
		List<User> list =userMapper.selectByBean(check);
		ResultObject<Integer> rs=new ResultObject<Integer>();
		if(list.isEmpty()) {
			user.setUserStatus(1);
			Integer total=userMapper.insert(user);
			rs.setCode(Constant.SUCCESS_RETUEN_CODE);
			rs.setMsg("增加成功");
			rs.setData(total);
		}
		else {
			rs.setCode(Constant.HASE_RETUEN_CODE);
			rs.setMsg("账号已存在");
		}
		return rs;
	}
	/**
	 * 用户登录接口
	 * */
	@Override
	public User login(User user) {
		user.setUserStatus(1);
		return userMapper.login(user);
	}
	
	/**
	 * 锁定账号
	 * @param user
	 * @return
	 */
	@Override
	public int updateUser(User user){
		return userMapper.updateByPrimaryKey(user);
	}
}
