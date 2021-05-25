package ar.edu.utn.frsf.isi.dan.pago.model;

import java.time.Instant;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Leandro Heraldo Tricarique
 *
 */
@Entity
@Table(name = "PAGO", schema = "MS_PAGO")
public class Pago
{
	@Id
	@SequenceGenerator(name = "pagoGenerator", sequenceName = "SECUENCIA_PAGO", schema = "MS_PAGO", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pagoGenerator")
	@Column(name = "ID")
	private Long id;
	@ManyToOne
	@JoinColumn(name = "ID_CLIENTE", foreignKey = @ForeignKey(name = "FK_PAGO_ID_CLIENTE_CLIENTE_ID"))
	@JsonIgnore
	private Cliente cliente;
	@Column(name = "FECHA_PAGO")
	private Instant fechaPago;
	@ManyToOne
	@JoinColumn(name = "ID_MEDIO", foreignKey = @ForeignKey(name = "FK_PAGO_ID_MEDIO_MEDIO_PAGO_ID"))
	@JsonIgnore
	private MedioPago medio;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public Cliente getCliente()
	{
		return cliente;
	}

	public void setCliente(Cliente cliente)
	{
		this.cliente = cliente;
	}

	public Instant getFechaPago()
	{
		return fechaPago;
	}

	public void setFechaPago(Instant fechaPago)
	{
		this.fechaPago = fechaPago;
	}

	public MedioPago getMedio()
	{
		return medio;
	}

	public void setMedio(MedioPago medio)
	{
		this.medio = medio;
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
		Pago other = (Pago) obj;
		return Objects.equals(id, other.id);
	}

}
