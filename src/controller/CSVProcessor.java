
package controller;

import model.Especie;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class CSVProcessor {

    public static List<Especie> carregarEspeciesDoCSV() {
        List<Especie> lista = new ArrayList<>();

        try {
            BufferedReader in = new BufferedReader(
                new InputStreamReader(
                    new FileInputStream("C:\\Users\\annal\\OneDrive\\Documents\\UNIP\\2° Ano\\APS - JAVA\\APS\\APSJavaFirebase\\especies.csv"),
                    StandardCharsets.UTF_8
                )
            );

            String linha;
            boolean primeiraLinha = true;

            while ((linha = in.readLine()) != null) {
                if (primeiraLinha) {
                    primeiraLinha = false;
                    continue;
                }

                String[] campos = linha.split(";");

                if (campos.length >= 9) {
                    Especie especie = new Especie();
                    especie.setFaunaFlora(campos[0]);
                    especie.setGrupo(campos[1]);
                    especie.setFamilia(campos[2]);
                    especie.setEspecieSimplificado(campos[3]);
                    especie.setNomeComum(campos[4]);
                    especie.setCategoriaAmeaca(campos[5]);
                    especie.setBioma(campos[6]);
                    especie.setPrincipaisAmeacas(campos[7]);
                    especie.setEstadosOcorrencia(campos[8]);

                    lista.add(especie);
                }
            }

            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
}
