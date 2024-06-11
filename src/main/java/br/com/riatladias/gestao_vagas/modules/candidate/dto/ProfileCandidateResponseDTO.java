package br.com.riatladias.gestao_vagas.modules.candidate.dto;

import java.util.UUID;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProfileCandidateResponseDTO {

    @Schema(example = "Desenvolvedor java")
    private String description;

    @Schema(example = "Joe")
    private String username;

    @Schema(example = "Joe Doe")
    private String name;

    @Schema(example = "joe@example.com")
    private String email;

    private UUID id;
}
