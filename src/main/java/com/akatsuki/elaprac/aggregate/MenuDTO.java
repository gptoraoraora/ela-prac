package com.akatsuki.elaprac.aggregate;

import com.akatsuki.elaprac.aggregate.MenuEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MenuDTO {
    private int menuCode;
    private String menuName;
    private int menuPrice;
    private int categoryCode;
    private String categoryName;
    private int parentCategoryCode;
    private char orderableStatus;

    public MenuDTO(MenuEntity menuEntity) {
        this.menuCode = menuEntity.getMenuCode();
        this.menuName = menuEntity.getMenuName();
        this.menuPrice = menuEntity.getMenuPrice();
        this.categoryCode = menuEntity.getCategoryCode().getCategoryCode();
        this.categoryName = menuEntity.getCategoryCode().getCategory_name();
        this.parentCategoryCode = menuEntity.getCategoryCode().getRefCategoryCode();
        this.orderableStatus = menuEntity.getOrderableStatus();
    }
}
