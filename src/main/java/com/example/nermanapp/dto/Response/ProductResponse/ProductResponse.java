package com.example.nermanapp.dto.Response.ProductResponse;

import com.example.nermanapp.model.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {
    private String status;
    private Product product;
}
