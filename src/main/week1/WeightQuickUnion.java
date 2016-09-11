package main.week1;

/**
 * Created by sulang on 16-9-10.
 */
public class WeightQuickUnion implements IWeightQuickUnion {
    private final int[] mNodes;
    private final int[] mWeight;

    public WeightQuickUnion(int size) {
        if (size < 0) {
            throw new RuntimeException("size must be >= 0");
        }

        mNodes = new int[size];
        mWeight = new int[size];

        for (int index = 0; index < mNodes.length; index++) {
            mNodes[index] = index;
            mWeight[index] = 1;
        }
    }

    @Override
    public boolean isConnected(int begin, int end) {
        if (begin < 0 || begin >= mNodes.length || end < 0 || end > mNodes.length) {
            return false;
        }

        // TODO: 16-9-10 root is same
        return getRoot(begin) == getRoot(end);
    }

    @Override
    public boolean connect(int aPos, int bPos) {
        if (aPos < 0 || aPos >= mNodes.length || bPos < 0 || bPos > mNodes.length) {
            return false;
        }

        if (isConnected(aPos, bPos)) {
            return false;
        }

        /**
        *   TODO: 16-9-10
        *       1.判断两个节点是否隶属各自的集合，如果为集合，则需要合并两个集合；
         *      2.如果两个节点不为集合，则合并为一个集合；
        **/
        int aRoot = getRoot(aPos);
        int bRoot = getRoot(bPos);

        int aCount = getUnionCount(aRoot);
        int bCount = getUnionCount(bRoot);
        if (aCount <= 0 || bCount <= 0) {
            return false;
        }

        if (aCount >= bCount) {
            //  a节点所属的树比较高；则b节点所属的树根节点连接到a节点所属的树
            mNodes[bRoot] = aRoot;
            mWeight[aRoot] += mWeight[bRoot];
        } else {
            //  b节点所属的树比较高
            mNodes[aRoot] = bRoot;
            mWeight[bRoot] += mWeight[aRoot];
        }

        return true;
    }

    @Override
    public void print() {

    }

    @Override
    public int getRoot(int pos) {
        if (pos < 0 || pos >= mNodes.length) {
            return -1;
        }

        // TODO: 16-9-10 遍历直到当前节点等于自己，表明已经到了根节点位置
        int parent = mNodes[pos];
        while (parent != pos) {
            pos = parent;
            parent = mNodes[pos];
        }

        return parent;
    }

    @Override
    public int getUnionCount(int root) {
        if (root < 0 || root >= mWeight.length) {
            return 0;
        }

        return mWeight[root];
    }
}
