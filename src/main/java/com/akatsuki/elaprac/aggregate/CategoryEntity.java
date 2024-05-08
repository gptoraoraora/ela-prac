package com.akatsuki.elaprac.aggregate;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "tbl_category")
public class CategoryEntity {

    @Id
    @Column(name = "category_code")
    private int categoryCode;
    @Column(name = "category_name")
    private String category_name;
    @Column(name = "ref_category_code")
    private int refCategoryCode;

}
