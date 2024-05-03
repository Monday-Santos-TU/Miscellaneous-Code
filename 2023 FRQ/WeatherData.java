import java.util.ArrayList;

public class WeatherData
{
    ArrayList<Double> temperatures;
    
    public WeatherData()
    {
        temperatures = new ArrayList<Double>();
    }
    
    // AP CSA 2023 FRQ question 3 part a
    public void cleanData(double lower, double upper)
    {
        for(int i = 0; i < temperatures.size(); i++) {
            if(temperatures.get(i) < lower || temperatures.get(i) > upper) {
                temperatures.remove(i);
                i--;
            }
        }
    }
    
    // AP CSA 2023 FRQ question 3 part b
    public int longestHeatWave(double threshold)
    {
        int heatWave = 0;
        int tempWave = 0;

        for(int i = 0; i < temperatures.size(); i++) {
            if(temperatures.get(i) > threshold) {
                tempWave++;
            } else {
                if(tempWave > heatWave) {
                    heatWave = tempWave;
                }
                tempWave = 0;
            }
        }

        return heatWave;
    }
}
