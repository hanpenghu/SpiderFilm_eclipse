package com.you_fuli.spiderFilm.dao.mapperJava;

import com.you_fuli.spiderFilm.dto.SpiderSeatlistOrg;
import com.you_fuli.spiderFilm.dto.SpiderSeatlistOrgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpiderSeatlistOrgMapper {
    long countByExample(SpiderSeatlistOrgExample example);

    int deleteByExample(SpiderSeatlistOrgExample example);

    int insert(SpiderSeatlistOrg record);

    int insertSelective(SpiderSeatlistOrg record);

    List<SpiderSeatlistOrg> selectByExample(SpiderSeatlistOrgExample example);

    int updateByExampleSelective(@Param("record") SpiderSeatlistOrg record, @Param("example") SpiderSeatlistOrgExample example);

    int updateByExample(@Param("record") SpiderSeatlistOrg record, @Param("example") SpiderSeatlistOrgExample example);
   
    int insertNoId(SpiderSeatlistOrg spiderSeatlistOrg);

	int insertIntoSpiderSeatlist();
}