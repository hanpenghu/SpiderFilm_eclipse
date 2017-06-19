package com.you_fuli.spiderFilm.dao.mapperJava;

import com.you_fuli.spiderFilm.dto.SpiderCinemalist;
import com.you_fuli.spiderFilm.dto.SpiderCinemalistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpiderCinemalistMapper {
    long countByExample(SpiderCinemalistExample example);

    int deleteByExample(SpiderCinemalistExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SpiderCinemalist record);

    int insertSelective(SpiderCinemalist record);

    List<SpiderCinemalist> selectByExample(SpiderCinemalistExample example);

    SpiderCinemalist selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SpiderCinemalist record, @Param("example") SpiderCinemalistExample example);

    int updateByExample(@Param("record") SpiderCinemalist record, @Param("example") SpiderCinemalistExample example);

    int updateByPrimaryKeySelective(SpiderCinemalist record);

    int updateByPrimaryKey(SpiderCinemalist record);
}