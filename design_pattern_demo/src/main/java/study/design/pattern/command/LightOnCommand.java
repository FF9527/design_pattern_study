package study.design.pattern.command;

/**
 * @author:wuqi
 * @date:2020/4/17
 * @description:study.design.pattern.command
 * @version:1.0
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
