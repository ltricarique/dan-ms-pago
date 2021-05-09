package ar.edu.utn.frsf.isi.dan.pago.model;

import java.util.Objects;

/**
 * @author Leandro Heraldo Tricarique
 *
 */
public abstract class MedioPago {
	protected Integer id;
	protected String observacion;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getObservacion() {
		return observacion;
	}
	
	public void setObservacion(String observacion) {
		this.observacion = observacion;
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
		MedioPago other = (MedioPago) obj;
		return Objects.equals(id, other.id);
	}

}
