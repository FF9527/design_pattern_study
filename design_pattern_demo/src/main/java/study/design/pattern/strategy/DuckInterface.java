package study.design.pattern.strategy;

/**
 * @author:wuqi
 * @date:2020/4/1
 * @description:study.design.pattern.strategy
 * @version:1.0
 */
public interface DuckInterface {
    /**
     * 游水
     */
    void swim();
    /**
     * 外表
     */
    void display();
    /**
     * 飞翔
     */
    void performFly();
    /**
     * 鸣叫
     */
    void performQuack();
    void setFlyBehavior(FlyBehavior flyBehavior);
    void setQuackBehavior(QuackBehavior quackBehavior);
}
