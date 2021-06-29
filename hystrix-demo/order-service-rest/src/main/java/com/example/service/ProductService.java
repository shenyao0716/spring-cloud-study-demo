package com.example.service;

import com.example.pojo.Product;

import java.util.List;
import java.util.concurrent.Future;

public interface ProductService {

    /**
     * 查询商品列表
     *
     * @return
     */
    List<Product> selectProductList();

    /**
     * 根据多个主键查询商品
     *
     * @param ids
     * @return
     */
    List<Product> selectProductListByIds(List<Integer> ids);

    /**
     * 根据主键查询商品
     *
     * @param id
     * @return
     */
    Product selectProductById(Integer id);
    // --------------------请求合并---------start-----------
//     Product selectProductById(Integer id);
    // --------------------请求合并---------end-------------

    /**
     * 删除缓存
     * @param id
     * @return
     */
    Product deleteCacheProductById(Integer id);

    /**
     * 删除列表缓存
     */
    void deleteCacheProductListById();

//    Future<Product> selectProductById(Integer id);
}
