package main.java.top.guoyibo.minispring.beans.factory.config;

/**
 * <p>标题：</p>
 * <p>功能：BeanDefinition实例保存bean的信息，包括class类型、方法构造参数、是否为单例等，此处简化只包含class类型 </p>
 * <p>
 * 其他说明：
 * </p>
 * <p>作者：Yibo Guo </p>
 * <p>审核：</p>
 * <p>重构：</p>
 * <p>创建日期：2/20/2025 4:17 PM </p>
 * 查看帮助：<a href="" target="_blank"></a>
 */
public class BeanDefinition
{
    private Class beanClass;

    public BeanDefinition(Class beanClass)
    {
        this.beanClass = beanClass;
    }

    public Class getBeanClass()
    {
        return beanClass;
    }

    public void setBeanClass(Class beanClass)
    {
        this.beanClass = beanClass;
    }
}
