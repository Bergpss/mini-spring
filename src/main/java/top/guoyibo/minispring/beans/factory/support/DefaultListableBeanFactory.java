package main.java.top.guoyibo.minispring.beans.factory.support;

import main.java.top.guoyibo.minispring.beans.BeansException;
import main.java.top.guoyibo.minispring.beans.factory.config.BeanDefinition;

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
 * <p>创建日期：2/20/2025 5:35 PM </p>
 * 查看帮助：<a href="" target="_blank"></a>
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry
{

    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    protected BeanDefinition getBeanDefinition(String beanName) throws BeansException
    {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null)
        {
            throw new BeansException("No bean name '" + beanName + "' is defined! ");
        }
        return beanDefinition;
    }

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition)
    {
        beanDefinitionMap.put(beanName, beanDefinition);
    }
}
