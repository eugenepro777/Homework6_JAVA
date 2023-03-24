package Homework6;

public class Notebook {

    private String name;
    private String brand;
    private String processor;
    private String os;
    private String color;
    private String videocard;
    private double screenDiagonal;
    private int storageCapacity;
    private int ram;
    private int cost;

    /**
     *  Полный конструктор ноутбука
     * @param brand Бренд
     * @param name Название модели
     * @param screenDiagonal Диагональ экрана
     * @param processor Процессор
     * @param ram Объём памяти
     * @param videocard Видеокарта
     * @param storageCapacity Объём накопителя
     * @param os Операционная система
     * @param color Цвет
     * @param cost Цена
     */
    public Notebook(String brand, String name, double screenDiagonal, String processor,
                    int ram, String videocard, int storageCapacity, String os, String color,
                    int cost) {
        this.brand = brand;
        this.name = name;
        this.screenDiagonal = screenDiagonal;
        this.processor = processor;
        this.ram = ram;
        this.videocard = videocard;
        this.storageCapacity = storageCapacity;
        this.os = os;
        this.color = color.toLowerCase();
        this.cost = cost;
    }

    public Notebook(String processor, int storageCapacity, String videocard,
                    double screenDiagonal, int ram, String os, int cost) {
        this.processor = processor;
        this.storageCapacity = storageCapacity;
        this.videocard = videocard;
        this.screenDiagonal = screenDiagonal;
        this.ram = ram;
        this.os = os;
        this.cost = cost;
    }

    public Notebook(String processor, double screenDiagonal, int storageCapacity, int ram) {
        this.processor = processor;
        this.screenDiagonal = screenDiagonal;
        this.storageCapacity = storageCapacity;
        this.ram = ram;
    }

    public Notebook(String brand, String os, String color, int cost) {
        this.brand = brand;
        this.os = os;
        this.color = color;
        this.cost = cost;
    }


    public String getInfo() {
        StringBuilder str = new StringBuilder();
        str.append("Бренд: " + this.brand + "\n");
        str.append("Название: " + this.name + "\n");
        str.append("Диагональ экрана: " + this.screenDiagonal + "\n");
        str.append("Процессор: " + this.processor + "\n");
        str.append("Объём памяти: " + this.ram + " Гб\n");
        str.append("Видеокарта: " + this.videocard + "\n");
        str.append("Объём накопителя: " + this.storageCapacity + " Гб\n");
        str.append("Операционная система: " + this.os + "\n");
        str.append("Цвет: " + this.color + "\n");
        str.append("Цена: " + this.cost + " руб. \n");

        return str.toString();
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public String getBrand() {
        return this.brand;
    }

    public String getName() {
        return this.name;
    }

    public int getRam() {
        return this.ram;
    }

    public String getProcessor() {
        return this.processor;
    }

    public double getScreenDiagonal() {
        return this.screenDiagonal;
    }

    public String getVideocard() {
        return this.videocard;
    }

    public int getStorageCapacity() {
        return this.storageCapacity;
    }

    public String getOS() {
        return this.os;
    }

    public String getColor() {
        return this.color;
    }

    public int getCost() {
        return this.cost;
    }
}
