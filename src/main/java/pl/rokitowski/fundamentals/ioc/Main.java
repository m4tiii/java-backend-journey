package pl.rokitowski.fundamentals.ioc;

public class Main {

    static void main(String[] args) throws Exception {
        MiniContainer c = new MiniContainer();
        Engine a = c.getBean(Engine.class);
        Engine b = c.getBean(Engine.class);
        IO.println(a == b);
    }
}

class Engine{ }
