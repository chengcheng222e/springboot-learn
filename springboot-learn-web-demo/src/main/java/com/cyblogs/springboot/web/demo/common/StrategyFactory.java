package com.cyblogs.springboot.web.demo.common;

import java.util.Map;
import java.util.Optional;

/**
 * @author yuan.chen
 * @date 2020/9/10 21:08
 * @since JDK 1.8
 */
public interface StrategyFactory<K, V> {

    /**
     * 注册不同路由实现
     *
     * @param key
     *            key
     * @param value
     *            value
     */
    Optional<V> registerSingleFactory(K key, V value);

    /**
     * 移除不同路由实现
     *
     * @param key
     *            key
     * @return value
     */
    Optional<V> unRegisterSingleFactory(K key);

    /**
     * 注册所有路由实现
     *
     * @param factory
     *            factory
     */
    void registerAllFactory(Map<K, V> factory);

    /**
     * 获取单个实现
     *
     * @param key
     *            key
     * @return value
     */
    Optional<V> getFactory(K key);

    /**
     * 获取所有实现
     *
     * @return 所有实现
     */
    Map<K, V> getAllFactory();

}
