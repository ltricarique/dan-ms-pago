package ar.edu.utn.frsf.isi.dan.pago.rest;

import ar.edu.utn.frsf.isi.dan.pago.model.Cliente;
import ar.edu.utn.frsf.isi.dan.pago.model.Pago;
import ar.edu.utn.frsf.isi.dan.pago.service.PagoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/pago")
@Tag(name = "ClienteRest", description = "Permite gestionar los pagos de los clientes.")
public class PagoRest {

    @Autowired
    private PagoService pagoService;

    //Registra un pago de un cliente

    @PostMapping
    @Operation(summary = "Registra el pago de un Cliente.")
    @ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Pago Registrado"),
            @ApiResponse(responseCode = "401", description = "No autorizado"), @ApiResponse(responseCode = "403", description = "Prohibido"),
            @ApiResponse(responseCode = "404", description = "Cliente inexistente") })
    public ResponseEntity<?> registrarPago(@RequestBody @Valid Pago pago)
    {

        return ResponseEntity.ok(pagoService.guardarPago(pago));
    }

    //Retorna el estado de cuenta corriente de un cliente con un detalle de  Pagos y Facturas

    @GetMapping
    @Operation(summary = "Recupera lso pagos de un cliente.")
    @ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Pagos recuperados"),
            @ApiResponse(responseCode = "401", description = "No autorizado"), @ApiResponse(responseCode = "403", description = "Prohibido"),
            @ApiResponse(responseCode = "404", description = "Cliente inexistente") })
    public ResponseEntity<?> estadoCuenta(@RequestParam(name = "id") Long id)
    {

        return ResponseEntity.ok(pagoService.obtenerPagosDeCliente(id));
    }

}
