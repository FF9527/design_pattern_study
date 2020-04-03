package study.design.pattern.strategy;

/**
 * @author:wuqi
 * @date:2020/4/1
 * @description:study.design.pattern.strategy
 * @version:1.0
 */
public class GaGa implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("ga  ga  ...");
    }
}
