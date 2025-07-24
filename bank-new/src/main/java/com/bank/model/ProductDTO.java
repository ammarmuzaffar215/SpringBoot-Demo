package com.bank.model;

import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

    private Long productID;
    private String description;
    private String productName;


    private Set<AccountDTO> accounts = new HashSet<>();
}