package com.leyou.item.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.leyou.common.enums.ExceptionEnum;
import com.leyou.common.exception.LyException;
import com.leyou.common.utils.BeanHelper;
import com.leyou.item.entity.TbCategory;
import com.leyou.item.mapper.TbCategoryMapper;
import com.leyou.item.pojo.CategoryDTO;
import com.leyou.item.service.TbCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;

/**
 * <p>
 * 商品类目表，类目和商品(spu)是一对多关系，类目与品牌是多对多关系 服务实现类
 * </p>
 *
 * @author Mr.Zhang
 * @since 2019-07-26
 */
@Service
public class TbCategoryServiceImpl extends ServiceImpl<TbCategoryMapper, TbCategory> implements TbCategoryService {

    @Override
    public List<CategoryDTO> findByParentId(Long pid) {
        //创建查询条件
        QueryWrapper<TbCategory> wrapper = new QueryWrapper<>();
        //使用条件查询
        wrapper.lambda().eq(TbCategory::getParentId,pid);
        List<TbCategory> list = this.list(wrapper);
        if(CollectionUtils.isEmpty(list)) {
            throw new LyException(ExceptionEnum.CATEGORY_NOT_FOUND);
        }
        //将实体类转换为DTO
        List<CategoryDTO> categoryDTOList = BeanHelper.copyWithCollection(list, CategoryDTO.class);
        return categoryDTOList;
    }
}
