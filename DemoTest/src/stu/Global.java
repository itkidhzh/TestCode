package stu;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName
 * @Description: TODO
 * @Author: kidhzh@outlook.com
 */
public class Global {

    public static int stuId = 1;
    public static ArrayList<Student> stuList = new ArrayList<Student>();
    public  static List<Student> initialize(){

        stuList.add(new Student(stuId++,"小肆","1",18,98F));
        stuList.add(new Student(stuId++,"张三","0",19,97F));
        stuList.add(new Student(stuId++,"李四","1",17,99F));
        stuList.add(new Student(stuId++,"王五","0",20,100F));
        stuList.add(new Student(stuId++,"赵六","1",21,94F));

        return stuList;

    }
}
