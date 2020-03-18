package br.com.pucgoias;

import java.io.*;
import java.text.Normalizer;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArquivoTexto {

    private final String DELIMITADOR = ";";
    private List<Map<String, String>> arquivo;
    private List<String> colunas;
    private HashMap<String,String> colunasValueMap = new HashMap<>();
    private String urlArquivo;

    public ArquivoTexto(String urlArquivo) {
        this.urlArquivo = urlArquivo;
        lerArquivo(urlArquivo);
    }

    private void lerArquivo(String urlArquivo) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(urlArquivo));
            arquivo = new ArrayList<>();
            String linha;
            int index = 0;
            while ((linha = reader.readLine()) != null) {
                lerLinha(linha, index);
                index++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void lerLinha(String linha, int index) {
        if (index == 0) {

            colunas = Stream.of(getDadosLinha(linha))
                    .map(normalizarSalvarMapa())
                    .collect(Collectors.toList());
        } else {
            String[] colValues = getDadosLinha(linha);
            HashMap<String, String> lineValuesMap = new HashMap<>();
            for (int colIndex = 0; colIndex < colValues.length; colIndex++) {
                lineValuesMap.put(colunas.get(colIndex), colValues[colIndex]);
            }
            arquivo.add(lineValuesMap);
        }
    }

    private Function<String, String> normalizarSalvarMapa() {
        return s -> {
            String columnKey = Normalizer.normalize(s, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "")
                    .replace(" ", "")
                    .toLowerCase();
            this.colunasValueMap.put(columnKey,s);
            return columnKey;
        };
    }

    public void salvarArquivo() {
        BufferedWriter bw = null;
        try {
            String mycontent = "This String would be written" +
                    " to the specified File";
            File file = new File("C:/myfile.txt");
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            System.out.println("File written Successfully");

        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
            } catch (Exception ex) {
                System.out.println("Error in closing the BufferedWriter" + ex);
            }
        }
    }

    private String[] getDadosLinha(String linha) {
        return linha.split(DELIMITADOR);
    }

    public List<Map<String, String>> getArquivo() {
        return arquivo;
    }

    public void setArquivo(List<Map<String, String>> arquivo) {
        this.arquivo = arquivo;
    }
}
