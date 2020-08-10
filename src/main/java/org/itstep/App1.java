package org.itstep;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class App1
{
    public static void main( String[] args )
    {
        AtomicBoolean exit = new AtomicBoolean(true);

        Scanner scaner = new Scanner(System.in);

        Menu mainMenu = new Menu("Main menu:");

        mainMenu.add(new Menu("Полная распечатка базы данных", () -> {
            System.out.println("System.out.println(taxDB)");
            mainMenu.show();
        }));

        mainMenu.add(new Menu("Распечатка данных по конкретному коду.", () -> {
            System.out.println("Введите идентификационный номер.");
            System.out.println("printIdInfo(taxDB, scanner.nextInt())");
            mainMenu.show();
        }));

        mainMenu.add(new Menu("Распечатка данных по конкретному типу штрафа.", () -> {
            System.out.println("Введите тип штрафа.");
            System.out.println("printTaxesByType(taxDB, new Scanner(System.in).nextLine())");
            mainMenu.show();
        }));

        mainMenu.add(new Menu("Распечатка данных по конкретному городу.", () -> {
            System.out.println("Введите навание города.");
            System.out.println("printTaxesByCity(taxDB, new Scanner(System.in).nextLine())");
            mainMenu.show();
        }));

        mainMenu.add(new Menu("Добавление нового человека с информацией о нем.", () -> {
            System.out.println("Введите идентификационный номер.");
            System.out.println("addNewHuman(taxDB, scanner.nextInt())");
            mainMenu.show();
        }));

        mainMenu.add(new Menu("Добавление новых штрафов для уже существующей записи.", () -> {
            System.out.println("Введите иденцификационный номер.");
            System.out.println("addNewTax(taxDB, scanner.nextInt())");
            mainMenu.show();
        }));

        mainMenu.add(new Menu("Удаление штрафа.", () -> {
            System.out.println("Введите иденцификационный номер.");
            System.out.println("deleteTax(taxDB, scanner.nextInt())");
            mainMenu.show();
        }));

        mainMenu.add(new Menu("Замена информации о человеке.", () -> {
            System.out.println("Введите идентификационный номер.");
            System.out.println("changeHumanInfo(taxDB, scanner.nextInt())");
            mainMenu.show();
        }));

        mainMenu.add(new Menu("Замена информации о штрафах.", () -> {
            System.out.println("Введите иденцификационный номер.");
            System.out.println("changeTaxInfo(taxDB, scanner.nextInt())");
            mainMenu.show();
        }));

        mainMenu.add(new Menu("Test sub menu."))
        .add(new Menu("Sub sub menu", () -> {
            System.out.println("This is sub sub menu");
            mainMenu.show();
        }));;

        mainMenu.add(new Menu("Выход.", () -> exit.set(false)));

        do {
            mainMenu.show();
        } while (exit.get());
    }
}
