package main.week1;

/**
 * Created by sulang on 16-9-5.
 */
public interface IQuickFind {
    boolean isConnected(int begin, int end);

    boolean connect(int aPos, int bPos);

    void print();
}
