package main.model;

import main.libs.ObjectUtils;
import main.libs.StdRandom;

/**
 * Created by sulang on 16-9-20.
 */
public class ModelUtils {
    public static Personal[] getPersons(int count, int arrange) {
        Personal[] personals = new Personal[count];
        for (int index = 0; index < count; index++) {
            personals[index] = new Personal(StdRandom.uniform(arrange));
        }

        return personals;
    }

    public static void printPersons (Personal[] arrays) {
        if (ObjectUtils.isEmpty(arrays)) {
            return;
        }

        StringBuffer buffer = new StringBuffer(arrays.length * 2);
        for (int index = 0; index < arrays.length; index++) {
            buffer.append(arrays[index].getAge());
            if (index != arrays.length - 1) {
                buffer.append(",");
            }
        }
        System.out.println(buffer.toString());
    }
}
