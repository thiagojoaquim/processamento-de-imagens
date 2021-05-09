package pi.imagens.impl;

import pi.constantes.TipoImagem;
import pi.imagens.Imagem;
import pi.pixel.impl.P2Pixel;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ImagemP2 implements Imagem<P2Pixel> {

     private final P2Pixel[][] matriz;
     private Integer linhas;
     private Integer colunas;
     private final Integer valorMaximoCor;

     public ImagemP2(Integer linhas, Integer colunas, Integer valorMaximoCor, List<Integer> valores) {

          matriz = new P2Pixel[linhas][colunas];
          inicializarImagem(valores);
          this.valorMaximoCor = valorMaximoCor;
          this.linhas = linhas;
          this.colunas = colunas;
     }

     public ImagemP2(Integer linhas, Integer colunas, Integer valorMaximoCor, P2Pixel[][] matriz) {

          this.matriz = matriz;
          this.valorMaximoCor = valorMaximoCor;
          this.linhas = linhas;
          this.colunas = colunas;
     }

     private void inicializarImagem(List<Integer> listaValores) {

          Queue<P2Pixel> pixels = new LinkedList<>();
          for (int i = 0; i < listaValores.size(); i ++) {
               pixels.add(new P2Pixel(listaValores.get(i)));
          }

          for (int i = 0; i < matriz.length; i++) {
               for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = pixels.poll();
               }
          }
     }
     @Override public TipoImagem getTipoImagem() {

          return TipoImagem.P2;
     }

     @Override public P2Pixel[][] getMatriz() {

          return matriz;
     }

     //TODO - REMOVER ESSE MÉTODO PARA OUTRA CLASSE
     @Override public void salvarImagem() throws IOException {

          File arquivo = new File("c:\\Users\\Thiago\\barco.pgm");
          arquivo.createNewFile();
          PrintWriter escritor = new PrintWriter(arquivo);
          escritor.println(getTipoImagem().toString());
          escritor.println(linhas + " " + colunas);
          escritor.println(valorMaximoCor);
          int c =  0;
          for (int i = 0; i < linhas; i++) {
               for (int j = 0; j < colunas; j++) {
                    escritor.println(matriz[i][j].getCinza());
                    c++;
               }
          }
          escritor.close();
          System.out.println(c);
     }

     @Override public Class<P2Pixel> classePixelImpl() {
          return P2Pixel.class;
     }

     public Integer getLinhas() {

          return linhas;
     }

     public void setLinhas(Integer linhas) {

          this.linhas = linhas;
     }

     public Integer getColunas() {

          return colunas;
     }

     public void setColunas(Integer colunas) {

          this.colunas = colunas;
     }

     public Integer getValorMaximoCor() {

          return valorMaximoCor;
     }
}
