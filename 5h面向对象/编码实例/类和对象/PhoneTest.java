package 类和对象;

public class PhoneTest {
    public static void main(String[] args) {
        //创建手机对象
        Phone p = new Phone();

        //叫做给手机赋值
        p.brand = "小米";
        p.price = 19.9;
         
        //获取手机对象的值；     也是调用对象的属性
        System.out.println(p.brand);
        System.out.println(p.price);

        //调用手机中的方法即可 
        p.call();
        p.playGame();


        System.out.println("--------------------------------");







        //定义第二部手机
        Phone p2 = new Phone();
        p2.brand = "苹果";
        p2.price = 9.9;
        
        System.out.println(p2.brand);
        System.out.println(p2.price);

        p2.call();
        p2.playGame();


    }
}
