/*
 * 文件名：RedisCacheImpl.java
 * 版权：Copyright 2007-2017 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： RedisCacheImpl.java
 * 修改人：tianzhong
 * 修改时间：2017年3月17日
 * 修改内容：新增
 */
package com.lsj.os_frameworks_learning.os_frameworks.redis.client.cache.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import os_frameworks.redis.client.RedisClient;
import os_frameworks.redis.client.cache.RedisCache;
import redis.clients.jedis.Jedis;
import utils.JsonUtils;

/**
 * TODO 添加类的一句话简单描述.
 * 
 * @author tianzhong
 */
@Component
public class RedisCacheImpl<V> implements RedisCache<String, V> {
    
    /**
     * 添加字段注释.
     */
    @Autowired
    private RedisClient client;
    
    /**
     * 默认过时时间
     */
    private static final int EXPRIE_TIME = 3600 * 24;
  
    /** 
     * 在redis数据库中插入 key  和value 
     */  
    @Override  
    public boolean set(String key, V value) {  
        //设置默认过时时间  
        return set(key, value, EXPRIE_TIME);  
    }  
    /**
     * TODO 添加方法注释.
     */ 
    @Override  
    public boolean set(String key, V value, int exprieTime) {
        if (null == key || "".equals(key)) {
            return false;
        }
        Jedis jedis = null;
        try {
            jedis = client.getRedisSource();
            jedis.setex(key, exprieTime, JsonUtils.toJson(value));
        } catch (Exception e) {
            e.printStackTrace();
            if (null != jedis) {
                client.returnBrokenResource(jedis);
            }
        } finally {
            if (null != jedis) {
                client.returnResource(jedis);
            }
        }
        return true;
    }
    /**
     * {@inheritDoc}.
     */
    @Override
    @SuppressWarnings("unchecked")
    public V get(String key) {
        Jedis jedis = null;
        
        try {
            jedis = client.getRedisSource();
            String val = jedis.get(key);
            return (V) val;
        } catch (Exception e) {
            e.printStackTrace();
            if (null != jedis) {
                client.returnBrokenResource(jedis);
            }
        } finally {
            if (null != jedis) {
                client.returnResource(jedis);
            }
        }
        
        return null;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public boolean remove(String key) {
        Jedis jedis = null;
        
        try {
            jedis = client.getRedisSource();
            jedis.del(key);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            if (null != jedis) {
                client.returnBrokenResource(jedis);
            }
        } finally {
            if (null != jedis) {
                client.returnResource(jedis);
            }
        }
        return false;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public boolean hset(String cacheKey, String key, V value) {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public V hget(String cacheKey, String key) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public Map<String, V> hget(String cacheKey) {
        // TODO Auto-generated method stub
        return null;
    }

}
