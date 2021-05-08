package pi;


import pi.imagens.Imagem;
import pi.infra.LeitorImagem;

import java.io.IOException;

public class ImagemApplication {

     public static void main(String[] args) throws IOException {

          Imagem imagem = LeitorImagem.getInstancia().lerImagem("barco.pgm");
          imagem.salvarImagem();
     }

}
