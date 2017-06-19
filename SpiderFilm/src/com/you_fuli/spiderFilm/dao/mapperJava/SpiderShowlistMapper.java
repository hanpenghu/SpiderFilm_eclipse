package com.you_fuli.spiderFilm.dao.mapperJava;

import com.you_fuli.spiderFilm.dto.SpiderShowlist;
import com.you_fuli.spiderFilm.dto.SpiderShowlistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpiderShowlistMapper {
    long countByExample(SpiderShowlistExample example);

    int deleteByExample(SpiderShowlistExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SpiderShowlist record);

    int insertSelective(SpiderShowlist record);

    List<SpiderShowlist> selectByExample(SpiderShowlistExample example);

    SpiderShowlist selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SpiderShowlist record, @Param("example") SpiderShowlistExample example);

    int updateByExample(@Param("record") SpiderShowlist record, @Param("example") SpiderShowlistExample example);

    int updateByPrimaryKeySelective(SpiderShowlist record);

    int updateByPrimaryKey(SpiderShowlist record);
}