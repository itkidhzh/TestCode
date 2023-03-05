package stu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName
 * @Description: TODO
 * @Author: kidhzh@outlook.com
 */
public class StuModel {
    ArrayList<Student> stuList = null;
    public List<Student> selAll() {


        return Global.stuList;
    }

    public int getStuId() {

        return new Scanner(System.in).nextInt();
    }

    public List<Student> selByStuId(int id) {

        ArrayList<Student> students = new ArrayList<>();
        List<Student> stuList = Global.stuList;
        for (Student stu : stuList) {
            if (id == stu.getId()){
                students.add(stu);
            }
        }
        return students;
    }

    public List<Student> selByStuName(String name) {
        ArrayList<Student> students = new ArrayList<>();
        List<Student> stuList = Global.stuList;
        for (Student stu : stuList) {
            if (name.equals(stu.getName())){
                students.add(stu);
            }
        }
        return students;
    }

    public List<Student> selByStuSex(String sex) {
        ArrayList<Student> students = new ArrayList<>();
        List<Student> stuList = Global.stuList;
        for (Student stu : stuList) {
            if (sex.equals(stu.getSex())){
                students.add(stu);
            }
        }
        return students;
    }

    public List<Student> selByStuAge(int age) {
        ArrayList<Student> students = new ArrayList<>();
        List<Student> stuList = Global.stuList;
        for (Student stu : stuList) {
            if (age == stu.getAge()){
                students.add(stu);
            }
        }
        return students;
    }

    public List<Student> selByStuScore(Float score) {
        ArrayList<Student> students = new ArrayList<>();
        List<Student> stuList = Global.stuList;
        for (Student stu : stuList) {
            if (score.equals(stu.getScore())){
                students.add(stu);
            }
        }
        return students;
    }

    public Student getStuById(int stuId) {
        Student student = new Student();
        List<Student> studentList = Global.stuList;
        for (Student stu : studentList) {
            if (stuId == stu.getId()){
                student = stu;
            }
        }
        return student;
    }

    public List<Student> addStu(Student stu) {
        List<Student> stuList = Global.stuList;
        stuList.add(stu);
        return stuList;
    }


    public Student selStuByStuId(int stuId) {
        Student stuDel = new Student();
        ArrayList<Student> stuList = Global.stuList;
        for (Student student : stuList) {
            if (student.getId() == stuId){
                stuDel = student;
            }
        }
        return stuDel;
    }

    public List<Student> delStu(Student stuDel) {

        stuList = Global.stuList;

        Iterator<Student> iterator = stuList.iterator();

        if (iterator.hasNext()){
            Student student = iterator.next();
            if (student.getId() == stuDel.getId()){
                iterator.remove();
            }
        }

        return Global.stuList;
    }

    public Student selByUpdateStuId(int updateStuId) {
        stuList = Global.stuList;
        Student stu = new Student();

        for (Student student : stuList) {
            if (student.getId() == updateStuId){
                stu = student;
            }
        }
        stu.setId(updateStuId);
        System.out.println(stu);
        return stu;
    }

    public List<Student> update(Student selUpdateStu, Student updateStu) {

        ArrayList<Student> stuList = Global.stuList;

        selUpdateStu.setName(updateStu.getName());
        selUpdateStu.setSex(updateStu.getSex());
        selUpdateStu.setAge(updateStu.getAge());
        selUpdateStu.setScore(updateStu.getScore());

        stuList.set(selUpdateStu.getId() - 1,selUpdateStu);

        return stuList;
    }
}
