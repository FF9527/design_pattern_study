package study.design.pattern.factory;

/**
 * @author:wuqi
 * @date:2020/4/3
 * @description:study.design.pattern.factory
 * @version:1.0
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("create 。。。");
        HotDryNoodlesFactory factory = new WuHanFactory();
        HotDryNoodles hotDryNoodles = factory.getHotDryNoodles();
        System.out.println(hotDryNoodles.toString());
    }
}
