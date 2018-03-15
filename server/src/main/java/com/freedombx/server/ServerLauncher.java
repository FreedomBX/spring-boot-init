package com.freedombx.server;


import com.freedombx.common.util.SpringBeanUtils;
import com.freedombx.common.util.TimeUtil;
import com.freedombx.server.config.ApplicationConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

/**
 * 服务启动器
 */
public class ServerLauncher {

    private static Logger logger = LoggerFactory.getLogger(ServerLauncher.class);

    public static void main(String[] args) {
        logger.info("开始启动服务.{}", TimeUtil.getCurrentTimeStr());
        long startTime = System.currentTimeMillis();
        ApplicationContext context = SpringApplication.run(ApplicationConfig.class, args);
        SpringBeanUtils.setApplicationContext(context);
        long endTime = System.currentTimeMillis();
        logger.info("服务启动完成, 耗时:{}ms.", (endTime - startTime));
    }

}
