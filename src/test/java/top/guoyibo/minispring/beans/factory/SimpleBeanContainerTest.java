package test.java.top.guoyibo.minispring.beans.factory;

import main.java.top.guoyibo.minispring.beans.factory.BeanFactory;
import org.junit.jupiter.api.Assertions;
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
 * <p>创建日期：2/20/2025 2:25 PM </p>
 * 查看帮助：<a href="" target="_blank"></a>
 */
public class SimpleBeanContainerTest
{
    @Test
    public void testGetBean() {
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.registerBean("HelloService", new HelloService());
        HelloService helloService = (HelloService) beanFactory.getBean("HelloService");
        Assertions.assertEquals("hello", helloService.sayHello());
    }




    class HelloService {
        public String sayHello() {
            System.out.println("Hello Spring!");
            return "hello";
        }
    }
}
