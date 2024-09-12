import java.lang.reflect.Method;

import javafx.scene.effect.Reflection;

class Main {
    public static void main(String... arg) throws Exception {
        Object o = new Object();
        Method m = Object.class.getMethod("toString");

        m.setAccessible(true);
    }

}