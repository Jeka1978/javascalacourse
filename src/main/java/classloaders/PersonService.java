package classloaders;

/**
 * @author Evgeny Borisov
 */
public class PersonService {
   public static PersonService personService;

    static {
        System.out.println("Class was loaded");
        personService = new PersonService();
    }
    private PersonService() {
        System.out.println("Person was created");
    }
    public void doX(){
        System.out.println("XXXXXXXXX");
    }
}
