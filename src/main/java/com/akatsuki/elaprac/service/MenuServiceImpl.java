package com.akatsuki.elaprac.service;

import com.akatsuki.elaprac.aggregate.MenuDTO;
import com.akatsuki.elaprac.aggregate.MenuEntity;
import com.akatsuki.elaprac.repository.MenuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    MenuRepo menuRepo;

    @Autowired
    public MenuServiceImpl(MenuRepo menuRepo) {
        this.menuRepo = menuRepo;
    }

    @Override
    public List<MenuDTO> getMenus() {
        List<MenuEntity> menuList = menuRepo.findAll();
        List<MenuDTO> menuDTOS = new ArrayList<>();

        menuList.forEach(menuEntity -> {

            menuDTOS.add(new MenuDTO(menuEntity));
        });
        return menuDTOS;
    }
    @Override
    public MenuDTO getMenu(int menuCode){
        M
    }
}
