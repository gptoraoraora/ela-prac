package com.akatsuki.elaprac.controller;


import com.akatsuki.elaprac.aggregate.MenuDTO;
import com.akatsuki.elaprac.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MenuController {
    private MenuService menuService;

    @Autowired
    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping("/health")
    public ResponseEntity<String> healthCheck(){
        return ResponseEntity.ok("Fine~~~@!@@~@~@~@");
    }

    @GetMapping("/menus")
    public ResponseEntity<List<MenuDTO>> getMenus(){
        return ResponseEntity.ok(menuService.getMenus());
    }

    @GetMapping("/menu/{menuCode}")
    public ResponseEntity<MenuDTO> getMenu(@PathVariable int menuCode){
        return ResponseEntity.ok(menuService.getMenu(menuCode));
    }
}
