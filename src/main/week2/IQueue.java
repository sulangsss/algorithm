package main.week2;

/**
 * Created by sulang on 16-9-14.
 */
public interface IQueue<T> {
    /**
     * 添加进入队列
     *
     * @param t
     * @return
     */
    boolean enQueue(T t);

    /**
     * 移除队列
     *
     * @return
     */
    T deQueue();

    /**
     * 队列是否为空
     *
     * @return
     */
    boolean isEmpty();

    /**
     * 获取当前队列长度
     *
     * @return
     */
    int size();
}
