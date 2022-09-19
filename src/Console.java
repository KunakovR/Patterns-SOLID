public class Console implements Logger {

    //Dependency Inversion Principle
    void printlnConsole() {
        System.out.println("Добро пожаловать в магазин" + "\n" +
                "Выберите товар и количество, чтобы выйти нажмите end");
    }

    @Override
    public void log() {
        printlnConsole();
    }
}
