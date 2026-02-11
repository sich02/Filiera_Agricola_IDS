package org.example.dto.request;

import java.util.List;
import java.util.Map;

public record CreaProcessoRequest(
        Long idTrasformatore,

        Map<Long, Integer> ingredienti,

        String nomeOutput,
        String descrizioneOutput,

        double prezzoOutput,
        int quantitaOutput,

        Long idMetodo,

        List<CertificazioneRequest> certificazioni
) {
}
