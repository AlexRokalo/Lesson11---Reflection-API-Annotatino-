package itAcademy.classes;

import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RandomData {

    public Object setRandomData(String methodName, Class c) throws ParseException {
        for (Method method : c.getDeclaredMethods()) {
            Class[] paramType = method.getParameterTypes();
            if (methodName.equals(method.getName())) {
                for (Class parametr : paramType) {
                    if (parametr.getSimpleName().equals("String"))
                        return new RandomValue().random(methodName, c);
                    if (parametr.getSimpleName().equals("Date"))
                        return randomDate(methodName, c);
                    if (parametr.getSimpleName().equals("Boolean"))
                        return Boolean.valueOf(new RandomValue().random(methodName, c));
                }
            }
        }
        return null;
    }

    private Date randomDate(String methodName, Class c) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy MM dd");
        Date date = format.parse(new RandomValue().random(methodName, c));
        return date;
    }
}