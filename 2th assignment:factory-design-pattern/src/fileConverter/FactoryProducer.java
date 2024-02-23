package fileConverter;

public class FactoryProducer {
    public static AbstructFactory getFactory(String fileType){
        if(fileType.equals("image")){
            return new ImageConverterFactory();
        }else if(fileType.equals("video")){
            return new VideoConverterFactory();
        }else if(fileType.equals("audio")){
            return new AudioConverterFactory();
        }
        return null;
    }
    
}
