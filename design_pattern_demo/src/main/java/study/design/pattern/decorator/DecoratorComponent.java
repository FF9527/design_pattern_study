package study.design.pattern.decorator;

/**
 * @author:wuqi
 * @date:2020/4/2
 * @description:study.design.pattern.decorator
 * @version:1.0
 */
public class DecoratorComponent implements Component {

    private Component component;

    public DecoratorComponent(Component component){
        this.component = component;
    }

    @Override
    public void methodA() {
        component.methodA();
        System.out.println("特技得加钱");
    }
}
