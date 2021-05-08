package pi.infra;

import pi.constantes.TipoImagem;
import pi.fabrica.FabricaImagem;
import pi.fabrica.impl.FabricaImagemImpl;
import pi.imagens.Imagem;
import pi.imagens.impl.ImagemP2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LeitorImagem {

     private final FabricaImagem fabricaImagem;

     private final String PATH_IMAGENS = "figuras/";

     private static LeitorImagem instancia;

     public static LeitorImagem getInstancia() {

          if (instancia == null)
               instancia = new LeitorImagem();
          return instancia;
     }

     private LeitorImagem() {
          fabricaImagem = new FabricaImagemImpl();
     }

     public Imagem lerImagem(String nomeImagem) throws IOException {

          var urlArquivo = getClass().getClassLoader().getResource(PATH_IMAGENS + nomeImagem);
          var stream = new FileInputStream(urlArquivo.getFile());
          InputStreamReader leitor = new InputStreamReader(stream);
          BufferedReader br = new BufferedReader(leitor);
          TipoImagem tipoImagem = TipoImagem.valueOf(br.readLine());
          String tamanho = "#";
          while (tamanho.startsWith("#"))
               tamanho = br.readLine();
          String corMaxima = br.readLine();
          List<Integer> valores = new ArrayList<>();
          var linha = "";
          while (linha != null) {
               linha = br.readLine();
               System.out.println(linha);
               if (linha != null)
                    valores.add(Integer.valueOf(linha));
          }
          var tamanhos = Arrays.stream(tamanho.split(" ")).map(t -> Integer.valueOf(t)).collect(Collectors.toList());
          Imagem imagem =  fabricaImagem.criarImagem(tipoImagem, tamanhos.get(0), tamanhos.get(1), valores,  Integer.valueOf(corMaxima));
          return imagem;
     }

}
