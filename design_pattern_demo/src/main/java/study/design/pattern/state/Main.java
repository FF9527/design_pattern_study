package study.design.pattern.state;

/**
 * @author:wuqi
 * @date:2020/4/21
 * @description:study.design.pattern.state
 * @version:1.0
 */
public class Main {
    public static void main(String[] args) {
        //一次小写，一次不变，两次大写 循环
        StateContext context = new StateContext();
        LowerCaseState lowerCaseState = new LowerCaseState();
        MultipleUpperCaseState multipleUpperCaseState = new MultipleUpperCaseState();
        multipleUpperCaseState.setState(lowerCaseState);
        NoCaseState noCaseState = new NoCaseState();
        lowerCaseState.setState(noCaseState);
        noCaseState.setState(multipleUpperCaseState);
        context.setState(lowerCaseState);
        context.writeName("Monday");
        context.writeName("Tuesday");
        context.writeName("Wednesday");
        context.writeName("Thursday");
        context.writeName("Friday");
        context.writeName("Saturday");
        context.writeName("Sunday");
        context.writeName("Monday");
    }
}
