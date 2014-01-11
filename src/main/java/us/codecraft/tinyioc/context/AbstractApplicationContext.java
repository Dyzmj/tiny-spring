package us.codecraft.tinyioc.context;

import us.codecraft.tinyioc.beans.factory.AbstractBeanFactory;

/**
 * @author yihua.huang@dianping.com
 */
public abstract class AbstractApplicationContext implements ApplicationContext {
    protected AbstractBeanFactory beanFactory;

    public AbstractApplicationContext(AbstractBeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    public abstract void refresh() throws Exception;

    @Override
    public Object getBean(String name) {
        return beanFactory.getBean(name);
    }
}
