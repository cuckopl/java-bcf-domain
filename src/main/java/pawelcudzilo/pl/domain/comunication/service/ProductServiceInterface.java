package pawelcudzilo.pl.domain.comunication.service;

import pawelcudzilo.pl.domain.comunication.dto.ProductDtoInterface;
import pawelcudzilo.pl.domain.core.exceptions.ProductResourceNotFoundException;

public interface ProductServiceInterface {

    ProductDtoInterface store(ProductDtoInterface dto);

    ProductDtoInterface remove(ProductDtoInterface dto);

    ProductDtoInterface save(ProductDtoInterface dto);

    ProductDtoInterface update(ProductDtoInterface dto);

    ProductDtoInterface getProduct(Integer id) throws ProductResourceNotFoundException;
}
