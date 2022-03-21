package com.interview;

/*import com.google.gson.Gson;
import com.google.gson.JsonElement;*/

class JsonDemo {
    public static void main(String[] args) {
        String response = "{ \n" +
                "\"requestId\": \"7f83-b0c4-90e0-90b3-11e10800200c9a66\", \n" +
                "\"description\": \"Success\", \n" +
                "\"response\": \n" +
                "    { \n" +
                "    \"verified\": true, \n" +
                "    \"transactionId\": \"1234567890\", \n" +
                "    \"phoneNumber\": \"13039998877\", \n" +
                "    \"lineType\": \"mobile\", \n" +
                "    \"carrier\": \"AT&T Wireless\", \n" +
                "    \"countryCode\": \"US\", \n" +
                "    \"name\": \n" +
                "        { \n" +
                "        \"firstName\": 100, \n" +
                "        \"lastName\": 100, \n" +
                "        \"nameScore\": 100 \n" +
                "        }, \n" +
                "    \"address\": \n" +
                "        { \n" +
                "    \"streetNumber\": 100, \n" +
                "    \"street\": true, \n" +
                "    \"city\": true, \n" +
                "    \"region\": true, \n" +
                "    \"postalCode\": true, \n" +
                "    \"distance\": 0.0, \n" +
                "    \"addressScore\": 100 \n" +
                "    }, \n" +
                "    \"identifiers\": \n" +
                "    { \n" +
                "    \"last4\": true, \n" +
                "    \"dob\": true,\n" +
                "    “driversLicenseState”: true, \n" +
                "    “driversLicenseNumber”: true\n" +
                "    }, \n" +
                "    \"reasonCodes\": [ \"NA\", \"OL\", \"P9\" ] \n" +
                "    }, \n" +
                "\"status\": 0 \n" +
                "}";

        /*JsonElement jsonElement = new Gson().fromJson(response,JsonElement.class);
        System.out.println(jsonElement.getAsJsonObject().getAsJsonPrimitive("description").getAsString());
        System.out.println(jsonElement.getAsJsonObject().getAsJsonObject("response").getAsJsonObject("name").getAsJsonPrimitive("nameScore").getAsString());*/
    }
}
