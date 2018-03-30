package itAcademy.classes;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            BeanClass<Patient> beanClass = new BeanClass(new Patient());
            Patient patient = (Patient) beanClass.createClassObject();
            System.out.println(patient);

            BeanClass<Student> studentBeanClass = new BeanClass<>(new Student());
            Student student = (Student) studentBeanClass.createClassObject();
            System.out.println(student);
        } catch (Exception o) {
            o.getMessage();
        }

    }
}