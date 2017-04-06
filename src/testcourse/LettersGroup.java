

package testcourse;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;


public class LettersGroup {
        
        private ImageView[] imgview ;
        private Image[] letters ;
        private String[] imgs;
        private BorderPane layout ;
        
        public LettersGroup(String[] img){
            imgview = new ImageView[img.length];
            letters = new Image[img.length];
            this.imgs = new String[img.length];
            this.imgs = img ;
        
        for(int i = 0 ; i < this.imgs.length ;i++){
         this.letters[i] = new Image(TestCourse.class.getResourceAsStream(imgs[i]));
         this.imgview[i] = new ImageView(letters[i]);
        }
         
         
        }
        public int getLenght(){
            return imgs.length ;
        }
        public BorderPane getImage(int Index){
            layout = new BorderPane();
            layout.setCenter(imgview[Index]);
            return this.layout;
        }
        
           
        
    
}
