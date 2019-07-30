package com.leyou.item.service.impl;

import com.leyou.item.entity.TbCategoryBrand;
import com.leyou.item.mapper.TbCategoryBrandMapper;
import com.leyou.item.service.TbCategoryBrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品分类和品牌的中间表，两者是多对多关系 服务实现类
 * </p>
 *
 * @author Mr.Zhang
 * @since 2019-07-26
 */
@Service
public class TbCategoryBrandServiceImpl extends ServiceImpl<TbCategoryBrandMapper, TbCategoryBrand> implements TbCategoryBrandService {

}
