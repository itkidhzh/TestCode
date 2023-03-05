package stu;

/**
 * @ClassName
 * @Description: TODO
 * @Author: kidhzh@outlook.com
 */
public class TestManger {

    public static void main(String[] args) {
        // 初始化数据
        Global.initialize();

        StuController stuController = new StuController();

        while (true){
            stuController.action(StuPage.welCome());
        }
    }
}
