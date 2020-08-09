package org.itstep;

/**
 * Hello world!
 *
 */
public class App1
{
    public static void main( String[] args )
    {
        Menu mainMenu = new Menu("Main", context -> {
            System.out.println("Test" + context);}
            );

//            for (int i = 0; i < mainMenu.getMenuList().size(); i++) {
//                System.out.print(i+1 + ". ");
//                System.out.println(mainMenu.getMenuList().get(i).toString());
//            }

        mainMenu.addSubMenu(new Menu("Полная распечатка базы данных.", null));
        mainMenu.addSubMenu(new Menu("Распечатка данных по конкретному коду.", null));
        mainMenu.addSubMenu(new Menu("Распечатка данных по конкретному типу штрафа.", null));
        mainMenu.addSubMenu(new Menu("Распечатка данных по конкретному городу.", null));
        mainMenu.addSubMenu(new Menu("Добавление нового человека с информацией о нем.", null));
        mainMenu.addSubMenu(new Menu("Добавление новых штрафов для уже существующей записи.", null));
        mainMenu.addSubMenu(new Menu("Удаление штрафа.", null));
        mainMenu.addSubMenu(new Menu("Замена информации о человеке.", null));
        mainMenu.addSubMenu(new Menu("Замена информации о штрафах.", null));
        mainMenu.addSubMenu(new Menu("Выход.", null));

        mainMenu.getAction();
    }
}
