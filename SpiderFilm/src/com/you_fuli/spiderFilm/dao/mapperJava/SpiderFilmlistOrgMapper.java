package com.you_fuli.spiderFilm.dao.mapperJava;

import com.you_fuli.spiderFilm.dto.SpiderFilmlistOrg;
import com.you_fuli.spiderFilm.dto.SpiderFilmlistOrgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpiderFilmlistOrgMapper {
    long countByExample(SpiderFilmlistOrgExample example);

    int deleteByExample(SpiderFilmlistOrgExample example);

    int insert(SpiderFilmlistOrg record);

    int insertSelective(SpiderFilmlistOrg record);

    List<SpiderFilmlistOrg> selectByExample(SpiderFilmlistOrgExample example);

    int updateByExampleSelective(@Param("record") SpiderFilmlistOrg record, @Param("example") SpiderFilmlistOrgExample example);

    int updateByExample(@Param("record") SpiderFilmlistOrg record, @Param("example") SpiderFilmlistOrgExample example);

	int insertFilmList();
}