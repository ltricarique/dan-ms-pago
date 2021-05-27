package ar.edu.utn.frsf.isi.dan.pago.service.impl;

import ar.edu.utn.frsf.isi.dan.pago.exception.RecursoNoEncontradoException;
import ar.edu.utn.frsf.isi.dan.pago.model.Cliente;
import ar.edu.utn.frsf.isi.dan.pago.model.Pago;
import ar.edu.utn.frsf.isi.dan.pago.repository.ClienteRepository;
import ar.edu.utn.frsf.isi.dan.pago.repository.PagoRepository;
import ar.edu.utn.frsf.isi.dan.pago.service.PagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagoServiceImpl implements PagoService {

    @Autowired
    PagoRepository pagoRepository;
    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public Pago guardarPago(Pago pago) {
        return pagoRepository.save(pago);
    }

    @Override
    public List<Pago> obtenerEstadoCuenta(Long id) {

        Optional<Cliente> cliente = clienteRepository.findById(id);
        if(cliente.isPresent()) {
            Cliente c = cliente.get();
            return pagoRepository.findAllByCliente(c);

        }else throw new RecursoNoEncontradoException("recurso no encontrado");
    }
}
