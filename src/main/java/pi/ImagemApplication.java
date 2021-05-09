package pi;


import pi.imagens.Imagem;
import pi.infra.LeitorImagem;
import pi.operadores.Negativacao;

import java.io.IOException;

public class ImagemApplication {

     public static void main(String[] args) throws IOException, InstantiationException, IllegalAccessException {

          Imagem imagem = LeitorImagem.getInstancia().lerImagem("barco.pgm");
          Negativacao negativacao = new Negativacao();
         Imagem imagemNegativada =  negativacao.operar(imagem);
          imagemNegativada.salvarImagem();
     }

}
