package com.you_fuli.spiderFilm.dao.mapperJava;

import com.you_fuli.spiderFilm.dto.SpiderHalllistOrg;
import com.you_fuli.spiderFilm.dto.SpiderHalllistOrgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpiderHalllistOrgMapper {
    long countByExample(SpiderHalllistOrgExample example);

    int deleteByExample(SpiderHalllistOrgExample example);

    int insert(SpiderHalllistOrg record);

    int insertSelective(SpiderHalllistOrg record);

    List<SpiderHalllistOrg> selectByExample(SpiderHalllistOrgExample example);

    int updateByExampleSelective(@Param("record") SpiderHalllistOrg record, @Param("example") SpiderHalllistOrgExample example);

    int updateByExample(@Param("record") SpiderHalllistOrg record, @Param("example") SpiderHalllistOrgExample example);

	int insertIntoSpiderHalllist();
}