package study.design.pattern.command;

/**
 * @author:wuqi
 * @date:2020/4/17
 * @description:study.design.pattern.command
 * @version:1.0
 */
public class Client {
    public static void main(String[] args) {
        Light light = new Light("room");
        LightOnCommand command = new LightOnCommand(light);
        Invoker invoker = new Invoker(command);
        invoker.buttonWasPressed();
    }
}
