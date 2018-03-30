package itAcademy.classes;

import itAcademy.interfaces.Generate;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;


public class AnnotationClass<T> {
    public T setRandom(Object o, Class<?> c) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException, ParseException {
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            Annotation[] annotations = field.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation.annotationType().equals(Generate.class)) {
                    field.setAccessible(true);
                    String methodName = "set" + magic(field.getName());
                    Method setNameMethod = c.getMethod(methodName, new RandomType().setRandomType(methodName, c));
                    setNameMethod.invoke(o, new RandomData().setRandomData(methodName, c));
                }
            }
        }
        return (T) o;
    }

    private String magic(String fieldName) {
        String s = fieldName;
        char symbol = s.charAt(0);
        symbol = Character.toUpperCase(symbol);
        return s = s.replace(s.charAt(0), symbol);
    }
}