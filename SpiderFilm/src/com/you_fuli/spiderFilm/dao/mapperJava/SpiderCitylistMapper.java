package com.you_fuli.spiderFilm.dao.mapperJava;

import com.you_fuli.spiderFilm.dto.SpiderCitylist;
import com.you_fuli.spiderFilm.dto.SpiderCitylistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpiderCitylistMapper {
    long countByExample(SpiderCitylistExample example);

    int deleteByExample(SpiderCitylistExample example);

    int deleteByPrimaryKey(String cityid);

    int insert(SpiderCitylist record);

    int insertSelective(SpiderCitylist record);

    List<SpiderCitylist> selectByExample(SpiderCitylistExample example);

    SpiderCitylist selectByPrimaryKey(String cityid);

    int updateByExampleSelective(@Param("record") SpiderCitylist record, @Param("example") SpiderCitylistExample example);

    int updateByExample(@Param("record") SpiderCitylist record, @Param("example") SpiderCitylistExample example);

    int updateByPrimaryKeySelective(SpiderCitylist record);

    int updateByPrimaryKey(SpiderCitylist record);
}