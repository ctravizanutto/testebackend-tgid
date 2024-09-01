package com.cainant.testebackendtgid.dto.enterprise;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CNPJ;

public record EnterpriseRegisterData(
        @NotBlank
        String name,

        @NotBlank
        @CNPJ
        String cnpj,

        @NotNull
        Float fee

) {
}
