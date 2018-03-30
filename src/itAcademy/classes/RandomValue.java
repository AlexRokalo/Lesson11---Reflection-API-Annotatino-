package itAcademy.classes;

import itAcademy.interfaces.RandomLaw;
import java.lang.reflect.Method;
import java.util.Random;

public class RandomValue implements RandomLaw {
    private Random random = new Random();

    @Override
    public String random(String methodName, Class c) {
        for (Method method : c.getDeclaredMethods()) {
            Class[] paramType = method.getParameterTypes();
            if (methodName.equals(method.getName())) {
                for (Class parametr : paramType) {
                    if (parametr.getSimpleName().equals("String"))
                        return randomName();
                    if (parametr.getSimpleName().equals("Date"))
                        return randomDate();
                    if (parametr.getSimpleName().equals("Boolean"))
                        return rondomBoolean();
                }
            }
        }
        return null;
    }

    private String randomDate() {
        String value ;
        String year = "19";
        String month = "";
        String day = "";
        for (int i = 0; i < 2; i++) {
            year += Integer.toString(random.nextInt(9));
            if (month.equals(""))
                month = Integer.toString(random.nextInt(1));
            else
                month += Integer.toString(random.nextInt(9) + 2);
            if (day.equals(""))
                day = Integer.toString(random.nextInt(2));
            else
                day += Integer.toString(random.nextInt(9) + 2);
        }
        value = year + " " + month + " " + day;
        return value;
    }

    private String randomName() {
        String value = "";
        for (int i = 0; i < (random.nextInt(8) + 4); i++) {
            char c = (char) (random.nextInt(26) + 'a');
            value += c;
        }
        return value;
    }

    private String rondomBoolean() {
        return Boolean.toString(random.nextBoolean());
    }
}