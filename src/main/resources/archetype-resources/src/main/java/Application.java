package ${package};

import pe.edu.nova.java.starters.boot.NovaPlatformApplication;
import pe.edu.nova.java.starters.boot.NovaPlatformSpringBootApplication;

/**
 * Clase principal de la aplicación.
 */
@NovaPlatformSpringBootApplication
public class Application {
    public static void main(String[] args) {
        NovaPlatformApplication.run(Application.class, args);
    }
}
