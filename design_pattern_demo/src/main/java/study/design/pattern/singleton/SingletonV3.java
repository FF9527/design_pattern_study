package study.design.pattern.singleton;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 * @author:wuqi
 * @date:2020/4/3
 * @description:study.design.pattern.singleton
 * @version:1.0
 */
public class SingletonV3 implements Cloneable, Serializable {
    /**
     * 注意细节：volatile修饰
     */
    private static volatile SingletonV3 INSTANCE;

    private static boolean IS_FIRST_CREATE = true;
    private SingletonV3(){
        //反反射
        if (IS_FIRST_CREATE){
            synchronized (SingletonV3.class){
                if (IS_FIRST_CREATE){
                    IS_FIRST_CREATE = false;
                }
            }
        }else{
            throw new UnsupportedOperationException("singleton object is already init().");
        }
    }

    public static SingletonV3 getInstance(){
        //双重验证锁
        if (INSTANCE == null){
            synchronized (SingletonV3.class){
                if (INSTANCE == null){
                    INSTANCE = new SingletonV3();
                }
            }
        }
        return INSTANCE;
    }

    /**
     * 反克隆
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("singleton object not support clone");
    }
    /**
     * 反序列化
     */
    private void readObject(ObjectInputStream in) throws InvalidObjectException {
        throw new InvalidObjectException("can't deserialize singleton");
    }

    private void readObjectNoData() throws InvalidObjectException {
        throw new InvalidObjectException("can't deserialize singleton");
    }
}
