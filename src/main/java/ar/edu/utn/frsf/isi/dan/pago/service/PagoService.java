package ar.edu.utn.frsf.isi.dan.pago.service;

import java.util.List;

import ar.edu.utn.frsf.isi.dan.pago.model.Pago;

public interface PagoService
{
	Pago guardarPago(Pago pago);

	List<Pago> obtenerEstadoCuenta(Long id);

}
