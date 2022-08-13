package NewPhone;

/*
    新手机
 */

public class NewPhone extends Phone{

//    public void call(String name){
//        System.out.println("开启视频功能");
////        System.out.println("给" + name + "打电话");
//        super.call(name);
//    }

    // @Override是一个注解，可以帮我们检查重写方法的方法声明的正确性
    @Override
    public void call(String name){
        System.out.println("开启视频功能");
//        System.out.println("给" + name + "打电话");
        super.call(name);
    }


}
