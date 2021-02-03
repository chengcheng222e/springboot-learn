package com.cyblogs.springboot.web.demo.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author yuan.chen
 * @date 2020/9/10 21:08
 * @since JDK 1.8
 */
public abstract class AbstractStrategyFactory<K, V> implements StrategyFactory<K, V> {

    /**
     * logger
     */
    protected final Logger log = LoggerFactory.getLogger(getClass());

    /**
     * 抽象策略工厂
     * <p>
     * maps ,k-策略名称 , v-> 具体的实现
     */
    private Map<K, V> factory = new ConcurrentHashMap<>();

    /**
     * 注册不同路由实现
     */
    @Override
    public Optional<V> registerSingleFactory(K key, V value) {
        Optional<V> optional = Optional.ofNullable(factory.put(key, value));
        if (optional.isPresent()) {
            log.info("覆盖实现:{}-{}", key, value);
        } else {
            log.info("注册实现:{}-{}", key, value);
        }
        return optional;
    }

    /**
     * 移除不同路由实现
     */
    @Override
    public Optional<V> unRegisterSingleFactory(K key) {
        Optional<V> optional = Optional.ofNullable(factory.remove(key));
        optional.ifPresent(v -> log.info("移除实现:{}", key));
        return optional;
    }

    /**
     * 注册所有路由实现
     */
    @Override
    public void registerAllFactory(Map<K, V> factory) {
        factory.forEach(factory::put);
    }

    /**
     * 获取单个实现
     *
     * @return 所有实现
     */
    @Override
    public Optional<V> getFactory(K key) {
        return key != null ? Optional.ofNullable(factory.get(key)) : Optional.empty();
    }

    /**
     * 获取所有实现
     *
     * @return 所有实现
     */
    @Override
    public Map<K, V> getAllFactory() {
        return Collections.unmodifiableMap(factory);
    }

}
