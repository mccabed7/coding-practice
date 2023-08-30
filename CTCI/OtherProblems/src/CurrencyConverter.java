import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class CurrencyConverter {
    static class Rate{
        String CurrA;
        String CurrB;
        double Rate;

        Rate(String currA, String currB, double rate){
            CurrA = currA;
            CurrB = currB;
            Rate = rate;
        }
    }

    static class Query{
        String CurrA;
        String CurrB;

        Query(String currA, String currB){
            CurrA = currA;
            CurrB = currB;
        }
    }

    static class Solution{
        List<Rate> rates = new ArrayList<Rate>();
        Solution(List<Rate> rates){
            this.rates = rates;
        }

        double calculateQuery(Query query){
            return 0;
        }
    }

}
