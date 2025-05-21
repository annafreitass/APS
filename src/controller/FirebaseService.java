package controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import model.Especie;

import java.io.OutputStream;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FirebaseService {
    private static final String BASE_URL = "https://aps2025-4d8ab-default-rtdb.firebaseio.com/";

    public static void enviarParaFirebase(List<Especie> especies) {
    Gson gson = new Gson();

    try {
        for (Especie especie : especies) {
            String especieJson = gson.toJson(especie);

            URL url = new URL(BASE_URL + "especies.json"); // cria o nó "especies"
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            conexao.setRequestMethod("POST");
            conexao.setRequestProperty("Content-Type", "application/json");
            conexao.setDoOutput(true);

            OutputStream os = conexao.getOutputStream();
            os.write(especieJson.getBytes());
            os.flush();
            os.close();

            int codigoResposta = conexao.getResponseCode();
            System.out.println("Resposta Firebase: " + codigoResposta);
            conexao.disconnect();
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    
    public static List<Especie> buscarEspeciesDoFirebase() {
    List<Especie> lista = new ArrayList<>();

    try {
        URL url = new URL(BASE_URL + "especies.json");
        HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
        conexao.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
        StringBuilder resposta = new StringBuilder();
        String linha;

        while ((linha = in.readLine()) != null) {
            resposta.append(linha);
        }
        in.close();

        // Aqui usamos o Gson para converter o JSON recebido em um Map de objetos
        Type tipo = new TypeToken<Map<String, Especie>>() {}.getType();
        Map<String, Especie> mapa = new Gson().fromJson(resposta.toString(), tipo);

        if (mapa != null) {
            lista.addAll(mapa.values());
        }

    } catch (Exception e) {
        e.printStackTrace();
    }

    return lista;
}
    
    public static void limparFirebase() {
    try {
        URL url = new URL(BASE_URL + "especies.json");
        HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
        conexao.setRequestMethod("DELETE");

        int resposta = conexao.getResponseCode();
        System.out.println("Firebase limpo. Código de resposta: " + resposta);

        conexao.disconnect();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}
