package main.model;

/**
 * Created by sulang on 16-9-20.
 */
public class Personal implements Comparable<Personal> {
    private String name;
    private int age;

    public Personal() {
    }

    public Personal(String name) {
        this.name = name;
    }

    public Personal(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Personal personal) {
        if (personal == null) {
            throw new NullPointerException();
        }

        if (this.age < personal.getAge()) {
            return -1;
        }

        if (this.age > personal.getAge()) {
            return 1;
        }

        return 0;
    }
}
