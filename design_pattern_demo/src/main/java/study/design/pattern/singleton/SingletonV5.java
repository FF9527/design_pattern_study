package study.design.pattern.singleton;

/**
 * @author:wuqi
 * @date:2020/4/3
 * @description:study.design.pattern.singleton
 * @version:1.0
 */
public enum SingletonV5 {

    /**
     * Java的枚举类型其实是一个编译期的一个语法糖
     *  enum 编译后public final class
     *  INSTANCE  编译后 public static final SingletonV5 INSTANCE;
     *  静态块初始化+反克隆+反序列化
     */
    INSTANCE;

}
