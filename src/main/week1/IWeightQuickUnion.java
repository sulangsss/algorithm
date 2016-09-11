package main.week1;

/**
 * Created by sulang on 16-9-10.
 */
public interface IWeightQuickUnion extends IQuickFind {
    int getRoot(int pos);

    int getUnionCount(int root);
}
