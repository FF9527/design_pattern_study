package study.design.pattern.state;

/**
 * @author:wuqi
 * @date:2020/4/21
 * @description:study.design.pattern.state
 * @version:1.0
 */
public interface State {
    void writeName(StateContext context, String name);
}
