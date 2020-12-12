
package kata3;


public class Kata3 {


    public static void main(String[] args) {
        //HistogramDisplay histo = new HistogramDisplay("HISTOGRAM");
        Histogram<String> histogram = new Histogram();
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("gmail.com");
        
        //HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAM");
        new HistogramDisplay(histogram).execute();
    }
    
}
