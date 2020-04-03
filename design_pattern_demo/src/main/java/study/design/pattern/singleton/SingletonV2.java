package study.design.pattern.singleton;

/**
 * @author:wuqi
 * @date:2020/4/3
 * @description:study.design.pattern.singleton
 * @version:1.0
 */
public class SingletonV2 {
    /**
     * 注意细节：volatile修饰
     */
    private static volatile SingletonV2 INSTANCE;

    private SingletonV2(){}

    public static SingletonV2 getInstance(){
        //双重验证锁
        if (INSTANCE == null){
            synchronized (SingletonV2.class){
                if (INSTANCE == null){
                    INSTANCE = new SingletonV2();
                }
            }
        }
        return INSTANCE;
    }
}
