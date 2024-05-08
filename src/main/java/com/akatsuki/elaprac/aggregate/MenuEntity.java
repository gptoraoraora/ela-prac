package com.akatsuki.elaprac.aggregate;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "tbl_menu")
public class MenuEntity {
    @Id
    @Column(name = "menu_code")
    private int menuCode;
    @Column(name = "menu_name")
    private String menuName;
    @Column(name = "menu_price")
    private int menuPrice;

    @JoinColumn(name = "category_code")
    @OneToOne
    private CategoryEntity categoryCode;

    @Column(name = "orderable_status")
    private char orderableStatus;
}
