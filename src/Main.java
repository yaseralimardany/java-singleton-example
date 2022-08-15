public class Main {
    public static void main(String[] args) {
        SingletonClass singletonInstance1 = SingletonClass.getInstance();
        SingletonClass singletonInstance2 = SingletonClass.getInstance();

        System.out.println(singletonInstance1 == singletonInstance2);
    }
}

class SingletonClass {
    private static SingletonClass instance;

    public static synchronized SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }

        return instance;
    }
}