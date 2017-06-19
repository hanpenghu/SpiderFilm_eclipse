package com.you_fuli.spiderFilm.dao.mapperJava;
import com.you_fuli.spiderFilm.dto.SpiderTransactioninfo;
import com.you_fuli.spiderFilm.dto.SpiderTransactioninfoExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SpiderTransactioninfoMapper {
	/**
	 * 查找到所有的status是doing的蜘蛛网订单号,并按照id进行升序(为了给最早的先轮询)
	 * */
	List<String>allOrd( );
	/**
	 * 拿到所有的订单状态是false或者true的订单的几个字段
	 * orderId	蜘蛛网订单号	字符串
		status	出票状态	字符串
		confirmationId	机器取票码	字符串
		partnerbookingid	柜台取票码	字符串
		content	取票信息	字符串
		params	json报文	字符串
		sign	签名	字符串
	 * */
	List<Map<String,Object>>allFalseAndTrue();
	
    long countByExample(SpiderTransactioninfoExample example);

    int deleteByExample(SpiderTransactioninfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SpiderTransactioninfo record);

    int insertSelective(SpiderTransactioninfo record);

    List<SpiderTransactioninfo> selectByExample(SpiderTransactioninfoExample example);

    SpiderTransactioninfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SpiderTransactioninfo record, @Param("example") SpiderTransactioninfoExample example);

    int updateByExample(@Param("record") SpiderTransactioninfo record, @Param("example") SpiderTransactioninfoExample example);

    int updateByPrimaryKeySelective(SpiderTransactioninfo record);

    int updateByPrimaryKey(SpiderTransactioninfo record);

	int updateStatus(Map<String, Object> map);
}