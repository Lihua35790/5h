package 类和对象.女朋友类的实例;

public class GirlfriendTest {
    public static void main(String[] args) {
        //实例化第一个女朋友
        Girlfriend girlfriend1 = new Girlfriend();
        girlfriend1.name = "little a";
        girlfriend1.age = 20;

        System.out.println(girlfriend1.name);
        System.out.println(girlfriend1.age);
        girlfriend1.call();
        girlfriend1.eat();

        //实例化第二个女朋友
        Girlfriend girlfriend2 = new Girlfriend();
        girlfriend2.name = "little b";
        girlfriend2.age = 22;
        System.out.println(girlfriend2.name);
        System.out.println(girlfriend2.age);
        girlfriend2.call();
        girlfriend2.eat();

    }
}
