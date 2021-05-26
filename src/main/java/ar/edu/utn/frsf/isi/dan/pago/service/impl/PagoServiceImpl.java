package ar.edu.utn.frsf.isi.dan.pago.service.impl;

import ar.edu.utn.frsf.isi.dan.pago.model.Cliente;
import ar.edu.utn.frsf.isi.dan.pago.model.Pago;
import ar.edu.utn.frsf.isi.dan.pago.repository.PagoRepository;
import ar.edu.utn.frsf.isi.dan.pago.service.PagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagoServiceImpl implements PagoService {

    @Autowired
    PagoRepository pagoRepository;

    @Override
    public Pago guardarPago(Pago pago) {
        return pagoRepository.save(pago);
    }

    @Override
    public List<Pago> obtenerPagosDeCliente(Long id) {
        return pagoRepository.findAllByCliente(id);
    }
}
