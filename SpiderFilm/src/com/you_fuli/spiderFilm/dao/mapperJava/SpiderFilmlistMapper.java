package com.you_fuli.spiderFilm.dao.mapperJava;

import com.you_fuli.spiderFilm.dto.SpiderFilmlist;
import com.you_fuli.spiderFilm.dto.SpiderFilmlistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpiderFilmlistMapper {
    long countByExample(SpiderFilmlistExample example);

    int deleteByExample(SpiderFilmlistExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SpiderFilmlist record);

    int insertSelective(SpiderFilmlist record);

    List<SpiderFilmlist> selectByExample(SpiderFilmlistExample example);

    SpiderFilmlist selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SpiderFilmlist record, @Param("example") SpiderFilmlistExample example);

    int updateByExample(@Param("record") SpiderFilmlist record, @Param("example") SpiderFilmlistExample example);

    int updateByPrimaryKeySelective(SpiderFilmlist record);

    int updateByPrimaryKey(SpiderFilmlist record);
}