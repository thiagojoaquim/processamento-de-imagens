package pi.pixel.impl;

import pi.pixel.Pixel;

import java.util.Arrays;
import java.util.List;

public class P2Pixel implements Pixel {

     public P2Pixel(){}

     @Override public String toString() {

          return "( " + cinza + " )";
     }

     private Integer cinza;

     public Integer getCinza() {

          return cinza;
     }

     public P2Pixel(Integer cinza) {

          this.cinza = cinza;
     }

     public void setCinza(Integer cinza) {

          this.cinza = cinza;
     }

     @Override public List<Integer> getValoresArray() {

          return Arrays.asList(cinza);
     }

     @Override public void setValoresArray(List<Integer> valoresArray) {
          setCinza(valoresArray.get(0));
     }
}
