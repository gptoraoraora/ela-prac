package com.akatsuki.elaprac.service;

import com.akatsuki.elaprac.aggregate.MenuDTO;

import java.util.List;

public interface MenuService {
    List<MenuDTO> getMenus();

    MenuDTO getMenu(int menuCode);
}
