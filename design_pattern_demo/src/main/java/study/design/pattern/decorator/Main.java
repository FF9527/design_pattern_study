package study.design.pattern.decorator;

/**
 * @author:wuqi
 * @date:2020/4/2
 * @description:study.design.pattern.decorator
 * @version:1.0
 */
public class Main {
    public static void main(String[] args) {
        Component concrete = new ConcreteComponent();
        Component decorator = new DecoratorComponent(concrete);
        decorator.methodA();
    }
}
