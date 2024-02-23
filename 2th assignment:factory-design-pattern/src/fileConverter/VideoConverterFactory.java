package fileConverter;

public class VideoConverterFactory extends AbstructFactory {
    @Override 
    public FileConverter getFile(String fileType){
        if(fileType.equalsIgnoreCase("mp4")){
            return new Mp4Converter();
        }else if(fileType.equalsIgnoreCase("wav")){
            return new WavConverter();
        }

        return null;
    }

}
