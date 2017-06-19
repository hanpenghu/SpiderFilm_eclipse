/*
 * 首先把下面这些表建立,然后同步商品分类(com/hanhan/toDBbuShiYongPatch/CategoryExcelToDb.java)
 * 然后再同步商品,注意必须先同步分类再同步商品
 * */

--Use yun22;
/*建立临时表(商品池页码也页码名字表)shang_pin_chi_ye_ma_he_ming_zi*/
Create Table shang_pin_chi_ye_ma_he_ming_zi                               -- 问题分类信息表
(
    -- id      int identity(1,1) primary key,      -- 分类ID,主键，自动增长
     name            varchar(11),             -- 商品池名字
    page_num          int default -1,      -- 该商品池所在的页
)
-- ---------------所有商品id临时库------------------------------------'524955'----------
Create Table suo_you_shang_pin_id_lin_shi_ku   -- 所有商品id临时库
(
    itemid  varchar(11)
)
----------------------------------------------------------------------------
-- 所有商品详情临时库建临时表
create table shang_pin_xiang_qing_lin_shi_ku
(
 	goodsid varchar(max),
    weight varchar(max),
    brandName varchar(max),
     category varchar(max),
    goodsname varchar(max),
    place_production varchar(max),
    goodsbarcode varchar(max),
   	unit varchar(max),
    prodescription varchar(max),
    specification varchar(max),
    pubflag varchar(max)
)
---商品上下架表--------------------------------------------------------------------
create table shang_pin_shang_xia_jia( 
	goodsid varchar(50),
	status varchar(50)
)
-----------------------------商品图片-------------------------------------------------------------
create table shang_pin_tu_pian( 
	goodsid varchar(50),
	path1 varchar(max),
	isprimary1 varchar(11),
	path2 varchar(max),
	isprimary2 varchar(11),
	path3 varchar(max),
	isprimary3 varchar(11),
	path4 varchar(max),
	isprimary4 varchar(11)
)
-----------------------------------商品好评度-------------------------------------------------
create table shang_pin_hao_ping_du( 
	averageScore varchar(50),
	generalRate varchar(max),
	goodRate varchar(11),
	skuId varchar(max),
	poorRate varchar(11)
)
-------------------------------------商品价格---------------------------------------------------
create table shang_pin_jia_ge(
	skuid varchar(50),
	price varchar(max)
)
--------------------------创建商品区域对照表,页面克隆过来到数据库的有用(实际上我读的文本,这里也没什么用)---------------------------------------------
create table area_cangKu_dui_zhao_biao(
			areaID varchar(19),
            warehouseID varchar(19),
            areaName varchar(19)
)
--select*from area_cangKu_dui_zhao_biao;


-----给海商的仓库加一个字段  仓库ID---warehouseID------------------
 ALTER TABLE [yun2.3].[dbo].[Hishop_Regions] ADD warehouseID VARCHAR(99) NULL
 
 
 --------更新海商新增字段的仓库ID---------Hishop_Regions的warehouseID-------------------------------------
 update [yun2.3].[dbo].[Hishop_Regions] set warehouseID='0' where RegionName = '北京';
update [yun2.3].[dbo].[Hishop_Regions] set warehouseID='0' where RegionName = '天津';
update [yun2.3].[dbo].[Hishop_Regions] set warehouseID='0' where RegionName like '河北省';
update [yun2.3].[dbo].[Hishop_Regions] set warehouseID='0' where RegionName like '山西省';
update [yun2.3].[dbo].[Hishop_Regions] set warehouseID='0' where RegionName like '辽宁省';
update [yun2.3].[dbo].[Hishop_Regions] set warehouseID='0' where RegionName like '山东省';
update [yun2.3].[dbo].[Hishop_Regions] set warehouseID='0' where RegionName like '河南省';
update [yun2.3].[dbo].[Hishop_Regions] set warehouseID='0' where RegionName like '陕西省';
update [yun2.3].[dbo].[Hishop_Regions] set warehouseID='0' where RegionName like '吉林省';
update [yun2.3].[dbo].[Hishop_Regions] set warehouseID='0' where RegionName like '黑龙江省';
update [yun2.3].[dbo].[Hishop_Regions] set warehouseID='0' where RegionName like '内蒙古自治区';
update [yun2.3].[dbo].[Hishop_Regions] set warehouseID='0' where RegionName like '甘肃省';
update [yun2.3].[dbo].[Hishop_Regions] set warehouseID='0' where RegionName like '宁夏回族自治区';
update [yun2.3].[dbo].[Hishop_Regions] set warehouseID='0' where RegionName like '新疆维吾尔自治区';
update [yun2.3].[dbo].[Hishop_Regions] set warehouseID='0' where RegionName like '青海省';
update [yun2.3].[dbo].[Hishop_Regions] set warehouseID='0' where RegionName like '西藏自治区';
update [yun2.3].[dbo].[Hishop_Regions] set warehouseID='100' where RegionName like '上海';
update [yun2.3].[dbo].[Hishop_Regions] set warehouseID='100' where RegionName like '江苏省';
update [yun2.3].[dbo].[Hishop_Regions] set warehouseID='100' where RegionName like '浙江省';
update [yun2.3].[dbo].[Hishop_Regions] set warehouseID='100' where RegionName like '安徽省';
update [yun2.3].[dbo].[Hishop_Regions] set warehouseID='100' where RegionName like '江西省';
update [yun2.3].[dbo].[Hishop_Regions] set warehouseID='100' where RegionName like '湖北省';
update [yun2.3].[dbo].[Hishop_Regions] set warehouseID='200' where RegionName like '广东省';
update [yun2.3].[dbo].[Hishop_Regions] set warehouseID='200' where RegionName like '福建省';
update [yun2.3].[dbo].[Hishop_Regions] set warehouseID='200' where RegionName like '湖南省';
update [yun2.3].[dbo].[Hishop_Regions] set warehouseID='200' where RegionName like '四川省';
update [yun2.3].[dbo].[Hishop_Regions] set warehouseID='200' where RegionName like '重庆';
update [yun2.3].[dbo].[Hishop_Regions] set warehouseID='200' where RegionName like '广西壮族自治区';
update [yun2.3].[dbo].[Hishop_Regions] set warehouseID='200' where RegionName like '云南省';
update [yun2.3].[dbo].[Hishop_Regions] set warehouseID='200' where RegionName like '贵州省';
update [yun2.3].[dbo].[Hishop_Regions] set warehouseID='200' where RegionName like '海南省';
