package study.design.pattern.singleton;

/**
 * @author:wuqi
 * @date:2020/4/3
 * @description:study.design.pattern.singleton
 * @version:1.0
 */
public class SingletonV0 {
    private static final SingletonV0 INSTANCE = new SingletonV0();

    private SingletonV0(){}

    public static SingletonV0 getInstance(){
        return INSTANCE;
    }
}
