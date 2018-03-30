package itAcademy.classes;

import itAcademy.interfaces.JavaBeanLaw;

public class BeanClass<T> implements JavaBeanLaw {
    private T tClass;

    public BeanClass(T tClass) {
        this.tClass = tClass;
    }

    @Override
    public Object createClassObject() throws Exception {
        AnnotationClass<T> annotationClass = new AnnotationClass<>();
        Object over = annotationClass.setRandom(tClass.getClass().newInstance(), tClass.getClass());
        return over;
    }
}