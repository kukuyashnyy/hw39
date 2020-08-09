package org.itstep;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String name;
    private List<Menu> menuList = new ArrayList<>();
    private Action<Context> action;

    public Menu(String name, Action<Context> action) {
        this.name = name;
        this.action = action;
    }

    public Action<Context> getAction() {
        return action;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void addSubMenu(Menu menu) { menuList.add(menu);}

    @Override
    public String toString() {
        return name;
    }
}
