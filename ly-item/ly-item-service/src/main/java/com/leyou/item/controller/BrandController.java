package com.leyou.item.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.leyou.item.entity.TbBrand;
import com.leyou.item.service.TbBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/brand")
public class BrandController {
    @Autowired
    private TbBrandService brandService;
    @GetMapping("/page")
    public ResponseEntity<IPage<TbBrand>> findBrandsByPage(@RequestParam(defaultValue = "1")int page, @RequestParam int rows){
        IPage<TbBrand> iPage = new Page<>();
        iPage.setPages(page);
        iPage.setCurrent(rows);
        IPage<TbBrand> page1 = brandService.page(iPage);
        return ResponseEntity.status(HttpStatus.OK).body(page1);
    }
}
