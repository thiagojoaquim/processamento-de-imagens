package pi.operadores;

import pi.pixel.Pixel;

import java.util.stream.Collectors;

public class Negativacao extends OperacaoPontual {

     @Override public <T extends Pixel> Pixel funcaoOperacao(Pixel pixel, Class<T> tClass) throws InstantiationException, IllegalAccessException {

          Pixel instancia = tClass.newInstance();
          instancia.setValoresArray(pixel.getValoresArray().stream().map(t -> 255 - t.intValue()).collect(Collectors.toList()));
          return instancia;
     }
}
