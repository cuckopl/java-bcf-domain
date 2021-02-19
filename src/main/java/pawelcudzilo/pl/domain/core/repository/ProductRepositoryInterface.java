package pawelcudzilo.pl.domain.core.repository;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pawelcudzilo.pl.domain.core.entity.Product;

@Repository
//@ConfigurationProperties("repository")
public interface ProductRepositoryInterface extends CrudRepository<Product, Integer> {

}
