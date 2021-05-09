package pi.fabrica;

import pi.constantes.TipoImagem;
import pi.imagens.Imagem;
import pi.pixel.Pixel;

import java.util.List;

public interface FabricaImagem {

     Imagem criarImagem(TipoImagem tipoImagem, Integer linhas, Integer colunas, List<Integer> valores, Integer valorMaximoCor);

     Imagem criarImagem(TipoImagem tipoImagem, Integer linhas, Integer colunas, Pixel[][] matriz, Integer valorMaximoCor);
}
