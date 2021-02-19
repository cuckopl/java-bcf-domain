package pawelcudzilo.pl.domain.comunication.service;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;
import pawelcudzilo.pl.domain.comunication.dto.ProductDtoInterface;
import pawelcudzilo.pl.domain.core.entity.Product;
import pawelcudzilo.pl.domain.core.exceptions.ProductResourceNotFoundException;
import pawelcudzilo.pl.domain.core.mapper.ProductMapper;
import pawelcudzilo.pl.domain.core.repository.ProductRepositoryInterface;

import java.util.Optional;

@Service
//@EnableConfigurationProperties(ProductRepositoryInterface.class)
public class ProductService implements ProductServiceInterface {

    private final ProductRepositoryInterface repository;
    private final ProductMapper mapper;

    public ProductService(ProductRepositoryInterface repository,
                          ProductMapper mapper
    ) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public ProductDtoInterface store(ProductDtoInterface dto) {
        Product result = repository.save(mapper.dtoToModel(dto));
        return mapper.modelToDto(result);
    }

    @Override
    public ProductDtoInterface remove(ProductDtoInterface dto) {
        return null;
    }

    @Override
    public ProductDtoInterface save(ProductDtoInterface dto) {
        Product result = repository.save(mapper.dtoToModel(dto));
        return mapper.modelToDto(result);
    }

    @Override
    public ProductDtoInterface update(ProductDtoInterface dto) {
        return null;
    }

    @Override
    public ProductDtoInterface getProduct(Integer id) throws ProductResourceNotFoundException {
        Optional<Product> result = repository.findById(id);

        return mapper.modelToDto(result.orElseThrow(ProductResourceNotFoundException::new));//unreadable code
    }
}
