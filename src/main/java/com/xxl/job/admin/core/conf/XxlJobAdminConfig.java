package com.xxl.job.admin.core.conf;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * xxl-job config
 *
 * @author xuxueli 2017-04-28
 */
@Configuration
@EnableConfigurationProperties(XxlJobAdminProperties.class)
public class XxlJobAdminConfig implements InitializingBean {

    @Autowired
    private XxlJobAdminProperties xxlJobAdminProperties;

    private static XxlJobAdminConfig adminConfig = null;
    public static XxlJobAdminConfig getAdminConfig() {
        return adminConfig;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        adminConfig = this;
    }

    public String getMailHost() {
        return xxlJobAdminProperties.getMailHost();
    }

    public String getMailPort() {
        return xxlJobAdminProperties.getMailPort();
    }

    public boolean isMailSSL() {
        return xxlJobAdminProperties.getMailSsl();
    }

    public String getMailUsername() {
        return xxlJobAdminProperties.getMailUsername();
    }

    public String getMailPassword() {
        return xxlJobAdminProperties.getMailPassword();
    }

    public String getMailSendNick() {
        return xxlJobAdminProperties.getMailSendNick();
    }

    public String getLoginUsername() {
        return xxlJobAdminProperties.getLoginUsername();
    }

    public String getLoginPassword() {
        return xxlJobAdminProperties.getLoginPassword();
    }

    public String getI18n() {
        return xxlJobAdminProperties.getI18n();
    }

}
