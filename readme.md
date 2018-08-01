# xxl-job-admin springboot版本
## Introduction
- XXL-JOB是一个轻量级分布式任务调度平台，其核心设计目标是开发迅速、学习简单、轻量级、易扩展。
[项目传送门 xxl-job](https://github.com/xuxueli/xxl-job)

- 在学习许雪里大神的xxl-job的源码的时候，由于调度中心xxl-job-admin模块是一个springMVC项目，打war包运行于tomcat中，公司需要接入spring cloud config 统一配置，需要改写为springboot项目。

- 大神做法：基于jetty运用动态代理和反射自己实现了轻量级db的rpc框架，用于基于quartz的调度中心发起调度的时候，远程调用执行器的run方法，实现定时任务。

## xxl-job-admin 任务调度中心
- 将原springMVC项目转为Springboot项目，不改变原功能和接口，以freemarker模板引擎渲染视图。

### 环境
- SpringBoot 1.5.6
- JDK 1.8
