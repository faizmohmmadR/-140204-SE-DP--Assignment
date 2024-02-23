package fileConverter;

public class ImageConverterFactory extends AbstructFactory {
    @Override 
    public FileConverter getFile(String fileType){
        if(fileType.equalsIgnoreCase("jpg")){
        return new JpgConverter();
    }else if(fileType.equals("png")){
        return new PngConverter();
    }
    return null;
    }
}
