package study.design.pattern.command;

/**
 * @author:wuqi
 * @date:2020/4/17
 * @description:study.design.pattern.command
 * @version:1.0
 */
public class Invoker {
    private Command command;

    public Invoker(Command command){
        this.command = command;
    }

    public void buttonWasPressed(){
        command.execute();
    }

}
