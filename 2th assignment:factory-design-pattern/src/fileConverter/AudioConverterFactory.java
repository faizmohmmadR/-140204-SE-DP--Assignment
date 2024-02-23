package fileConverter;

public class AudioConverterFactory extends AbstructFactory{
    @Override
    public FileConverter getFile(String fileType){

        if(fileType.equalsIgnoreCase("mp4")){
            return new Mp3Converter();
        }
        else if(fileType.equalsIgnoreCase("avi")){
            return new AviConverter();
        }
        return null;
    }
}
