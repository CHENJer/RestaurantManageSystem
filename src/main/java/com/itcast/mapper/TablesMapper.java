package com.itcast.mapper;

import com.itcast.pojo.Tables;
import com.itcast.pojo.TablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TablesMapper {
    int countByExample(TablesExample example);

    int deleteByExample(TablesExample example);

    int deleteByPrimaryKey(String tId);

    int insert(Tables record);

    int insertSelective(Tables record);

    List<Tables> selectByExample(TablesExample example);

    Tables selectByPrimaryKey(String tId);

    int updateByExampleSelective(@Param("record") Tables record, @Param("example") TablesExample example);

    int updateByExample(@Param("record") Tables record, @Param("example") TablesExample example);

    int updateByPrimaryKeySelective(Tables record);

    int updateByPrimaryKey(Tables record);
}