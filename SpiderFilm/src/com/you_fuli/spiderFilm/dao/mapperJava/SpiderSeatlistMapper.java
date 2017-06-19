package com.you_fuli.spiderFilm.dao.mapperJava;

import com.you_fuli.spiderFilm.dto.SpiderSeatlist;
import com.you_fuli.spiderFilm.dto.SpiderSeatlistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpiderSeatlistMapper {
    long countByExample(SpiderSeatlistExample example);

    int deleteByExample(SpiderSeatlistExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SpiderSeatlist record);

    int insertSelective(SpiderSeatlist record);

    List<SpiderSeatlist> selectByExample(SpiderSeatlistExample example);

    SpiderSeatlist selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SpiderSeatlist record, @Param("example") SpiderSeatlistExample example);

    int updateByExample(@Param("record") SpiderSeatlist record, @Param("example") SpiderSeatlistExample example);

    int updateByPrimaryKeySelective(SpiderSeatlist record);

    int updateByPrimaryKey(SpiderSeatlist record);
}