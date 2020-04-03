package study.design.pattern.factory;

/**
 * @author:wuqi
 * @date:2020/4/3
 * @description:study.design.pattern.factory
 * @version:1.0
 */
public abstract class HotDryNoodlesFactory {

    HotDryNoodles getHotDryNoodles(){
        return createHotDryNoodles();
    }

    protected abstract HotDryNoodles createHotDryNoodles();
}
