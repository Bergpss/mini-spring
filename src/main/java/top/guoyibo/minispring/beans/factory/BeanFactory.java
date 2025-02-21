package main.java.top.guoyibo.minispring.beans.factory;

import main.java.top.guoyibo.minispring.beans.BeansException;

/**
 * <p>标题：bean container </p>
 * <p>功能：</p>
 * <p>
 * 其他说明：
 * </p>
 * <p>作者：Yibo Guo </p>
 * <p>审核：</p>
 * <p>重构：</p>
 * <p>创建日期：2/20/2025 5:07 PM </p>
 * 查看帮助：<a href="" target="_blank"></a>
 */

public interface BeanFactory
{
    /**
     * 获取 bean
     * @param beanName
     * @return
     * @throws BeansException bean不存在时
     */
    Object getBean(String beanName) throws BeansException;
}
