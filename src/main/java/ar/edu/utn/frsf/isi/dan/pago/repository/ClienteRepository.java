package ar.edu.utn.frsf.isi.dan.pago.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.edu.utn.frsf.isi.dan.pago.model.Cliente;

/**
 * @author Leandro Heraldo Tricarique
 * @author Francisco Tomas Gautero
 *
 */
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>
{
	Optional<Cliente> findByIdAndFechaBajaIsNull(Long id);

}
