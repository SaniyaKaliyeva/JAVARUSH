/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level16.Task1631;

/**
 *
 * @author macbookair
 */
import Level16.Task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageTypes){

        if (imageTypes == ImageTypes.JPG) return new JpgReader();
        else if (imageTypes == ImageTypes.BMP) return new BmpReader();
        else if (imageTypes == ImageTypes.PNG) return new PngReader();
        throw new IllegalArgumentException("Неизвестный тип картинки");


    }
}
