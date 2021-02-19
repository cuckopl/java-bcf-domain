package pawelcudzilo.pl.domain.core.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import pawelcudzilo.pl.domain.core.entity.Product;
import pawelcudzilo.pl.domain.comunication.dto.ProductDtoInterface;


@Component
public class ProductMapper {
    private final ModelMapper mapper;

    public ProductMapper(ModelMapper mapper) {
        this.mapper = mapper;
//        this.mapper.addMappings(Product::getPrice::get, );
    }

    public ProductDtoInterface modelToDto(Product product) {
        return mapper.map(product, pawelcudzilo.pl.domain.comunication.dto.Product.class);
        //how add here interface so layers will depend on abstractions
    }

    public Product dtoToModel(ProductDtoInterface dto) {
        return mapper.map(dto, Product.class);
    }

}
