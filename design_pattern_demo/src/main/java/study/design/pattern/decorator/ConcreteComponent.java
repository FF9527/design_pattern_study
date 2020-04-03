package study.design.pattern.decorator;

/**
 * @author:wuqi
 * @date:2020/4/2
 * @description:study.design.pattern.decorator
 * @version:1.0
 */
public class ConcreteComponent implements Component {
    @Override
    public void methodA() {
        System.out.println("想加特技");
    }
}
