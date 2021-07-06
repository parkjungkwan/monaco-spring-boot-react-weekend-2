package kr.scalar.api.common;
import org.modelmapper.ModelMapper;
public class ModelMapperUtils {
    private static ModelMapper modelMapper = new ModelMapper();

    public static ModelMapper getModelMapper() {
        return modelMapper;
    }

}
