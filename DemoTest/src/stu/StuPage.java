package stu;

import java.util.List;
import java.util.Scanner;

/**
 * @ClassName
 * @Description: TODO
 * @Author: kidhzh@outlook.com
 */
public class StuPage {

    private StuPage(){}

    public static int welCome() {
        System.out.println(" ******************** ");
        System.out.println(" * 欢迎登录学生管理系统 * ");
        System.out.println(" * 1 -- 查询功能 * ");
        System.out.println(" * 2 -- 添加功能 * ");
        System.out.println(" * 3 -- 删除功能 * ");
        System.out.println(" * 4 -- 修改功能 * ");
        System.out.println(" * 0 -- 退出系统 * ");
        System.out.println(" ******************* ");

        int num;
        do {
            System.out.print("请选择您功能：");
            num = new Scanner(System.in).nextInt();
        }while (num < 0 || num > 4);

        return num;

    }

    public static int selAction() {
        System.out.println(" ***************** ");
        System.out.println("       查询功能      ");
        System.out.println(" 1 -- 查询全部 ");
        System.out.println(" 2 -- 根据学号查询 ");
        System.out.println(" 3 -- 根据姓名查询 ");
        System.out.println(" 4 -- 根据性别查询 ");
        System.out.println(" 5 -- 根据年龄查询 ");
        System.out.println(" 6 -- 根据成绩查询 ");
        System.out.println(" 0 -- 退出查询 ");
        System.out.println(" ***************** ");

        int num;
        do {
            System.out.print("请选择查询方式：");
            num = new Scanner(System.in).nextInt();
        }while (num < 0 || num > 6);

        return num;
    }

    public static void showStuList(List<Student> stuList) {
        String[] sex = {"girl","boy"};
        System.out.printf("┌──────┬────────────┬───────┬───────┬───────┐\n");
        System.out.printf("├%-6s├%-12s├%-7s├%-7s├%-7s┤\n","ID","NAME","SEX","AGE","SCORE");
        for(Student stu : stuList){
            System.out.printf("├──────├────────────├───────├───────├───────┤\n");
            System.out.printf("├%-6d├%-11s├%-7s├%-7s├%-7.1f┤\n",
                    stu.getId(),
                    stu.getName(),
                    sex[Integer.parseInt(stu.getSex())] ,
                    stu.getAge(),
                    stu.getScore());
        }
        System.out.printf("└──────└────────────└───────└───────└───────┘\n");
    }

    public static Student getStu() {
        System.out.print("请输入您要添加的姓名：");
        String name = new Scanner(System.in).next();
        System.out.print("请输入您要添加的性别：");
        String sex = new Scanner(System.in).next();
        System.out.print("请输入您要添加的年龄：");
        int age = new Scanner(System.in).nextInt();
        System.out.print("请输入您要添加的成绩：");
        Float score = new Scanner(System.in).nextFloat();

        Student student = new Student();
        student.setId(Global.stuId);
        student.setName(name);
        student.setSex(sex);
        student.setAge(age);
        student.setScore(score);

        return student;
    }

    public static int getDelStuId() {
        System.out.println(" ****************** ");
        System.out.println(" --- 删除功能 --- ");
        System.out.print("请输入要删除的学生id：");
        int a = new Scanner(System.in).nextInt();
        return a;
    }

    public static int getUpdateStuId() {
        System.out.print("请输入要编辑的学生id：");
        int a = new Scanner(System.in).nextInt();
        return a;
    }

    public static Student updateStu() {
        Student student = new Student();
        System.out.print("输入您要修改的姓名：");
        String name = new Scanner(System.in).next();
        System.out.print("输入您要修改的性别：");
        String sex = new Scanner(System.in).next();
        System.out.print("输入您要修改的年龄：");
        int age = new Scanner(System.in).nextInt();
        System.out.print("输入您要修改的分数：");
        Float score = new Scanner(System.in).nextFloat();

        student.setName(name);
        student.setSex(sex);
        student.setAge(age);
        student.setScore(score);

        return student;
    }
}
