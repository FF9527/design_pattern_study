package study.design.pattern.strategy;

/**
 * @author:wuqi
 * @date:2020/4/1
 * @description:study.design.pattern.strategy
 * @version:1.0
 */
public class NotFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I cant fly!");
    }
}
