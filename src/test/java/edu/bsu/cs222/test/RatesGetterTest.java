package edu.bsu.cs222.test;

import edu.bsu.cs222.main.APIConnector;
import edu.bsu.cs222.main.RatesGetter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Objects;

public class RatesGetterTest {
    @Test
    public void getRatesTest() throws IOException {
        RatesGetter testRates = new RatesGetter();
        APIConnector connector = new APIConnector();
        HttpsURLConnection connection = connector.getConnectedWithTimestamp("2013-03-16");
        String testResult = testRates.getRatesWithTimestamp(connection);
        //String testAgainst = readSampleToString();
        Assertions.assertEquals(testResult, """
                {
                  "success":true,
                  "timestamp":1363478399,
                  "historical":true,
                  "base":"EUR",
                  "date":"2013-03-16",
                  "rates":{
                    "AED":4.803437,
                    "AFN":69.261001,
                    "ALL":140.069304,
                    "AMD":546.246068,
                    "ANG":2.339341,
                    "AOA":125.514716,
                    "ARS":6.654664,
                    "AUD":1.256333,
                    "AWG":2.341073,
                    "AZN":1.026296,
                    "BAM":1.959014,
                    "BBD":2.615432,
                    "BDT":102.775218,
                    "BGN":1.959614,
                    "BHD":0.493019,
                    "BIF":2035.793496,
                    "BMD":1.307716,
                    "BND":1.632024,
                    "BOB":9.129197,
                    "BRL":2.587684,
                    "BSD":1.307716,
                    "BTC":0.027983,
                    "BTN":70.713632,
                    "BWP":10.728459,
                    "BYR":11295.54557,
                    "BZD":2.581285,
                    "CAD":1.333812,
                    "CDF":1214.947772,
                    "CHF":1.229227,
                    "CLF":0.026978,
                    "CLP":617.19457,
                    "CNY":8.128494,
                    "COP":2352.414436,
                    "CRC":653.749487,
                    "CUP":29.668702,
                    "CVE":110.667237,
                    "CZK":25.593736,
                    "DJF":231.699986,
                    "DKK":7.463724,
                    "DOP":53.760485,
                    "DZD":103.193263,
                    "EGP":8.870054,
                    "ETB":24.127834,
                    "EUR":1,
                    "FJD":2.337193,
                    "FKP":0.865184,
                    "GBP":0.865184,
                    "GEL":2.169043,
                    "GHS":2.530301,
                    "GIP":0.818208,
                    "GMD":43.456369,
                    "GNF":9267.085637,
                    "GTQ":10.200326,
                    "GYD":264.98904,
                    "HKD":10.148863,
                    "HNL":25.848315,
                    "HRK":7.594471,
                    "HTG":55.560311,
                    "HUF":305.3141,
                    "IDR":12690.715674,
                    "ILS":4.816284,
                    "INR":70.667831,
                    "IQD":1514.912229,
                    "IRR":16049.069429,
                    "ISK":163.307581,
                    "JEP":0.865184,
                    "JMD":126.529013,
                    "JOD":0.925824,
                    "JPY":124.819208,
                    "KES":111.985021,
                    "KGS":62.58851,
                    "KHR":5213.180601,
                    "KMF":492.958917,
                    "KPW":1176.944443,
                    "KRW":1452.408277,
                    "KWD":0.371663,
                    "KYD":1.071246,
                    "KZT":196.964106,
                    "LAK":10261.703405,
                    "LBP":1967.640239,
                    "LKR":164.980477,
                    "LRD":97.097917,
                    "LSL":11.955573,
                    "LTL":3.455971,
                    "LVL":0.702113,
                    "LYD":1.670095,
                    "MAD":11.129652,
                    "MDL":16.103477,
                    "MGA":2895.342177,
                    "MKD":61.685196,
                    "MMK":1142.85768,
                    "MNT":1814.456016,
                    "MOP":10.444631,
                    "MUR":40.601249,
                    "MVR":20.14311,
                    "MWK":496.015795,
                    "MXN":16.259128,
                    "MYR":4.080656,
                    "MZN":39.427639,
                    "NAD":12.01325,
                    "NGN":207.193059,
                    "NIO":32.181961,
                    "NOK":7.53759,
                    "NPR":113.097642,
                    "NZD":1.580528,
                    "OMR":0.50349,
                    "PAB":1.307716,
                    "PEN":3.389801,
                    "PGK":2.714579,
                    "PHP":53.062738,
                    "PKR":128.109405,
                    "PLN":4.150819,
                    "PYG":5246.171007,
                    "QAR":4.760885,
                    "RON":4.395937,
                    "RSD":111.767743,
                    "RUB":40.069629,
                    "RWF":838.936384,
                    "SAR":4.904241,
                    "SBD":9.279655,
                    "SCR":15.279535,
                    "SDG":5.764789,
                    "SEK":8.363761,
                    "SGD":1.631746,
                    "SHP":0.865184,
                    "SLL":5651.948758,
                    "SOS":2103.075487,
                    "SRD":4.290943,
                    "STD":24763.1432,
                    "SVC":11.432787,
                    "SYP":92.565815,
                    "SZL":12.011227,
                    "THB":38.638955,
                    "TJS":6.217579,
                    "TMT":3.730587,
                    "TND":2.051219,
                    "TOP":2.290925,
                    "TRY":2.362968,
                    "TTD":8.39264,
                    "TWD":38.885133,
                    "TZS":2121.777461,
                    "UAH":10.623152,
                    "UGX":3448.970304,
                    "USD":1.307716,
                    "UYU":24.789409,
                    "UZS":2667.485726,
                    "VEF":5.616809,
                    "VND":27366.299111,
                    "VUV":119.276781,
                    "WST":3.008173,
                    "XAF":656.949778,
                    "XCD":3.532501,
                    "XDR":0.867277,
                    "XOF":657.178641,
                    "XPF":119.331742,
                    "YER":281.050737,
                    "ZAR":12.009514,
                    "ZMK":6850.029162,
                    "ZMW":7.053504,
                    "ZWL":421.506665
                  }
                }""");
    }

    @Test
    public void testRatesNotEmpty() throws IOException {
        RatesGetter testRates = new RatesGetter();
        APIConnector connector = new APIConnector();
        HttpsURLConnection connection = connector.getConnectedNoTimestamp();
        String testResult = testRates.getCurrentRates(connection);
        Assertions.assertNotNull(testResult);
    }

    private String readSampleToString() throws NullPointerException, IOException {
        try (InputStream stream = Thread.currentThread().getContextClassLoader().getResourceAsStream("currencies.json")) {
            return new String(Objects.requireNonNull(stream).readAllBytes(), Charset.defaultCharset());
        }
    }
}
