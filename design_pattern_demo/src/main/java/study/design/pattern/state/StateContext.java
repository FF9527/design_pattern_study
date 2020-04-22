package study.design.pattern.state;

/**
 * @author:wuqi
 * @date:2020/4/21
 * @description:study.design.pattern.state
 * @version:1.0
 */
public class StateContext {

    private State state;

    public StateContext(){
        this.state = new LowerCaseState();
    }
    public void setState(State state){
        this.state = state;
    }

    public void writeName(String name){
        state.writeName(this,name);
    }

}
