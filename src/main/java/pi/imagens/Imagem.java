package pi.imagens;

import pi.constantes.TipoImagem;
import pi.pixel.Pixel;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.stream.Stream;

public interface Imagem {

     TipoImagem getTipoImagem();

     Pixel[][] getImagem();

     void salvarImagem() throws IOException;

}
