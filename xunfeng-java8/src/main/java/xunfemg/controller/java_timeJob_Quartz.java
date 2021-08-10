package xunfemg.controller;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import xunfemg.service.MyJob;

import java.util.Date;

/**
 * 使用Quartz创建 job 定时任务
 */
public class java_timeJob_Quartz {
    public static void main(String[] args) throws SchedulerException {
        //1.创建Scheduler的工厂
        SchedulerFactory sf = new StdSchedulerFactory();
        //2.从工厂中获取调度器实例
        Scheduler scheduler = sf.getScheduler();
        //3.创建JobDetail，
        JobDetail jb = JobBuilder.newJob(MyJob.class)
                //job的描述
                .withDescription("this is a ram job")
                //job 的name和group
                .withIdentity("ramJob", "ramGroup")
                .build();
        //任务运行的时间，SimpleSchedle类型触发器有效，3秒后启动任务
        long time = System.currentTimeMillis() + 3 * 1000L;
        Date statTime = new Date(time);
        //4.创建Trigger
        //使用SimpleScheduleBuilder或者CronScheduleBuilder
        Trigger t = TriggerBuilder.newTrigger()
                .withDescription("")
                .withIdentity("ramTrigger", "ramTriggerGroup")
                //.withSchedule(SimpleScheduleBuilder.simpleSchedule())
                //默认当前时间启动
                .startAt(statTime)
                //两秒执行一次，Quartz表达式，支持各种牛逼表达式
                .withSchedule(CronScheduleBuilder.cronSchedule("0/2 * * * * ?"))
                .build();
        //5.注册任务和定时器
        scheduler.scheduleJob(jb, t);
        //6.启动 调度器
        scheduler.start();
    }
}
