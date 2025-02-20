package main.java.top.guoyibo.minispring.beans.factory;

import java.util.HashMap;

/**
 * <p>标题：</p>
 * <p>功能：定义一个简单的bean容器BeanFactory，内部包含一个map用以保存bean，只有注册bean和获取bean两个方法 </p>
 * <p>
 * 其他说明：
 * </p>
 * <p>作者：Yibo Guo </p>
 * <p>审核：</p>
 * <p>重构：</p>
 * <p>创建日期：2/20/2025 10:59 AM </p>
 * 查看帮助：<a href="" target="_blank"></a>
 */
public class BeanFactory
{
    private HashMap<String, Object> beanMap = new HashMap<>();

    /**
     * 注册bean
     * @param beanName
     * @param bean
     */
    public void registerBean(String beanName, Object bean)
    {
        beanMap.put(beanName, bean);
    }

    /**
     * 获取bean
     * @param beanName
     * @return
     */
    public Object getBean(String beanName)
    {
        return beanMap.get(beanName);
    }
}
