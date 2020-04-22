package study.design.pattern.command;

/**
 * @author:wuqi
 * @date:2020/4/17
 * @description:study.design.pattern.command
 * @version:1.0
 */
public class LightOffCommand implements Command {

    private Light light;

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
