package pi.imagens;

import pi.constantes.TipoImagem;
import pi.pixel.Pixel;

import java.io.IOException;

public interface Imagem<T extends Pixel> {

     TipoImagem getTipoImagem();

     T[][] getMatriz();

     void salvarImagem() throws IOException;

     Class<T> classePixelImpl();

     Integer getLinhas();

     Integer getColunas();

     Integer getValorMaximoCor();

}
