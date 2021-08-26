package ar.edu.utn.frsf.isi.dan.pago.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * @author Leandro Heraldo Tricarique
 * @author Francisco Tomas Gautero
 *
 */
@Entity
@Table(name = "EFECTIVO", schema = "MS_PAGO")
@PrimaryKeyJoinColumn(name = "ID", foreignKey = @ForeignKey(name = "FK_EFECTIVO_ID_TO_MEDIO_PAGO_ID"))
public class Efectivo extends MedioPago
{
	@Column(name = "NUMERO_RECIBO")
	private Integer numeroRecibo;

	public Integer getNumeroRecibo()
	{
		return numeroRecibo;
	}

	public void setNumeroRecibo(Integer numeroRecibo)
	{
		this.numeroRecibo = numeroRecibo;
	}

	@Override
	public String toString()
	{
		return "Efectivo [id=" + id + ", numeroRecibo=" + numeroRecibo + "]";
	}

}
