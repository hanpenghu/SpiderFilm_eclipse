package com.you_fuli.spiderFilm.dao.mapperJava;

import com.you_fuli.spiderFilm.dto.SpiderRegionlistOrg;
import com.you_fuli.spiderFilm.dto.SpiderRegionlistOrgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpiderRegionlistOrgMapper {
	int insertIntoSpiderRegionlist();
	
    long countByExample(SpiderRegionlistOrgExample example);

    int deleteByExample(SpiderRegionlistOrgExample example);

    int insert(SpiderRegionlistOrg record);

    int insertSelective(SpiderRegionlistOrg record);

    List<SpiderRegionlistOrg> selectByExample(SpiderRegionlistOrgExample example);

    int updateByExampleSelective(@Param("record") SpiderRegionlistOrg record, @Param("example") SpiderRegionlistOrgExample example);

    int updateByExample(@Param("record") SpiderRegionlistOrg record, @Param("example") SpiderRegionlistOrgExample example);
}