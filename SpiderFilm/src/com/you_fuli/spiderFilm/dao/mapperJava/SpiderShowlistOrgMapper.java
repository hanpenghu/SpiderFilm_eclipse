package com.you_fuli.spiderFilm.dao.mapperJava;

import com.you_fuli.spiderFilm.dto.SpiderShowlistOrg;
import com.you_fuli.spiderFilm.dto.SpiderShowlistOrgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpiderShowlistOrgMapper {
    long countByExample(SpiderShowlistOrgExample example);

    int deleteByExample(SpiderShowlistOrgExample example);

    int insert(SpiderShowlistOrg record);

    int insertSelective(SpiderShowlistOrg record);

    List<SpiderShowlistOrg> selectByExample(SpiderShowlistOrgExample example);

    int updateByExampleSelective(@Param("record") SpiderShowlistOrg record, @Param("example") SpiderShowlistOrgExample example);

    int updateByExample(@Param("record") SpiderShowlistOrg record, @Param("example") SpiderShowlistOrgExample example);

    int insertIntoSpider_showList();
}