package jason.springboot.springreact.repository;

import jason.springboot.springreact.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
