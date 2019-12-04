
import upload.Upload;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hiepnguyen
 */
public class Test {

   

    public static void main(String[] args) {
        String file = "/home/hiepnguyen/Pictures/ava/ava1.jpg";
        String ava = new Upload().uploadAvatarToCloud(file);
        System.out.println(ava);
       
    }
}

