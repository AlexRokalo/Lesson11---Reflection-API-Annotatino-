package itAcademy.classes;

import java.lang.reflect.Method;
import java.util.Date;

public class RandomType {

    public Class setRandomType(String methodName, Class c) {
        for (Method method : c.getDeclaredMethods()) {
            Class[] paramType = method.getParameterTypes();
            if (methodName.equals(method.getName())) {
                for (Class parametr : paramType) {
                    if (parametr.getSimpleName().equals("String"))
                        return randomName();
                    if (parametr.getSimpleName().equals("Date"))
                        return randomDate();
                    if (parametr.getSimpleName().equals("Boolean"))
                        return randomHelthy();
                }
            }
        }
        return null;
    }

    private Class<Date> randomDate() {
        return Date.class;
    }

    private Class<String> randomLastName() {
        return String.class;
    }

    private Class randomHelthy() {
        return Boolean.class;
    }

    private Class<String> randomName() {
        return String.class;
    }
}