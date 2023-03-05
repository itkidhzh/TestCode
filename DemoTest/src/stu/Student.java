package stu;

/**
 * @ClassName
 * @Description: TODO
 * @Author: kidhzh@outlook.com
 */
public class Student {
    private int id;
    private String name;
    private String sex;
    private int age;
    private Float score;

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Student(String name, String sex, int age, Float score) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.score = score;
    }

    public Student() {
    }

    public Student(int id, String name, String sex, int age, Float score) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.score = score;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
