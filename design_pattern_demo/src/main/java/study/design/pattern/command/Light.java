package study.design.pattern.command;

/**
 * @author:wuqi
 * @date:2020/4/17
 * @description:study.design.pattern.command
 * @version:1.0
 */
public class Light {

    private String addr;

    public Light(String addr){
        this.addr = addr;
    }

    public void on(){
        System.out.println(addr + " light on");
    }

    public void off(){
        System.out.println(addr + " light off");
    }
}
