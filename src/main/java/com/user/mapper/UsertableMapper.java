package com.user.mapper;

import com.user.pojo.Usertable;
import com.user.pojo.UsertableExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UsertableMapper {
    int countByExample(UsertableExample example);

    int deleteByExample(UsertableExample example);

    int deleteByPrimaryKey(Integer ucode);

    int insert(Usertable record);

    int insertSelective(Usertable record);

    List<Usertable> selectByExample(UsertableExample example);

    Usertable selectByPrimaryKey(Integer ucode);

    int updateByExampleSelective(@Param("record") Usertable record, @Param("example") UsertableExample example);

    int updateByExample(@Param("record") Usertable record, @Param("example") UsertableExample example);

    int updateByPrimaryKeySelective(Usertable record);

    int updateByPrimaryKey(Usertable record);

    List<Usertable> showList();

}