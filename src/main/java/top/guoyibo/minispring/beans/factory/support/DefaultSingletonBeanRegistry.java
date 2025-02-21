package main.java.top.guoyibo.minispring.beans.factory.support;

import main.java.top.guoyibo.minispring.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>标题：</p>
 * <p>功能：</p>
 * <p>
 * 其他说明：
 * </p>
 * <p>作者：Yibo Guo </p>
 * <p>审核：</p>
 * <p>重构：</p>
 * <p>创建日期：2/20/2025 4:56 PM </p>
 * 查看帮助：<a href="" target="_blank"></a>
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry
{
    private Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName)
    {
        return singletonObjects.get(beanName);
    }

    protected void addSingleton(String beanName, Object singletonObject)
    {
        singletonObjects.put(beanName, singletonObject);
    }
}
