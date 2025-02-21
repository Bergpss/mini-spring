package test.java.top.guoyibo.minispring.test.ioc;

import main.java.top.guoyibo.minispring.beans.factory.config.BeanDefinition;
import main.java.top.guoyibo.minispring.beans.factory.support.DefaultListableBeanFactory;
import org.junit.jupiter.api.Test;

/**
 * <p>标题：</p>
 * <p>功能：</p>
 * <p>
 * 其他说明：
 * </p>
 * <p>作者：Yibo Guo </p>
 * <p>审核：</p>
 * <p>重构：</p>
 * <p>创建日期：2/21/2025 2:02 PM </p>
 * 查看帮助：<a href="" target="_blank"></a>
 */
public class BeanDefinitionAndBeanDefinitionRegistryTest
{
    @Test
    public void testBeanFactory() throws Exception {

        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinition helloServiceBeanDifinition = new BeanDefinition(HelloService.class);
        beanFactory.registerBeanDefinition("HelloService", helloServiceBeanDifinition);

        HelloService helloService = (HelloService) beanFactory.getBean("HelloService");
        helloService.sayHello();
    }

}
