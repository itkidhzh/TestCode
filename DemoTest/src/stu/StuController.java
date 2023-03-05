package stu;

import sun.swing.StringUIClientPropertyKey;

import java.util.List;
import java.util.Scanner;

/**
 * @ClassName
 * @Description: TODO
 * @Author: kidhzh@outlook.com
 */
public class StuController {
    private StuModel sm = new StuModel();

    public void action(int a){

         switch (a){
             case 1:
                 selAction(StuPage.selAction());
                 break;
             case 2:
                 Student stu = StuPage.getStu();
                 List<Student> stuList = sm.addStu(stu);
                 StuPage.showStuList(stuList);
                 break;
             case 3:
                 int stuId = StuPage.getDelStuId();
                 Student stuDel = sm.selStuByStuId(stuId);
                 List<Student> stuListByDel = sm.delStu(stuDel);
                 StuPage.showStuList(stuListByDel);
                 break;
             case 4:
                 int updateStuId = StuPage.getUpdateStuId();
                 Student selUpdateStu = sm.selByUpdateStuId(updateStuId);
                 Student updateStu = StuPage.updateStu();
                 List<Student> stuListByUpdate = sm.update(selUpdateStu,updateStu);
                 StuPage.showStuList(stuListByUpdate);
                 break;
             case 0:
                 System.out.println("退出系统！~");
                 break;

         }
    }

    private void selAction(int b) {
        switch (b){
            case 1:
                List<Student> stuList = sm.selAll();
                StuPage.showStuList(stuList);
                break;
            case 2:
                System.out.print("请输入要查询的id：");
                int id = sm.getStuId();
                List<Student> stuListById = sm.selByStuId(id);
                StuPage.showStuList(stuListById);
                break;
            case 3:
                System.out.print("请输入要查询的姓名：");
                String name = new Scanner(System.in).next();
                List<Student> stuListByName = sm.selByStuName(name);
                StuPage.showStuList(stuListByName);
                break;
            case 4:
                System.out.print("请输入要查询的性别：");
                String sex = new Scanner(System.in).next();
                List<Student> stuListBySex = sm.selByStuSex(sex);
                StuPage.showStuList(stuListBySex);
                break;
            case 5:
                System.out.print("请输入要查询的年龄：");
                int age = new Scanner(System.in).nextInt();
                List<Student> stuListByAge = sm.selByStuAge(age);
                StuPage.showStuList(stuListByAge);
                break;
            case 6:
                System.out.print("请输入要查询的成绩：");
                Float score = new Scanner(System.in).nextFloat();
                List<Student> stuListByScore = sm.selByStuScore(score);
                StuPage.showStuList(stuListByScore);
                break;
            case 0:
                System.out.println("退出查询");
                action(StuPage.welCome());
                break;
        }
    }
}
