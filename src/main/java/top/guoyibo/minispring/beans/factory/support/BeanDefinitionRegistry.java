package main.java.top.guoyibo.minispring.beans.factory.support;

import main.java.top.guoyibo.minispring.beans.factory.config.BeanDefinition;

/**
 * <p>标题：BeanDefinition注册表接口 </p>
 * <p>功能：</p>
 * <p>
 * 其他说明：
 * </p>
 * <p>作者：Yibo Guo </p>
 * <p>审核：</p>
 * <p>重构：</p>
 * <p>创建日期：2/20/2025 4:21 PM </p>
 * 查看帮助：<a href="" target="_blank"></a>
 */
public interface BeanDefinitionRegistry 
{

    /**
     * 向注册表中注入BeanDefinition
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
