package study.design.pattern.factory;

/**
 * @author:wuqi
 * @date:2020/4/3
 * @description:study.design.pattern.factory
 * @version:1.0
 */
public class WuHanFactory extends HotDryNoodlesFactory {

    @Override
    public HotDryNoodles createHotDryNoodles() {
        System.out.println("WuHan HotDryNoodles!");
        return new WuHanHotDryNoodles();
    }
}
