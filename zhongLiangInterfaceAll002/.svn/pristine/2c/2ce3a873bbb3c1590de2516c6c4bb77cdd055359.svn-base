package hanhan.zhongLiangTongBuKuKuangJia.a003mybatisAndSpringTest001.SpringMVCofZL;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import hanhan.utils.com.hanhan.toDB.CategoryExcelToDb;
import hanhan.zhongLiangTongBuKuKuangJia.a003mybatisAndSpringTest001.goods.DoYuanFeng;
import hanhan.zhongLiangTongBuKuKuangJia.a003mybatisAndSpringTest001.tongBuDingDanWuLiuXinXi.ZhongLiangTongBuWuLiuZhuangTaiDaoHaiShangDingDanBiao;
//////////////////////////////////////////////////////////////////////////////
//  /a相当于访问路径中的一员
//@RequestMapping(value = "/zl", produces = {"application/json;charset=UTF-8"})//当传输是JSON的时候
//@RequestMapping(value = "/zl",produces = {"text/html;charset=UTF-8"})//当传输不是JSON的时候
@RequestMapping(value = "/zl")
@Controller
public class Sync {
//////////////////////////////////////////////////////////////////////////////
	public Sync() {}//无参构造
//////////////////////////////////////////////////////////////////////////////
	@Autowired
	private DoYuanFeng doYuanFeng;
	@Autowired
	private ZhongLiangTongBuWuLiuZhuangTaiDaoHaiShangDingDanBiao syncLogistics;
//////////////////////////////////////////////////////////////////////////////
	//http://127.0.0.1:8081/zhongLiangInterfaceAll/ZhongLiangController.jsp
//http://localhost:8081/zhongLiangInterfaceAll/zl/startZLsync
	@RequestMapping(value = "/startZLsync",method = RequestMethod.POST,produces = {"text/html;charset=UTF-8"})
	public @ResponseBody String startZLsync(@Param("str")String str){
		System.out.println("得到页面参数=="+str);
		doYuanFeng.tongBuLinShiBiaoHeHaiShangShangPinKu();
		return "中粮同步成功!";
	}
//////////////////////////////////////////////////////////////////////////////
	/**
	 * 同步Hishop_Categories(商品分类表,使用中粮给的excel同步,一般只需要同步一次),需要设置properties文件
	 * */
	@ResponseBody
	@RequestMapping(value = "/startSyncZLHishop_Categories",method = RequestMethod.POST,produces = {"application/x-www-form-urlencoded;charset=UTF-8"})
	public String tongBuHishop_Categories(@Param("str")String str){
		System.out.println(str);
		new CategoryExcelToDb().categoryExcelToDb();
		return "商品分类表Hishop_Categories同步完成(一般在中粮没有通知之前只需要同步一次)!";
	}
///////////////////////////物流每个一个小时同步一次,点击页面一次后spring定时任务在方法上自动启动///////////////////////////////////////////////////
	
	
	/**
	 * 物流每个一个小时同步一次,点击页面一次后spring定时任务在方法上自动启动,主要把已付款状态同步为已经发货状态
	 * */
	@ResponseBody
	@RequestMapping(value = "/startSyncZlLogistics",method = RequestMethod.POST,produces = {"application/x-www-form-urlencoded;charset=UTF-8"})
	public String tongBuWuLiuZhuangTaiCongYiFuKuanDaoYiFaHuo(@Param("str")String str){
		System.out.println(str);
		syncLogistics.synchrnizeLogisticsShiYongFenYe( );
		return "物流状态开始一个小时同步一次,主要把各个订单的已付款同步成已经发货";
	}
	
	
	
	
//////////////////实验对象自动转换成JSON传输给ajax////////////////////////////////////////////////////////////
	@RequestMapping(value = "/xxx",method = RequestMethod.POST,produces = {"application/json;charset=UTF-8"})
	@ResponseBody//比如配合jackson-anntations来用,
	public Man shiYanJson(Man man){
		System.out.println("ajax传过来的东西："+man);
		man.setStr("韩韩");
		return man;
	}
//////////////////////////////////////////////////////////////////////////////
}
//////////////////////////////////////////////////////////////////////////////
