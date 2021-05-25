package ar.edu.utn.frsf.isi.dan.pago.model;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * @author Leandro Heraldo Tricarique
 *
 */
@Entity
@Table(name = "CHEQUE", schema = "MS_PAGO")
@PrimaryKeyJoinColumn(name = "ID", foreignKey = @ForeignKey(name = "FK_CHEQUE_ID_TO_MEDIO_PAGO_ID"))
public class Cheque extends MedioPago
{
	@Column(name = "NUMERO_CHEQUE")
	private Integer numeroCheque;
	@Column(name = "FECHA_COBRO")
	private Instant fechaCobro;
	@Column(name = "BANCO")
	private String banco;

	public Integer getNumeroCheque()
	{
		return numeroCheque;
	}

	public void setNumeroCheque(Integer numeroCheque)
	{
		this.numeroCheque = numeroCheque;
	}

	public Instant getFechaCobro()
	{
		return fechaCobro;
	}

	public void setFechaCobro(Instant fechaCobro)
	{
		this.fechaCobro = fechaCobro;
	}

	public String getBanco()
	{
		return banco;
	}

	public void setBanco(String banco)
	{
		this.banco = banco;
	}

	@Override
	public String toString()
	{
		return "Cheque [id=" + id + ", numeroCheque=" + numeroCheque + ", fechaCobro=" + fechaCobro + ", banco=" + banco + "]";
	}

}
