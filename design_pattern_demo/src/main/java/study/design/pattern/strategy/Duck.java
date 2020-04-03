package study.design.pattern.strategy;

/**
 * @author:wuqi
 * @date:2020/4/1
 * @description:study.design.pattern.strategy
 * @version:1.0
 */
public class Duck implements DuckInterface {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    @Override
    public void swim() {
        System.out.println("I am swimming!");
    }

    @Override
    public void display() {
        System.out.println("I have white feathers!");
    }

    @Override
    public void performFly() {
        if (flyBehavior == null){
            System.out.println("no flyBehavior!");
            return;
        }
        flyBehavior.fly();
    }

    @Override
    public void performQuack() {
        if (quackBehavior == null){
            System.out.println("no quackBehavior!");
            return;
        }
        quackBehavior.quack();
    }

    @Override
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    @Override
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
