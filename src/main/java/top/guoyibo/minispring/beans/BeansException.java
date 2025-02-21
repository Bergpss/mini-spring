package main.java.top.guoyibo.minispring.beans;

/**
 * <p>标题：</p>
 * <p>功能：</p>
 * <p>
 * 其他说明：
 * </p>
 * <p>作者：Yibo Guo </p>
 * <p>审核：</p>
 * <p>重构：</p>
 * <p>创建日期：2/20/2025 5:01 PM </p>
 * 查看帮助：<a href="" target="_blank"></a>
 */
 public class BeansException extends RuntimeException
{
    public BeansException(String message)
    {
        super(message);
    }

    public BeansException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
