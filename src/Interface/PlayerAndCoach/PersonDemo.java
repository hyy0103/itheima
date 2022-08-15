package Interface.PlayerAndCoach;

/*
    测试类
 */

public class PersonDemo {
    public static void main(String[] args) {

        PingPongPlayer ppp = new PingPongPlayer();
        ppp.setName("王皓");
        ppp.setAge(30);
        System.out.println(ppp.getName() + "," + ppp.getAge());
        ppp.eat();
        ppp.study();
        ppp.speak();

        BasketballPlayer bp = new BasketballPlayer();
        bp.setName("姚明");
        bp.setAge(35);
        System.out.println(bp.getName() + "," + bp.getAge());
        bp.eat();
        bp.study();

        PingpongCoach ppc = new PingpongCoach();
        ppc.setName("陈确");
        ppc.setAge(32);
        System.out.println(ppc.getName() + "," + ppc.getAge());
        ppc.eat();
        ppc.speak();

        BasketballCoach bbc = new BasketballCoach();
        bbc.setName("方明");
        bbc.setAge(28);
        System.out.println(bbc.getName() + "," + bbc.getAge());
        bbc.eat();

    }
}
