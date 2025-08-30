package io.github.ailnk0;

/**
 * A sample class for the Maven Central example library.
 */
public class Sample {

    /**
     * Returns a greeting message.
     * @param name The name to greet.
     * @return A greeting message.
     */
    public String sayHello(String name) {
        if (name == null || name.trim().isEmpty()) {
            return "Hello, World!";
        }
        return "Hello, " + name + "!";
    }
}
