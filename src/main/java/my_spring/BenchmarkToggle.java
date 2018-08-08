package my_spring;

import lombok.Data;

/**
 * @author Evgeny Borisov
 */
@Data
public class BenchmarkToggle implements BenchmarkToggleMBean {
    private boolean enabled;
}
