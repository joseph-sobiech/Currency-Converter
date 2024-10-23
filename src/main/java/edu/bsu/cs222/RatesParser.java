package edu.bsu.cs222;

import com.jayway.jsonpath.JsonPath;
import net.minidev.json.JSONArray;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RatesParser {

    RatesGetter ratesGetter = new RatesGetter();
    APIConnector apiConnector = new APIConnector();

    public List<Float> parseThroughRatesForExchangeRateList(String userInputCurrency, String userOutputCurrency) throws IOException {

        HttpsURLConnection connection = apiConnector.connectNoDate();
        String allRates = ratesGetter.getRates(connection);

        JSONArray startingExchangeRate = JsonPath.read(allRates, "$.." + userInputCurrency);
        JSONArray finalExchangeRate = JsonPath.read(allRates, "$.." + userOutputCurrency);
        Float startingRateFloat = jsonArrayToFloat(startingExchangeRate);
        Float endingRateFloat = jsonArrayToFloat(finalExchangeRate);

        List<Float> rateList = new ArrayList<>();
        rateList.add(startingRateFloat);
        rateList.add(endingRateFloat);
        return rateList;
    }

    public float parseThroughRatesForRateAtSpecificDate(String userInputCurrency, String userInputDate) throws IOException {

        HttpsURLConnection connection = apiConnector.connectWithDate(userInputDate);
        String allRates = ratesGetter.getRates(connection);

        JSONArray exchangeRate = JsonPath.read(allRates, "$.." + userInputCurrency);

        return jsonArrayToFloat(exchangeRate);
    }

    private Float jsonArrayToFloat(JSONArray array) {

        String arrayString = String.valueOf(array);
        String formattedString = arrayString.substring(1, arrayString.length()-1);
        return Float.parseFloat(formattedString);
    }
}