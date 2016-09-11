package main.temp;

import main.libs.StdDraw;
import main.libs.StdRandom;

/**
 * Created by sulang on 16-9-5.
 */
public class testStdDraw {
    public static void main(String[] args) {
//        style1();
        style2();
    }

    private static void style2() {
        int n = 50;
        double[] a = new double[n];
        for (int index = 0; index < n; index++) {
            a[index] = StdRandom.uniform();
        }

        for (int index = 0; index < n; index++) {
            double x = 1.0 * index / n;
            double y = a[index] / 2.0;
            double rw = 0.5 / n;
            double rh = a[index] / 2.0;
            StdDraw.filledEllipse(x, y, rw, rh);
        }
    }

    public static void style1() {
        int n = 100;
        StdDraw.setXscale(0, n);
        StdDraw.setYscale(0, n * n);
        StdDraw.setPenRadius(0.01);
        for (int index = 1; index < n; index++) {
            StdDraw.point(index, index);
            StdDraw.point(index, index * index);
            StdDraw.point(index, index * Math.log(index));
        }
    }
}
