package study.design.pattern.state;

/**
 * @author:wuqi
 * @date:2020/4/21
 * @description:study.design.pattern.state
 * @version:1.0
 */
public class MultipleUpperCaseState implements State {
    private int count = 0;
    private State state;

    public void setState(State state){
        this.state = state;
    }

    @Override
    public void writeName(StateContext context, String name) {
        System.out.println(name.toUpperCase());
        if(++count > 1){
            count = 0;
            //两次大写后转换到一次小写
            context.setState(state == null ? new LowerCaseState() : state);
        }
    }
}
