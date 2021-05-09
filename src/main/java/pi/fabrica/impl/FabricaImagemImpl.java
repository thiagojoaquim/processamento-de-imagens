package pi.fabrica.impl;

import pi.constantes.TipoImagem;
import pi.fabrica.FabricaImagem;
import pi.imagens.Imagem;
import pi.imagens.impl.ImagemP2;
import pi.pixel.Pixel;
import pi.pixel.impl.P2Pixel;

import java.util.List;

public class FabricaImagemImpl implements FabricaImagem {

     @Override public Imagem criarImagem(TipoImagem tipoImagem, Integer linhas, Integer colunas, List<Integer> valores, Integer valorMaximoCor) {
          switch (tipoImagem) {
               case P1:
               case P3:
                    throw new RuntimeException();

               case P2:
                    return new ImagemP2(linhas, colunas, valorMaximoCor, valores);
               default:
                    return null;
          }
     }

     @Override public Imagem criarImagem(TipoImagem tipoImagem, Integer linhas, Integer colunas, Pixel[][] matriz, Integer valorMaximoCor) {

          switch (tipoImagem) {
               case P1:
               case P3:
                    throw new RuntimeException();

               case P2:
                    return new ImagemP2(linhas, colunas, valorMaximoCor, (P2Pixel[][]) matriz);
               default:
                    return null;
          }
     }
}
