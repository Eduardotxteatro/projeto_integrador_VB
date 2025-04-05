//Classe principal que contem o metodo main. Ela configura o servidor socket e aciona o metodo receive

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class DataReceiver {
    public static void main (String[] args){ //metodo principal
        DataReceiver receiver = new DataReceiver();
        receiver.receiveData(); //criação do objeto receiveData
    }

    public void receiveData(){
        try { //parte do código que será testado para buscar erros
            ServerSocket serverSocket = new ServerSocket(9876);
            Socket clientSocket = serverSocket.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            DataProcessor processor = new DataProcessor();
            String inputLine;
            while ((inputLine = in.readLine()) != null){
                processor.processarDados(inputLine);
            }
            clientSocket.close();
            serverSocket.close();
        } catch (Exception e){ //Captura de excessões que ocorrem dentro do bloco try
            e.printStackTrace();
        }
    }
}
