import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
}

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
