package ar.edu.utn.frsf.isi.dan.pago.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.edu.utn.frsf.isi.dan.pago.model.Cliente;
import ar.edu.utn.frsf.isi.dan.pago.model.Pago;

/**
 * @author Leandro Heraldo Tricarique
 * @author Francisco Tomas Gautero
 *
 */
@Repository
public interface PagoRepository extends JpaRepository<Pago, Long>
{
	List<Pago> findAllByCliente(Cliente cliente);

}
