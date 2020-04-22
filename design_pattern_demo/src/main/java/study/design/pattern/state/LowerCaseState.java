package study.design.pattern.state;

/**
 * @author:wuqi
 * @date:2020/4/21
 * @description:study.design.pattern.state
 * @version:1.0
 */
public class LowerCaseState implements State {

    private State state;

    public void setState(State state){
        this.state = state;
    }

    @Override
    public void writeName(StateContext context, String name) {
        System.out.println(name.toLowerCase());
        //转换两次大写
        context.setState(state == null ? new MultipleUpperCaseState(): state);
    }
}
