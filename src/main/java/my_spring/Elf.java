package my_spring;

import lombok.Data;

/**
 * @author Evgeny Borisov
 */
@Data
public class Elf {
    @InjectRandomInt(min=5,max=20)
    private int power;
    @InjectRandomInt(min=20,max=30)
    private int speed;
}
