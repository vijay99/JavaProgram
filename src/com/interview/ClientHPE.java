package com.interview;

/**
 * @author Sacumen (www.sacumen.com) <br> <br>
 */
//client class
public class ClientHPE {
    public static void main(String[] args) {
        //getting json data
        FactoryOfDatasource factory = new FactoryOfDatasource();
        factory.getDataFromSource("json");
    }


}

//interface
interface Datasource{
    public static final long dataParsingLimit=100;
    public String getData();
}

class XML implements Datasource{

    @Override
    public String getData() {
        return "I am returning data in xml format";
    }
}

class Json implements Datasource{

    @Override
    public String getData() {
        return "I am returning data in json format";
    }
}

//factory class
class FactoryOfDatasource {
     Datasource datasource = null;

    //factory method
    public  Datasource getDataFromSource(String typeOfData) {
        //Returning xml data type
        if (typeOfData.equalsIgnoreCase("xml")) {
            datasource = datasource = new XML();
        }

        //Returning xml data type
        if (typeOfData.equalsIgnoreCase("json")) {
            datasource = datasource = new Json();
        }
        return datasource;
    }


}





