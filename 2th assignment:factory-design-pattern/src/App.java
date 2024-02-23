import fileConverter.AbstructFactory;
import fileConverter.FactoryProducer;
import fileConverter.FileConverter;


public class App {
    public static void main(String[] args) throws Exception {
        
        // Image Converter
        AbstructFactory imageFactory = FactoryProducer.getFactory("image");
        // Video Converter
        AbstructFactory videoFactory = FactoryProducer.getFactory("video");
        // Audio Converter
        AbstructFactory audioFactory = FactoryProducer.getFactory("audeo");
        
    }
}
