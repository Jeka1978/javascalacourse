package my_spring;

/**
 * @author Evgeny Borisov
 */
@Deprecated  // just example of proxy design pattern
public class SuperDuperCleanerBenchmark  implements Cleaner{
    @InjectByType
    private SuperDuperCleaner superDuperCleaner;

    @Override
    public void clean(){
        long start = System.nanoTime();
        superDuperCleaner.clean();
        long end = System.nanoTime();
        System.out.println(end-start);
    }
}
