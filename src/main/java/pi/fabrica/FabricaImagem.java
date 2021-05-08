package pi.fabrica;

import pi.constantes.TipoImagem;
import pi.imagens.Imagem;

import java.util.List;

public interface FabricaImagem {
     public Imagem criarImagem(TipoImagem tipoImagem, Integer linhas, Integer colunas, List<Integer> valores, Integer valorMaximoCor);
}
