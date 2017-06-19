package com.you_fuli.spiderFilm.dao.mapperJava;

import com.you_fuli.spiderFilm.dto.SpiderRegionlist;
import com.you_fuli.spiderFilm.dto.SpiderRegionlistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpiderRegionlistMapper {
    long countByExample(SpiderRegionlistExample example);

    int deleteByExample(SpiderRegionlistExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SpiderRegionlist record);

    int insertSelective(SpiderRegionlist record);

    List<SpiderRegionlist> selectByExample(SpiderRegionlistExample example);

    SpiderRegionlist selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SpiderRegionlist record, @Param("example") SpiderRegionlistExample example);

    int updateByExample(@Param("record") SpiderRegionlist record, @Param("example") SpiderRegionlistExample example);

    int updateByPrimaryKeySelective(SpiderRegionlist record);

    int updateByPrimaryKey(SpiderRegionlist record);
}