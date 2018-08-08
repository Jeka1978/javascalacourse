package my_spring;

/**
 * @author Evgeny Borisov
 */
@Benchmark
public final class SuperDuperCleaner implements Cleaner {

    @InjectRandomInt(min = 3, max = 7)
    private int repeat;

    @Override
    public void clean() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("FFFFFffffffhssshhhhhhhhhhh");
        }
    }
}
