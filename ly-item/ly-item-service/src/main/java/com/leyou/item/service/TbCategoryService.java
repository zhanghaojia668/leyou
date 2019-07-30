package com.leyou.item.service;

import com.leyou.item.entity.TbCategory;
import com.baomidou.mybatisplus.extension.service.IService;
import com.leyou.item.pojo.CategoryDTO;

import java.util.List;

/**
 * <p>
 * 商品类目表，类目和商品(spu)是一对多关系，类目与品牌是多对多关系 服务类
 * </p>
 *
 * @author Mr.Zhang
 * @since 2019-07-26
 */
public interface TbCategoryService extends IService<TbCategory> {
    /**
     * 根据pid查询对应的分类信息
     * @param pid
     * @return
     */
    List<CategoryDTO> findByParentId(Long pid);
}
