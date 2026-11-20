package pl.rokitowski.fundamentals.annotations;

import java.lang.reflect.Method;

public class Main{
    @Loggable
    public void zapisz() {}

    @Loggable
    public void usun() {}

    @Loggable
    private void wyslijEmail() { }

    public void pomocnicza() {}


    static void main(String[] args) throws IllegalAccessException {
        Method[] methods = Main.class.getDeclaredMethods();

        for (Method m : methods){
            if(m.isAnnotationPresent(Loggable.class)){
                IO.println(m);
            }
        }

        User ok = new User("Mateusz", "m@x.pl", null);
        User bad = new User("Mateusz", " ", null);

        Validator.validate(ok);
        IO.println("ok good");

        Validator.validate(bad);
        IO.println("bad good");
    }
}