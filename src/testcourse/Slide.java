
package testcourse;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;


public class Slide {
      private LettersGroup group;
      private BorderPane layout ;
      private Button next_btn ,back_btn;
      private HBox bn ;
      private Quiz[] quiz ;
      private int p = 0  , q = -1;
    public Slide(){
        
        
         ImageView iv1 = new ImageView(new Image(TestCourse.class.getResourceAsStream("Left.png")));
        ImageView iv2 = new ImageView(new Image(TestCourse.class.getResourceAsStream("Right.png")));
        iv1.setFitHeight(30);
        iv1.setFitWidth(30);
        iv2.setFitHeight(30);
        iv2.setFitWidth(30);
        back_btn = new Button("",iv1);
        next_btn = new Button("",iv2);
        
        back_btn.getStyleClass().add("b_n_btns");
        next_btn.getStyleClass().add("b_n_btns");
        
         next_btn.setOnAction(e -> {
             if(p < this.group.getLenght())
                  p++;               
                layout.setCenter(getLayout(p));
          });
        
        
        
           back_btn.setOnAction(e -> {
                if(p != 0)
                  p--;
                layout.setCenter(getLayout(p));
           });
           
        bn = new HBox(20);
        bn.setMaxHeight(10);
        bn.getChildren().addAll(back_btn , next_btn);
        bn.setAlignment(Pos.CENTER);
           
    }
    
  
     
    public void setLettersGroup(LettersGroup group){
        this.group = group;
    }
    
    public void setQuiz(Quiz quiz[]){
        this.quiz = quiz ;
    }
    
    public BorderPane getLayout(int Index){
 
        
        layout = new BorderPane();
        try{
        if(Index < this.group.getLenght()){
            q = -1;
        layout.setCenter(group.getImage(Index));
        }
        else{
          if(q < quiz.length){
            q++;
            layout.setCenter(quiz[q].getLayout());
          }
        }
        }catch(Exception e){
            p = 0;
            q = -1 ;
            getLayout(0);
            
        }
        layout.setBottom(bn);
        return this.layout;
        
    }
    
}
