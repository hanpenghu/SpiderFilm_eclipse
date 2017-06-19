package com.you_fuli.spiderFilm.dao.mapperJava;

import com.you_fuli.spiderFilm.dto.SpiderHalllist;
import com.you_fuli.spiderFilm.dto.SpiderHalllistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpiderHalllistMapper {
    long countByExample(SpiderHalllistExample example);

    int deleteByExample(SpiderHalllistExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SpiderHalllist record);

    int insertSelective(SpiderHalllist record);

    List<SpiderHalllist> selectByExample(SpiderHalllistExample example);

    SpiderHalllist selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SpiderHalllist record, @Param("example") SpiderHalllistExample example);

    int updateByExample(@Param("record") SpiderHalllist record, @Param("example") SpiderHalllistExample example);

    int updateByPrimaryKeySelective(SpiderHalllist record);

    int updateByPrimaryKey(SpiderHalllist record);
}