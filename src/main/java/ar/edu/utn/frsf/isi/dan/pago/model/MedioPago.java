package ar.edu.utn.frsf.isi.dan.pago.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author Leandro Heraldo Tricarique
 * @author Francisco Tomas Gautero
 *
 */
@Entity
@Table(name = "MEDIO_PAGO", schema = "MS_PAGO")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class MedioPago
{
	@Id
	@SequenceGenerator(name = "medioPagoGenerator", sequenceName = "SECUENCIA_MEDIO_PAGO", schema = "MS_PAGO", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "medioPagoGenerator")
	@Column(name = "ID")
	protected Long id;
	@Column(name = "OBSERVACION")
	protected String observacion;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getObservacion()
	{
		return observacion;
	}

	public void setObservacion(String observacion)
	{
		this.observacion = observacion;
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj)
	{
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
