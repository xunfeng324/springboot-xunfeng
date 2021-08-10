package xunfemg.controller;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 使用timerTask创建 job 定时任务
 */
public class java_timeJob_TimerTask {
    static long count = 0;
    public static void main(String[] args) {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                count++;
                System.out.println(count);
            }
        };
        //创建timer对象设置间隔时间
        Timer timer = new Timer();
        // 间隔天数
        long delay = 0;
        // 间隔毫秒数
        long period = 1000;
        timer.scheduleAtFixedRate(timerTask, delay, period);
    }
}
