package ar.edu.utn.frsf.isi.dan.pago.service;

import ar.edu.utn.frsf.isi.dan.pago.model.Cliente;
import ar.edu.utn.frsf.isi.dan.pago.model.Pago;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PagoService {

    Pago guardarPago(Pago pago);

    List<Pago> obtenerPagosDeCliente(Long id);



}
