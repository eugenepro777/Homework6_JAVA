package Homework6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

public class Methods {

    public static void isCatalog(HashSet<Notebook> nouts) {
        System.out.println("\n\tВ магазине представлены ноутбуки\n");
        for (Notebook item : nouts) {
            item.getInfo();
            System.out.println(item);
        }
        try {
            TimeUnit.SECONDS.sleep(8);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void findStorage(HashSet<Notebook> nouts, Scanner scanner) {
        TreeSet<Integer> drive = new TreeSet<>();
        for (Notebook item :
                nouts) {
            drive.add(item.getStorageCapacity());
        }
        System.out.println("-".repeat(50));
        System.out.printf("В наличии ноутбуки с объёмом накопителя - %s%n\n",
                drive.toString().replaceAll("^\\[|\\]$", ""));
        System.out.print("Какой объём интересует: ");

        String value = scanner.nextLine();
        int find = Integer.parseInt(value);
        if (drive.contains(find)) {
            System.out.println("-".repeat(50));
            System.out.println("Подходящие по запросу модели: \n");
            for (Notebook item :
                    nouts) {
                if (item.getStorageCapacity() == find)
                    System.out.println(item.getInfo());
            }
        } else {
            System.out.println("С таким объёмом нет в наличии");
            findStorage(nouts, scanner);
        }
    }
    public static void findRam(HashSet<Notebook> nouts, Scanner scanner) {
        TreeSet<Integer> ram = new TreeSet<>();
        for (Notebook item :
                nouts) {
            ram.add(item.getRam());
        }
        System.out.println("-".repeat(50));
        System.out.printf("В наличии ноутбуки с объёмом оперативной памяти - %s%n",
                ram.toString().replaceAll("^\\[|\\]$", ""));
        System.out.print("Какой объём интересует: ");

        String value = scanner.nextLine();
        int find = Integer.parseInt(value);
        if (ram.contains(find)) {
            System.out.println("-".repeat(50));
            System.out.println("Подходящие по запросу модели: \n");
            for (Notebook item :
                    nouts) {
                if (item.getRam() == find)
                    System.out.println(item.getInfo());
            }
        } else {
            System.out.println("С таким объёмом нет в наличии");
            findRam(nouts, scanner);
        }
    }

    public static void findScreen(HashSet<Notebook> nouts, Scanner scanner) {
        TreeSet<Double> screen = new TreeSet<>();
        for (Notebook item :
                nouts) {
            screen.add(item.getScreenDiagonal());
        }
        System.out.println("-".repeat(50));
        System.out.printf("В наличии ноутбуки с диагональю экрана - %s%n",
                screen.toString().replaceAll("^\\[|\\]$", ""));
        System.out.print("Какая диагональ интересует: ");

        String value = scanner.nextLine();
        double find = Double.parseDouble(value);
        if (screen.contains(find)) {
            System.out.println("-".repeat(50));
            System.out.println("Подходящие по запросу модели: \n");
            for (Notebook item :
                    nouts) {
                if (item.getScreenDiagonal() == find)
                    System.out.println(item.getInfo());
            }
        } else {
            System.out.println("С такой диагональю экрана нет в наличии");
            findScreen(nouts, scanner);
        }
    }

    public static void findBrand(HashSet<Notebook> nouts, Scanner scanner) {
        TreeSet<String> brand = new TreeSet<>();
        for (Notebook item :
                nouts) {
            brand.add(item.getBrand());
        }
        System.out.println("-".repeat(50));
        System.out.printf("В наличии ноутбуки производителей - %s%n",
                brand.toString().replaceAll("^\\[|\\]$", ""));
        System.out.print("Какой бренд интересует: ");

        String value = scanner.nextLine();
        if (brand.contains(value)) {
            System.out.println("-".repeat(50));
            System.out.println("Подходящие по вашему запросу: \n");
            for (Notebook item :
                    nouts) {
                if (item.getBrand().equals(value))
                    System.out.println(item.getInfo());
            }
        } else {
            System.out.println("Такого производителя нет в наличии");
            findBrand(nouts, scanner);
        }
    }

    public static void findName(HashSet<Notebook> nouts, Scanner scanner) {
        TreeSet<String> name = new TreeSet<>();
        for (Notebook item :
                nouts) {
            name.add(item.getName());
        }
        System.out.println("-".repeat(50));
        System.out.printf("В наличии ноутбуки моделей - %s%n",
                name.toString().replaceAll("^\\[|\\]$", ""));
        System.out.print("Какая модель интересует: ");

        String value = scanner.nextLine();
        if (name.contains(value)) {
            System.out.println("-".repeat(50));
            System.out.println("Подходящие по вашему запросу: \n");
            for (Notebook item :
                    nouts) {
                if (item.getName().equals(value))
                    System.out.println(item.getInfo());
            }
        } else {
            System.out.println("Такой модели нет в наличии");
            findName(nouts, scanner);
        }
    }

    public static void findColor(HashSet<Notebook> nouts, Scanner scanner) {
        TreeSet<String> color = new TreeSet<>();
        for (Notebook item :
                nouts) {
            color.add(item.getColor());
        }
        System.out.println("-".repeat(50));
        System.out.printf("В наличии ноутбуки следующих цветов - %s%n",
                color.toString().replaceAll("^\\[|\\]$", ""));
        System.out.print("Какой цвет интересует: ");

        String value = scanner.nextLine();
        if (color.contains(value)) {
            System.out.println("Подходящие по вашему запросу: \n");
            for (Notebook item :
                    nouts) {
                if (item.getColor().equals(value))
                    System.out.println(item.getInfo());
            }
        } else {
            System.out.println("Такой модели нет в наличии \n");
            findColor(nouts, scanner);
        }
    }

    public static void findCPU(HashSet<Notebook> nouts, Scanner scanner) {
        TreeSet<String> cpu = new TreeSet<>();
        for (Notebook item :
                nouts) {
            cpu.add(item.getProcessor());
        }
        System.out.println("-".repeat(50));
        System.out.printf("В наличии ноутбуки с процессором - %s%n",
                cpu.toString().replaceAll("^\\[|\\]$", ""));
        System.out.print("Какой процессор интересует: ");

        String value = scanner.nextLine();
        if (cpu.contains(value)) {
            System.out.println("Подходящие по вашему запросу: \n");
            for (Notebook item :
                    nouts) {
                if (item.getProcessor().equals(value))
                    System.out.println(item.getInfo());
            }
        } else {
            System.out.println("Такой модели нет в наличии");
            findCPU(nouts, scanner);
        }
    }

    public static void findVideo(HashSet<Notebook> nouts, Scanner scanner) {
        TreeSet<String> card = new TreeSet<>();
        for (Notebook item :
                nouts) {
            card.add(item.getVideocard());
        }
        System.out.println("-".repeat(50));
        System.out.printf("В наличии ноутбуки с видеокартой - %s%n",
                card.toString().replaceAll("^\\[|\\]$", ""));
        System.out.print("С какой картой интересует: ");

        String value = scanner.nextLine();
        if (card.contains(value)) {
            System.out.println("Подходящие по вашему запросу: \n");
            for (Notebook item :
                    nouts) {
                if (item.getVideocard().equals(value))
                    System.out.println(item.getInfo());
            }
        } else {
            System.out.println("Такой модели нет в наличии");
            findVideo(nouts, scanner);
        }
    }

    public static void findOS(HashSet<Notebook> nouts, Scanner scanner) {
        TreeSet<String> os = new TreeSet<>();
        for (Notebook item :
                nouts) {
            os.add(item.getOS());
        }
        System.out.println("-".repeat(50));
        System.out.printf("В наличии ноутбуки с ОС - %s%n",
                os.toString().replaceAll("^\\[|\\]$", ""));
        System.out.print("Какая модель интересует: ");

        String value = scanner.nextLine();
        if (os.contains(value)) {
            System.out.println("Подходящие по вашему запросу: \n");
            for (Notebook item :
                    nouts) {
                if (item.getOS().equals(value))
                    System.out.println(item.getInfo());
            }
        } else {
            System.out.println("Такой модели нет в наличии");
            findOS(nouts, scanner);
        }
    }

    public static void findCost(HashSet<Notebook> nouts, Scanner scanner) {
        TreeSet<Integer> cost = new TreeSet<>();
        for (Notebook item :
                nouts) {
            cost.add(item.getCost());
        }
        System.out.println("-".repeat(50));
        System.out.printf("В наличии ноутбуки по следующим ценам - %s%n",
                cost.toString().replaceAll("^\\[|\\]$", ""));
        System.out.print("Какая цена интересует: ");

        String value = scanner.nextLine();
        int find = Integer.parseInt(value);
        if (cost.contains(find)) {
            System.out.println("-".repeat(50));
            System.out.println("Подходящие по цене модели: \n");
            for (Notebook item :
                    nouts) {
                if (item.getCost() == find)
                    System.out.println(item.getInfo());
            }
        } else {
            System.out.println("С такой ценой нет в наличии");
            findCost(nouts, scanner);
        }
    }

}
