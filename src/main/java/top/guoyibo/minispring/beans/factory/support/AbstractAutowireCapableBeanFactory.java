package main.java.top.guoyibo.minispring.beans.factory.support;

import main.java.top.guoyibo.minispring.beans.BeansException;
import main.java.top.guoyibo.minispring.beans.factory.config.BeanDefinition;

/**
 * <p>标题：</p>
 * <p>功能：</p>
 * <p>
 * 其他说明：
 * </p>
 * <p>作者：Yibo Guo </p>
 * <p>审核：</p>
 * <p>重构：</p>
 * <p>创建日期：2/20/2025 5:23 PM </p>
 * 查看帮助：<a href="" target="_blank"></a>
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory
{
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException
    {
        return doCreateBean(beanName, beanDefinition);
    }

    protected Object doCreateBean(String beanName, BeanDefinition beanDefinition)
    {
        Class beanClass = beanDefinition.getBeanClass();

        Object bean = null;
        try
        {
            bean = beanClass.newInstance();
        } catch (Exception e)
        {
            throw new BeansException("Instantiation of bean failed", e);
        }

        addSingleton(beanName, bean);

        return bean;
    }
}
