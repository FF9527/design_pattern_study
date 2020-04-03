package study.design.pattern.strategy;

/**
 * @author:wuqi
 * @date:2020/4/2
 * @description:study.design.pattern.strategy
 * @version:1.0
 */
public class Main {

    public static void main(String[] args) {

        FlyBehavior canFly = new CanFly();
        FlyBehavior notFly = new NotFly();
        //一个会飞的鸭子
        DuckInterface duck = new Duck();
        duck.setFlyBehavior(canFly);
        duck.performFly();
        //现在翅膀断了
        duck.setFlyBehavior(notFly);
        duck.performFly();
    }
}
