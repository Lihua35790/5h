package 封装;

public class Person {
    /* 
     * 需求：定义一个类描述人
     * 属性：姓名，年龄
     * 行为：吃饭，睡觉
     */
    String name;
    int sge;

    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }

}
