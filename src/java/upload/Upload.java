/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upload;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import connectionjdbc.user.UserService;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hiepnguyen
 */
public class Upload {

    private String folder;

    public Upload() {
    }
    
    

    public Upload(String folder) {
        this.folder = folder;
    }
    
    
    public String uploadAvatarToCloud(String urlImg){
        Cloudinary cloudinary = new Cloudinary("https://cloudinary.com/console");
        Map map = ObjectUtils.asMap(
                "cloud_name", "hoangghiepp1302",
                "api_key", "812912856824389",
                "api_secret", "DoKmiWg4Kdmeor63MxfhAvWTo2w",
                "folder","avatar");
      
        //File file = new File("my_image.jpg");

        File file = new File(urlImg);
        try {
            Map uploadResult = cloudinary.uploader().upload(file, map);
            return (String)uploadResult.get("url");
        } catch (IOException ex) {
            Logger.getLogger(Upload.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
    public String uploadImgToCloud(String urlImg){
        Cloudinary cloudinary = new Cloudinary("https://cloudinary.com/console");
        Map map = ObjectUtils.asMap(
                "cloud_name", "hoangghiepp1302",
                "api_key", "812912856824389",
                "api_secret", "DoKmiWg4Kdmeor63MxfhAvWTo2w",
                "folder","shoes shop");
        File file = new File(urlImg);
        try {
            Map uploadResult = cloudinary.uploader().upload(file, map);
            return (String)uploadResult.get("url");
        } catch (IOException ex) {
            Logger.getLogger(Upload.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
