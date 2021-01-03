package com.abc.cwb.dao;

import com.abc.cwb.pojo.UserPojo;
import org.apache.ibatis.annotations.Param;


public interface UserPojoMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(UserPojo record);

    int insertSelective(UserPojo record);

    UserPojo selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(UserPojo record);

    int updateByPrimaryKey(UserPojo record);
    

  	int selUserName(String userName);

  	int selUserTel(String userTel);
    
  	int register(UserPojo user);
  	

  	String checkLogin(@Param("userKey") String userKey, @Param("pwd") String passWord);

  	int getIdByUserName(String userName);
  	
}


















