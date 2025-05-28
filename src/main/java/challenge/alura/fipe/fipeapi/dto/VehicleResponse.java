package challenge.alura.fipe.fipeapi.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public record VehicleResponse (
        @JsonAlias("TipoVeiculo")
        String vehicleType,

        @JsonAlias("Valor")
        String price,

        @JsonAlias("Marca")
        String brand,

        @JsonAlias("Modelo")
        String model,

        @JsonAlias("AnoModelo")
        Integer year,

        @JsonAlias("Combustivel")
        String fuel,

        @JsonAlias("CodigoFipe")
        String fipeCode,

        @JsonAlias("MesReferencia")
        String monthReference,

        @JsonAlias("SiglaCombustivel")
        Character acronymFuel
) {
}
