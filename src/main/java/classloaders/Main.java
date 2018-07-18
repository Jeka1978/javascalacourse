package classloaders;

import com.naya.borisov.chain_of_responsibility2.Person;

import static classloaders.PersonService.personService;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {

        personService.doX();

    }
}
