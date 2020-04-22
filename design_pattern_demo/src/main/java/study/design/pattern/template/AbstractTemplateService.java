package study.design.pattern.template;

/**
 * @author:wuqi
 * @date:2020/4/13
 * @description:study.design.pattern.template
 * @version:1.0
 */
public abstract class AbstractTemplateService implements TemplateService {
    @Override
    public void templateMethod() {
        //模板方法中的钩子方法isDoSomething1，子类可以改变方法执行顺序
        if(isDoSomething1()){
            doSomething1();
        }
        doSomething2();
        doSomething3();
    }

    protected boolean isDoSomething1(){
        return true;
    }

    protected void doSomething1(){
        System.out.println("something1 start");
    }

    /**
     * 子类不必实现，可以是空方法
     */
    protected void doSomething2(){

    }

    protected abstract void doSomething3();

}
