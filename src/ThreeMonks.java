public class ThreeMonks {

    public static void main(String[] args) {
        int height1 = 150;
        int height2 = 165;
        int height3 = 200;

        //用临时身高变量保存起来
        int tempHeight = (height1>height2)? height1:height2;

        //做对比。用最大身高变量保存
        int maxHeight = (tempHeight>height3)? tempHeight:height3;

        System.out.println("Max height: " + maxHeight);
    }
}
