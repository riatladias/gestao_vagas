package br.com.riatladias.gestao_vagas.modules.company.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreateJobDTO {
    @Schema(example = "Vaga para pessoa desenvolvedora júnior", requiredMode = RequiredMode.REQUIRED) 
    private String description;
    @Schema(example = "GYMPass, plano de saúde", requiredMode = RequiredMode.REQUIRED) 
    private String benefits;
    @Schema(example = "JUNIOR", requiredMode = RequiredMode.REQUIRED) 
    private String level;
}
