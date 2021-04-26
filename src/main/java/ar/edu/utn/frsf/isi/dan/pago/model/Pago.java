package ar.edu.utn.frsf.isi.dan.pago.model;

import java.time.Instant;

/**
 * @author Leandro Heraldo Tricarique
 *
 */
public class Pago {
	private Integer id;
	private Cliente cliente;
	private Instant fechaPago;
	private MedioPago medio;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Instant getFechaPago() {
		return fechaPago;
	}
	
	public void setFechaPago(Instant fechaPago) {
		this.fechaPago = fechaPago;
	}
	
	public MedioPago getMedio() {
		return medio;
	}
	
	public void setMedio(MedioPago medio) {
		this.medio = medio;
	}

	
}
