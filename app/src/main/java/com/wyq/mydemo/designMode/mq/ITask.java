package com.wyq.mydemo.designMode.mq;

/**
 * Author: wangyongqi
 * Date: 2022/4/15 15:12
 * Description:
 */
public interface ITask extends Comparable<ITask>{

    //消息入队
    void enqueue();

    //执行具体任务
    void doTask();

    //任务执行完成后偶的回调方法
    void finishTask();

    //设置任务的优先级
    ITask setPriority(TaskPriority priority);

    //获取任务优先级
    TaskPriority getPriority();

    //当优先级相同 按照插入顺序 先入先出 该方法用来标记插入顺序
    void setSequence(int mSequence);

    //获取入队次序
    int getSequence();

    //每个任务的状态，就是标记完成和未完成
    boolean getStatus();

    //设置每个任务的执行时间，该方法用于任务执行时间确定的情况
    ITask setDuration(int duration);

    //获取每个任务执行的时间
    int getDuration();

    //阻塞任务执行，该方法用于任务执行时间不确定的情况
    void blockTask() throws Exception;

    //解除阻塞任务，该方法用于任务执行时间不确定的情况
    void unLockBlock();
}
