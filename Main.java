package Homework6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    /*Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы.
    Реализовать в Java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации
 и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:

“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объём ЖД
3 - Операционная система
4 - Цвет …

Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации
 можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.*/
    public static void main(String[] args) throws Exception{
        Notebook nout1 = new Notebook("Asus", "Laptop 15 D543MA-DM1368", 15.6,
                "Intel Celeron N4020", 4, "Intel UHD Graphics", 1000, "без ОС", "черный", 39900);
        Notebook nout2 = new Notebook("Asus", "Laptop A416EA-EB1033W", 14,
                "Intel Pentium Gold 7505", 4, "Intel UHD Graphics", 128, "Windows 11 Home Single Language", "серый", 27999);
        Notebook nout3 = new Notebook("Acer", "Aspire 1 A115-32-P859", 15.6,
                "Intel Pentium Silver N6000", 8, "Intel UHD Graphics", 128, "Windows 11 Home Single Language", "серебристый", 27199);
        Notebook nout4 = new Notebook("Lenovo", "IdeaPad 1 14IGL05", 15.6,
                "Intel Pentium Silver N5030", 4, "Intel UHD Graphics 605", 128, "Windows 10 Home Single Language", "серый", 29999);
        Notebook nout5 = new Notebook("Lenovo", "IdeaPad 3 15ARE05", 15.6,
                "AMD Ryzen 5 4500U", 4, "AMD Radeon Graphics", 128, "Windows 10 Home Single Language", "серый", 50299);
        Notebook nout6 = new Notebook("Huawei", "MateBook D 14 NbB-WAH9", 14,
                "Intel Core i5-10210U", 4, "Intel UHD Graphics 620", 256, "Windows 10 Home Single Language", "серый", 51999);
        Notebook nout7 = new Notebook("Msi", "Modern 15 B12M-209RU", 15.6,
                "Intel Core i5-1235U", 16, "Intel Iris Xe Graphics", 512, "Windows 11 Home Single Language", "черный", 52999);
        Notebook nout8 = new Notebook("Acer", "Aspire 3 A317-54-38F2", 17.3,
                "Intel Core i3-1215U", 8, "Intel UHD Graphics", 512, "Windows 11 Home Single Language", "серебристый", 54999);
        Notebook nout9 = new Notebook("Asus", "VivoBook 16X M1603QA-MB218", 16,
                "AMD Ryzen 7 5800H", 8, "AMD Radeon Graphics", 512, "без ОС", "синий", 57999);

        HashSet<Notebook> nouts = new HashSet<Notebook>(Arrays.asList(
                nout1, nout2, nout3, nout4, nout5, nout6, nout7, nout8, nout9));

        Scanner scanner = new Scanner(System.in);

        menu(nouts, scanner);

        scanner.close();


    }

    public static void menu(HashSet<Notebook> nouts, Scanner scanner) {
        System.out.println("Для подбора ноутбука выберите одну из характеристик");
        System.out.println("-".repeat(50));
        boolean flag = true;
        while (flag) {
            System.out.println("-".repeat(50));
            StringBuilder builder = new StringBuilder();
            builder.append("Просмотр всех моделей -> 'all';\n")
                    .append("Выбор по бренду - '1';\n")
                    .append("Выбор по названию модели - '2';\n")
                    .append("Выбор по диагонали экрана - '3';\n")
                    .append("Выбор по процессору - '4';\n")
                    .append("Выбор по объёму памяти - '5';\n")
                    .append("Выбор по видеокарте - '6';\n")
                    .append("Выбор по объёму накопителя - '7';\n")
                    .append("Выбор по операционной системе - '8';\n")
                    .append("Выбор по цвету - '9';\n")
                    .append("Выбор по цене - '0';\n")
                    .append("Выход - 'q';");
            System.out.println(builder.toString());

            System.out.print("-> ");
            String point = scanner.nextLine();
            switch (point) {
                case "all" -> Methods.isCatalog(nouts);
                case "1" -> Methods.findBrand(nouts, scanner);
                case "2" -> Methods.findName(nouts, scanner);
                case "3" -> Methods.findScreen(nouts, scanner);
                case "4" -> Methods.findCPU(nouts, scanner);
                case "5" -> Methods.findRam(nouts, scanner);
                case "6" -> Methods.findVideo(nouts, scanner);
                case "7" -> Methods.findStorage(nouts, scanner);
                case "8" -> Methods.findOS(nouts, scanner);
                case "9" -> Methods.findColor(nouts, scanner);
                case "0" -> Methods.findCost(nouts, scanner);
                case "q" -> flag = false;
                default -> {
                    System.out.println("Такого выбора нет");
                    menu(nouts, scanner);
                }
            }

        }
    }

}
