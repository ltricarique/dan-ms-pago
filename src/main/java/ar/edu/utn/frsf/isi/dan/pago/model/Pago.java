package ar.edu.utn.frsf.isi.dan.pago.model;

import java.time.Instant;
import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pago other = (Pago) obj;
		return Objects.equals(id, other.id);
	}

}
