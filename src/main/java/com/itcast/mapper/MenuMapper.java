package com.itcast.mapper;

import com.itcast.pojo.MenuExample;
import com.itcast.pojo.MenuKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenuMapper {
    int countByExample(MenuExample example);

    int deleteByExample(MenuExample example);

    int deleteByPrimaryKey(MenuKey key);

    int insert(MenuKey record);

    int insertSelective(MenuKey record);

    List<MenuKey> selectByExample(MenuExample example);

    int updateByExampleSelective(@Param("record") MenuKey record, @Param("example") MenuExample example);

    int updateByExample(@Param("record") MenuKey record, @Param("example") MenuExample example);
}