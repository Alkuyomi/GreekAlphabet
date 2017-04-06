

package testcourse;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class Quiz implements EventHandler<ActionEvent>{
    private  String ans_str = "";
    private  Label q_lab , ans_lab ;
    private Button[] btn = new Button[9];
    private Button clean_btn , check_btn  ;
    private boolean check_answer ;
    private ImageView wrong , correct ;
    private HBox[]  h = new HBox[6];
    private  VBox v ;
        
    String[] ans ;
    public Quiz(){
         this.v = new VBox(20);
        
        this.wrong = new ImageView(new Image(TestCourse.class.getResourceAsStream("false.png")));
        this.correct = new ImageView(new Image(TestCourse.class.getResourceAsStream("true.png")));
        
        this.wrong.setFitHeight(20);
        this.correct.setFitHeight(20);
        
        this.correct.setFitWidth(20);
        this.wrong.setFitWidth(20);
        
        this.ans_lab = new Label(ans_str);
        this.q_lab = new Label("");
        this.ans_lab.getStyleClass().add("label");
        this.ans_lab.getStyleClass().add("label");
        this.q_lab.setFont(new Font("Cambria" , 15));
        this.check_answer = false ;
    }
    
    public void setQustion(String q){
        q_lab.setText(q);
        q_lab.setFont(new Font("Cambria" , 24));
        q_lab.getStyleClass().add("label");
    }
    
    public void setChoices(String c1 ,String c2 ,String c3 ,String c4 ,String c5 ,String c6 ,String c7 ,String c8 , String c9){
        
        
        btn[0] = new Button(c1);
        btn[1] = new Button(c2);
        btn[2] = new Button(c3);
        
        btn[3] = new Button(c4);
        btn[4] = new Button(c5);
        btn[5] = new Button(c6);
        
        btn[6] = new Button(c7);
        btn[7] = new Button(c8);
        btn[8] = new Button(c9);
        
        clean_btn = new Button("Clean");
        check_btn = new Button("Check");
        
        clean_btn.setOnAction(this);
        check_btn.setOnAction(this);
        
        for(int i = 0 ; i<9 ; i++)
            btn[i].setOnAction(this);
        
        for(int i = 0 ; i<9 ; i++){
            btn[i].setMaxHeight(10);
            btn[i].setMinWidth(50);
        }
        
       for(int i = 0 ; i<9 ; i++)
           btn[i].getStyleClass().add("btn");
        
       clean_btn.getStyleClass().add("btn");
       check_btn.getStyleClass().add("btn");
       
       
        
        h[0] = new HBox(20);
        h[1] = new HBox(20);
        h[2] = new HBox(20);
        h[3] = new HBox(20);
        h[4] = new HBox(20);
        h[5] = new HBox(20);
        
        h[0].getChildren().addAll(btn[0] , btn[1] , btn[2]);
        h[1].getChildren().addAll(btn[3] , btn[4] , btn[5]);
        h[2].getChildren().addAll(btn[6] , btn[7] , btn[8]);
        h[3].getChildren().addAll(clean_btn , check_btn);
        h[4].getChildren().addAll(ans_lab , correct);
        h[5].getChildren().addAll(ans_lab , wrong);
          
        h[0].setAlignment(Pos.CENTER);
        h[1].setAlignment(Pos.CENTER);
        h[2].setAlignment(Pos.CENTER);
        h[3].setAlignment(Pos.CENTER);
        h[4].setAlignment(Pos.CENTER);
        h[5].setAlignment(Pos.CENTER);
        v.getStyleClass().add("layout");
        v.getChildren().addAll(q_lab  ,ans_lab , h[0] ,h[1] ,h[2] , h[3]);
        v.setAlignment(Pos.CENTER);
        
        
    }
    public VBox getLayout(){

        return v ;
    }
    
    public void setAnswers(String[] s){
        ans = new String[s.length];
        ans = s ;// اخر عملية تعديل امس
       
    }

    @Override
    public void handle(ActionEvent t) {
           if(t.getSource() == clean_btn ){
            v.getChildren().clear();
            v.getChildren().addAll(q_lab  ,ans_lab , h[0] ,h[1] ,h[2] , h[3]);
            ans_str = "";
            ans_lab.setText(ans_str);
            
            for(int i = 0 ; i < 9 ; i++)
                 btn[i].setVisible(true);
        }else if(t.getSource() == check_btn){
            check_answer = false ;
            for(int i = 0 ; i<ans.length ;i++){
                if(ans[i].equals(ans_str))
                    check_answer = true ;
            }
            if(check_answer == true){
            v.getChildren().clear();
            v.getChildren().addAll(q_lab  ,h[4] , h[0] ,h[1] ,h[2] , h[3]);
            }
        else
            {
            v.getChildren().clear();
            v.getChildren().addAll(q_lab  ,h[5] , h[0] ,h[1] ,h[2] , h[3]);
            }
            
            ans_str = "";
            
        }else{
            
       for(int i = 0 ; i<9 ; i++)
        if(t.getSource() == btn[i]){
            ans_str += btn[i].getText();
            ans_lab.setText(ans_str);
            int first = -1, second  = -1;
            
           
            if(i == 1 || i == 4 || i == 7){
            btn[i+1].setVisible(false);
            btn[i-1].setVisible(false);
            }else if (i == 2 || i == 5 || i == 8){
            btn[i-1].setVisible(false);
            btn[i-2].setVisible(false);
            }else if (i == 0 || i == 3 || i == 6){
            btn[i+1].setVisible(false);
            btn[i+2].setVisible(false);
            }}
            
    }

    }
    
}
