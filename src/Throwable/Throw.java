package Throwable;
/**
* throw 手动抛出异常
* */
public class Throw {
    public static void main(String[] args) {
        try {
            Student s = new Student();
            s.regist(-1001);
            System.out.println(s);
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
class Student{
    private int id;

    public void regist(int id) throws Exception {
        if (id > 0) {
            this.id = id;
        }else{
//            System.out.println("您输入的数据非法！");
//            手动抛出一个异常对象
//            throw new RuntimeException("您输入的数据非法！");
            throw new Exception("您输入的数据非法！");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}