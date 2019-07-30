package com.leyou.item.controller;


import com.leyou.common.enums.ExceptionEnum;
import com.leyou.common.exception.LyException;
import com.leyou.item.entity.TbBrand;
import com.leyou.item.pojo.CategoryDTO;
import com.leyou.item.service.TbCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private TbCategoryService categoryService;
    @GetMapping("/of/parent")
    public ResponseEntity<List<CategoryDTO>> findByParentId(@RequestParam(name = "pid")Long pid){
        if(StringUtils.isEmpty(pid)){
            throw new LyException(ExceptionEnum.INVALID_PARAM_ERROR);
        }
        List<CategoryDTO>categoryDTOList = categoryService.findByParentId(pid);
        return ResponseEntity.status(HttpStatus.OK).body(categoryDTOList);
    }
}
