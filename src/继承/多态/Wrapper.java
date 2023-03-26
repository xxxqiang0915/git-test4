package 继承.多态;
/**
* 包装类
* */
import java.util.Scanner;
import java.util.Vector;

//包装类练习
public class Wrapper {
    public static void main(String[] args) {
        //1.实例化Scanner,用于键盘获取学生成绩
        Scanner scan = new Scanner(System.in);

        //2.创建Vector对象：Vector v = new Vector();相当于数组
        Vector v = new Vector();

        //3.通过for(;;)或while(true)给Vector
        int maxScore = 0;
        for(;;) {
            System.out.println("请输入学生成绩（以负数代表输入结束）:");
            int score = scan.nextInt();
            //3.2.输入负数时跳出循环
            if (score < 0) {
                break;
            }
            if (score > 100) {
                System.out.println("输入的数据非法，请重新输入：");
                continue;
            }
            //3.1.添加数据：v.addElement(Object obj)
            //jdk5.0之前：
            //Integer inSore = new Integer(score);
            //v.addElement(inSore);
            //jdk5.0之后：
            v.addElement(score);
            //4.获取学生成绩最大值
            if (maxScore < score) {
                maxScore = score;
            }
        }
        //5.遍历Vector，得到每个学生成绩，并与最大成绩比较，得到学生的等级
        char level;
        for (int i = 0; i < v.size(); i++) {
            Object obj = v.elementAt(i);
            //jdk5.0之前：
            //Integer inScore = (Integer) obj;
            //int score = inScore.intValue();
            //jdk5.0之后：
            int score = (int)obj;

            if(maxScore - score <= 10){
                level = 'A';
            }else if(maxScore - score <= 20){
                level = 'B';
            }else if(maxScore - score <= 30){
                level = 'C';
            }else {
                level = 'D';
            }
            System.out.println("student:"+i+",score is:"+score+
                    ",level is:"+level);

        }

    }

}
