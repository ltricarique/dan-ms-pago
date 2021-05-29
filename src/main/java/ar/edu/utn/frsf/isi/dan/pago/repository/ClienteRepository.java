package ar.edu.utn.frsf.isi.dan.pago.repository;

import ar.edu.utn.frsf.isi.dan.pago.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Optional<Cliente> findById(Long id);

}
