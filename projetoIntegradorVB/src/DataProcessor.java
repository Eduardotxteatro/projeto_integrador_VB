public class DataProcessor {

    //Classe responsável por processar os dados recebidos do arduino
    //Recebe e analisa as Strings de dados e extrai os valores dos sensores

    public void processarDados(String dados){

        /*
        Esta função recebe uma string de dados
        no formato "temperatura,umidade,luminosidade", divide-a em valores
        individuais, cria um objeto SensorData e chama a função displayData()
        para exibir os dados.
        */

        String[] values = dados.split(",");
        if (values.length == 3){
            float temperatura = Float.parseFloat(values[0]);
            float umidade = Float.parseFloat(values[1]);
            int luminosidade = Integer.parseInt(values[2]);
            SensorData sensorData = new SensorData(temperatura, umidade, luminosidade);
            displayData(sensorData);
        }
    }
    public void displayData(SensorData sensorData){
        //Recebe o objeto SensorData e exibe seus valores
        System.out.println(sensorData.toString());
    }
}
