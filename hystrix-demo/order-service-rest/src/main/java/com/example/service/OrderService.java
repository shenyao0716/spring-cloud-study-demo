package com.example.service;

import com.example.pojo.Order;

public interface OrderService {

    /**
     * 根据主键查询订单
     *
     * @param id
     * @return
     */
    Order selectOrderById(Integer id);

    /**
     * 根据主键查询订单
     *
     * @param id
     * @return
     */
    Order queryOrderById(Integer id);

    /**
     * 根据主键查询订单
     *
     * @param id
     * @return
     */
    Order searchOrderById(Integer id);

    /**
     * 根据主键删除订单订单
     *
     * @param id
     * @return
     */
    void deleteCacheOrderById(Integer id);

    /**
     * 删除列表缓存
     */
    void deleteCacheProductListById();

}