package org.example;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.http.whiteboard.HttpWhiteboardConstants;
import org.slf4j.LoggerFactory;

@Component(immediate = true, property = {
        HttpWhiteboardConstants.HTTP_WHITEBOARD_LISTENER
                + "=true" }, service = { ServletContextListener.class,
                        TestServletContextListener.class }, scope = ServiceScope.SINGLETON)
/*
 * HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_SELECT + "=(" +
 * HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_NAME + "=*)"
 */
public class TestServletContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.err.println("context is initialized");
        LoggerFactory.getLogger(TestServletContextListener.class)
                .error("context is initialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }

}
