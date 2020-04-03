package study.design.pattern.singleton;

/**
 * @author:wuqi
 * @date:2020/4/3
 * @description:study.design.pattern.singleton
 * @version:1.0
 */
public class SingletonV1 {

    private static SingletonV1 INSTANCE;

    private SingletonV1(){}

    public static SingletonV1 getInstance(){
        if (INSTANCE == null){
            //延迟加载
            INSTANCE = new SingletonV1();
        }
        return INSTANCE;
    }
}
