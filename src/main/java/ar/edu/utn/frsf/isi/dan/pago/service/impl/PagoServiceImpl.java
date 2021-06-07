package ar.edu.utn.frsf.isi.dan.pago.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.utn.frsf.isi.dan.pago.exception.RecursoNoEncontradoException;
import ar.edu.utn.frsf.isi.dan.pago.model.Cliente;
import ar.edu.utn.frsf.isi.dan.pago.model.Pago;
import ar.edu.utn.frsf.isi.dan.pago.repository.ClienteRepository;
import ar.edu.utn.frsf.isi.dan.pago.repository.PagoRepository;
import ar.edu.utn.frsf.isi.dan.pago.service.PagoService;

@Service
public class PagoServiceImpl implements PagoService
{
	private static final Logger LOGGER = LoggerFactory.getLogger(PagoServiceImpl.class);

	@Autowired
	PagoRepository pagoRepository;
	@Autowired
	ClienteRepository clienteRepository;

	@Override
	public Pago guardarPago(Pago pago)
	{
		pago = pagoRepository.save(pago);
		LOGGER.info("Pago guardado");
		return pago;
	}

	@Override
	public List<Pago> obtenerEstadoCuenta(Long id)
	{
		Optional<Cliente> cliente = clienteRepository.findByIdAndFechaBajaIsNull(id);

		if (cliente.isPresent())
		{
			Cliente c = cliente.get();
			return pagoRepository.findAllByCliente(c);
		}
		else
			throw new RecursoNoEncontradoException("recurso no encontrado");
	}
}
