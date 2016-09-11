package main.week1;

import main.libs.LogUtils;

/**
 * Created by sulang on 16-9-5.
 */
public class QuickFind implements IQuickFind {
    public static final String TAG = QuickFind.class.getSimpleName();

    private int[] mNodes;

    public QuickFind(int size) {
        if (size <= 0) {
            throw new RuntimeException("size must be > 0");
        }

        mNodes = new int[size];
        for (int index = 1; index < mNodes.length; index++) {
            mNodes[index] = index;
        }
    }

    @Override
    public boolean isConnected(int begin, int end) {
        if (mNodes == null) {
            LogUtils.logi("isConnected", "node array is empty");
            throw new RuntimeException("isConnected error");
        }

        if (begin < mNodes.length && end < mNodes.length) {
                if (mNodes[begin] == mNodes[end]) {
                    LogUtils.logi("isConnected", begin + " has been connected " + end);
                    return true;
                }
        }

        return false;
    }

    @Override
    public boolean connect(int aPos, int bPos) {
        if (isConnected(aPos, bPos)) {
            return false;
        }

//        mNodes[bPos] = mNodes[aPos];
        LogUtils.logi("connect", aPos + " is connect " + bPos);
        for (int index = 0; index < mNodes.length; index++) {
            if (mNodes[index] == mNodes[aPos]) {
                // TODO: 16-9-8 值表示所属的域
                mNodes[index] = mNodes[bPos];
            }
        }
        return true;
    }

    @Override
    public void print() {
        for (int index = 0; index < mNodes.length; index++) {
            LogUtils.logi(TAG, index + ":" + mNodes[index]);
        }
    }
}
