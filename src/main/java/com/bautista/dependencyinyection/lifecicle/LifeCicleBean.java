package com.bautista.dependencyinyection.lifecicle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCicleBean implements BeanNameAware {
    private static final Logger log = LoggerFactory.getLogger(LifeCicleBean.class);

    @Override
    public void setBeanName(String name) {
        log.info("Bean Name aware: {}",name);
    }
}
