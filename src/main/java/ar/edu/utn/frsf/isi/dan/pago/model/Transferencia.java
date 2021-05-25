package ar.edu.utn.frsf.isi.dan.pago.model;

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
@Table(name = "TRANSFERENCIA", schema = "MS_PAGO")
@PrimaryKeyJoinColumn(name = "ID", foreignKey = @ForeignKey(name = "FK_TRANSFERENCIA_ID_TO_MEDIO_PAGO_ID"))
public class Transferencia extends MedioPago
{
	@Column(name = "CBU_ORIGEN")
	private String cbuOrigen;
	@Column(name = "CBU_DESTINO")
	private String cbuDestino;
	@Column(name = "CODIGO_TRANSFERENCIA")
	private Long codigoTransferencia;

	public String getCbuOrigen()
	{
		return cbuOrigen;
	}

	public void setCbuOrigen(String cbuOrigen)
	{
		this.cbuOrigen = cbuOrigen;
	}

	public String getCbuDestino()
	{
		return cbuDestino;
	}

	public void setCbuDestino(String cbuDestino)
	{
		this.cbuDestino = cbuDestino;
	}

	public Long getCodigoTransferencia()
	{
		return codigoTransferencia;
	}

	public void setCodigoTransferencia(Long codigoTransferencia)
	{
		this.codigoTransferencia = codigoTransferencia;
	}

	@Override
	public String toString()
	{
		return "Transferencia [id=" + id + ", cbuOrigen=" + cbuOrigen + ", cbuDestino=" + cbuDestino + ", codigoTransferencia="
			+ codigoTransferencia + "]";
	}

}
