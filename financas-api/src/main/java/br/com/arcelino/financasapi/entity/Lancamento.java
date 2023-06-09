package br.com.arcelino.financasapi.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.arcelino.financasapi.converter.StatusLancamentoConverter;
import br.com.arcelino.financasapi.converter.TipoLancamentoConverter;
import br.com.arcelino.financasapi.enumeration.StatusLancamentoEnum;
import br.com.arcelino.financasapi.enumeration.TipoLancamentoEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_lancamento", schema = "financas")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Lancamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_lancamento")
    private Long id;

    @Column(name = "ds_lancamento", nullable = false, length = 255)
    private String descricao;

    @Column(name = "mes_lancamento", nullable = false)
    private Integer mes;

    @Column(name = "ano_lancamento", nullable = false)
    private Integer ano;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @Column(name = "valor_lancamento", nullable = false)
    private BigDecimal valor;

    @Column(name = "dt_cadastro_lancamento", insertable = false, updatable = false)
    private LocalDateTime dataCadastro;

    @NotNull
    @Convert(converter = TipoLancamentoConverter.class)
    @Column(name = "tipo_lancamento", nullable = false)
    private TipoLancamentoEnum tipo;

    @NotNull
    @Convert(converter = StatusLancamentoConverter.class)
    @Column(name = "status_lancamento", nullable = false)
    private StatusLancamentoEnum status;

}
