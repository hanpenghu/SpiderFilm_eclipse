package com.you_fuli.spiderFilm.dao.mapperJava;

import com.you_fuli.spiderFilm.dto.SpiderCinemalistOrg;
import com.you_fuli.spiderFilm.dto.SpiderCinemalistOrgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpiderCinemalistOrgMapper {
    long countByExample(SpiderCinemalistOrgExample example);

    int deleteByExample(SpiderCinemalistOrgExample example);

    int insert(SpiderCinemalistOrg record);

    int insertSelective(SpiderCinemalistOrg record);

    List<SpiderCinemalistOrg> selectByExample(SpiderCinemalistOrgExample example);

    int updateByExampleSelective(@Param("record") SpiderCinemalistOrg record, @Param("example") SpiderCinemalistOrgExample example);

    int updateByExample(@Param("record") SpiderCinemalistOrg record, @Param("example") SpiderCinemalistOrgExample example);

	int insertIntoSpiderCinemalist();
}