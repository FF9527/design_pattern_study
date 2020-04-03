package study.design.pattern.singleton;

/**
 * @author:wuqi
 * @date:2020/4/3
 * @description:study.design.pattern.singleton
 * @version:1.0
 */
public class SingletonV4 {

    private SingletonV4(){}

    /**
     * 利用静态内部类的延迟加载
     */
    private static class SingletonHolder{
        private static final SingletonV4 INSTANCE = new SingletonV4();
    }

    public SingletonV4 getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
