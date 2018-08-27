package com.xxl.job.admin.core.conf;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Value 读取配置修改为 @ConfigurationProperties
 *
 * @author Xiang Zhou
 * @create 2018-07-24 10:58
 **/
@Data
@ConfigurationProperties(prefix = "xxl.job")
public class XxlJobAdminProperties {

    private String mailHost;

    private String mailPort;

    private Boolean mailSsl;

    private String mailUsername;

    private String mailPassword;

    private String mailSendNick;

    private String loginUsername;

    private String loginPassword;

    private String i18n;

    private String accessToken;
}
