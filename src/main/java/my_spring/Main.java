package my_spring;

import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        IRobot iRobot = ObjectFactory.getInstance().createObject(IRobot.class);
        while (true) {
            iRobot.cleanRoom();
            Thread.sleep(1000);
        }
    }
}
