package main.java.top.guoyibo.minispring.beans.factory.support;

import main.java.top.guoyibo.minispring.beans.BeansException;
import main.java.top.guoyibo.minispring.beans.factory.BeanFactory;
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
 * <p>创建日期：2/20/2025 5:12 PM </p>
 * 查看帮助：<a href="" target="_blank"></a>
 */
 public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory
{

     @Override
     public Object getBean(String beanName) throws BeansException
     {
         Object bean = getSingleton(beanName);
         if (bean != null)
         {
             return bean;
         }
         BeanDefinition beanDefinition = getBeanDefinition(beanName);
         return createBean(beanName, beanDefinition);
     }

     protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

     protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;
}
