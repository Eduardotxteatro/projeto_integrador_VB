//Classe que tem a função de armazenar os dados dos sensores


import java.io.BufferedReader; //Import para leitura de entradas de caracteres
import java.io.InputStreamReader; //Leitor e tradutor de entrada de bytes
import java.net.ServerSocket; //Tem a função de aguardar a solicitação de conexão de clientes externos
import java.net.Socket; //Estabelece conexão com um servidor externo e enviara e receber dados

public class SensorData {
    //Variáveis que armazenam valores float e int
    float temperatura;
    float umidade;
    int luminosidade;

    public SensorData(float temperatura, float umidade, int luminosidade) {
        //Construtor utilizado para criar e iniciar os objetos nas outras classes do projetos
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.luminosidade = luminosidade;
    }
    @Override
    public String toString(){
        //Função que visa converter os dados float e int em String para impressão
        return "Temperatura: " + temperatura + " °C. Umidade: " + umidade + " %. Luminosidade: " + luminosidade;
    }
}
