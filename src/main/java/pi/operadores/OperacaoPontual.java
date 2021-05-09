package pi.operadores;

import pi.fabrica.impl.FabricaImagemImpl;
import pi.imagens.Imagem;
import pi.pixel.Pixel;

public abstract class OperacaoPontual {

     FabricaImagemImpl fabricaImagem = new FabricaImagemImpl();

     protected abstract <T extends Pixel> Pixel funcaoOperacao(Pixel pixel, Class<T> tClass) throws InstantiationException, IllegalAccessException;

     public Imagem operar(Imagem imagem) throws InstantiationException, IllegalAccessException {

          Pixel[][] matriz = imagem.getMatriz();
          for (int i = 0; i < matriz.length; i++) {
               for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = funcaoOperacao(matriz[i][j], imagem.classePixelImpl());
               }
          }
          return fabricaImagem.criarImagem(imagem.getTipoImagem(), imagem.getLinhas(), imagem.getColunas(), matriz, imagem.getValorMaximoCor());

     }
}
