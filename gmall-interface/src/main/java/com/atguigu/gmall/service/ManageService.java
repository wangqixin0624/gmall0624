package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.*;

import java.util.List;

public interface ManageService {
     // 编写功能方法

     /**
      * 查询所有的一级分类数据
      * @return
      */
     List<BaseCatalog1> getCatalog1();

     /**
      * 根据一级分类Id 查询二级分类数据
      * @param catalog1Id
      * @return
              */
     List<BaseCatalog2> getCatalog2(String catalog1Id);

     /**
      * 根据属性查询二级分类数据
      * @param baseCatalog2
      * @return
      */
     List<BaseCatalog2> getCatalog2(BaseCatalog2 baseCatalog2);

     /**
      * 查询三级分类数据
      * @param baseCatalog3
      * @return
      */
     List<BaseCatalog3> getCatalog3(BaseCatalog3 baseCatalog3);

     /**
      * 根据属性查询平台属性数据
      * @param baseAttrInfo
      * @return
      */
     List<BaseAttrInfo> getAttrInfoList(BaseAttrInfo baseAttrInfo);

     /**
      * 保存平台属性-平台属性值
      * @param baseAttrInfo
      */
     void saveAttrInfo(BaseAttrInfo baseAttrInfo);

     //通过attrId查询平台属性值集合
     List<BaseAttrValue> getAttrValueList(String attrId);

     //通过平台属性attrid查询平台属性对象
     BaseAttrInfo getAttrInfo(String attrId);

     //
     List<SpuInfo> getSpuInfoList(SpuInfo spuInfo);

     // 查询基本销售属性表
     List<BaseSaleAttr> getBaseSaleAttrList();


    public void saveSpuInfo(SpuInfo spuInfo);

     //根据spuid获取spuimage中的所有图片列表
     List<SpuImage> getSpuImageList(SpuImage spuImage);

     /**
      * 根据三级分类id查询数据
      * @param catalog3Id
      * @return
      */
     List<BaseAttrInfo> getAttrInfoList(String catalog3Id);

    /**
     * 根据spuid查询销售属性集合
     * @param spuId
     * @return
     */
    List<SpuSaleAttr> getSpuSaleAttrList(String spuId);

    void saveSkuInfo(SkuInfo skuInfo);
}
