package Task5;

//Класс назвал Cars, т.к. в папке проекта уже есть класс с названием Car
public class Cars implements iEngine{
    private String engine;

    public Cars(String engine) {
        this.engine = engine;
    }

    @Override
    public void start() {
        System.out.println(" Запуск двигателя " + engine + ".");
    }

    
}


