package 构造方法;

public class StudentTest{
    public static void main(String[] args) {
        //创建对象
        //调用的空参
        //Student s = new Student();

        //调用的有参
        Student s = new Student("Tom", 18);

        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}