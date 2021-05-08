package pi.pixel.impl;

import pi.pixel.Pixel;

import java.util.Objects;

public class P2Pixel implements Pixel {

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

}
