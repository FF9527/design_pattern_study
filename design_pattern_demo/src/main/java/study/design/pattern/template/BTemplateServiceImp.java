package study.design.pattern.template;

/**
 * @author:wuqi
 * @date:2020/4/13
 * @description:study.design.pattern.template
 * @version:1.0
 */
public class BTemplateServiceImp extends AbstractTemplateService {

    @Override
    protected boolean isDoSomething1() {
        return false;
    }

    @Override
    protected void doSomething2() {
        System.out.println("I am B");
    }

    @Override
    protected void doSomething3() {
        //empty
    }
}
