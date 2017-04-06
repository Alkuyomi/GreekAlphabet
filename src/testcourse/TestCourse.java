
package testcourse;

import com.sun.javafx.geom.Shape;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class TestCourse extends Application {
    
   
   
    Button  menu_btn ;
    
    @Override
    public void start(Stage window) {
         BorderPane layout = new BorderPane();
      layout.getStyleClass().add("layout");
        
      /****************Groups***********************/
       String[] gr1 = {"Letter1.jpg" , "Letter2.jpg" , "Letter3.jpg" , "Letter4.jpg" ,"Letter5.jpg"};
       LettersGroup group1 = new LettersGroup(gr1);
       
       String[] gr2 = {"Letter6.jpg" , "Letter7.jpg" , "Letter8.jpg" , "Letter9.jpg" ,"Letter10.jpg"};
       LettersGroup group2 = new LettersGroup(gr2);
       
       String[] gr3 = {"Letter11.jpg" , "Letter12.jpg" , "Letter13.jpg" , "Letter14.jpg" ,"Letter15.jpg"};
       LettersGroup group3 = new LettersGroup(gr3);
       
       String[] gr4 = {"Letter16.jpg" , "Letter17.jpg" , "Letter18.jpg" , "Letter19.jpg" ,"Letter20.jpg"};
       LettersGroup group4 = new LettersGroup(gr4);
       
       String[] gr5 = {"Letter21.jpg" , "Letter22.jpg" , "Letter23.jpg" , "Letter24.jpg"};
       LettersGroup group5 = new LettersGroup(gr5);
        
           
      
        
        
      /**********************Quiz*******************/ 
       /***********(1)************/
        Quiz[] q1 = new Quiz[5];
        
        q1[0] = new Quiz();
        q1[1] = new Quiz();
        q1[2] = new Quiz();
        q1[3] = new Quiz();
        q1[4] = new Quiz();
        
        //1
        q1[0].setQustion("B β");
        q1[0].setChoices("ALPHA", "DELTA", "EPSILON", "GAMMA", "BETA", "ZETA", "IOTA", "KAPPA", "LAMBDA");
        
        String[] an = new String[1];
        an[0] = "BETA";
        q1[0].setAnswers(an);
        

       //2
        q1[1].setQustion("A α");
        q1[1].setChoices("ALPHA", "DELTA", "EPSILON", "GAMMA", "BETA", "ZETA", "IOTA", "KAPPA", "LAMBDA");
        String[] an2 = new String[1];
        an2[0] = "ALPHA" ;
        q1[1].setAnswers(an2);
       
        
        //3
        q1[2].setQustion("Γ γ");
        q1[2].setChoices("ALPHA", "DELTA", "EPSILON", "GAMMA", "BETA", "ZETA", "IOTA", "KAPPA", "LAMBDA");
        
        String[] an3 = new String[1];
        an3[0] = "GAMMA";
        q1[2].setAnswers(an3);
        
        //4
        q1[3].setQustion("E ε");
        q1[3].setChoices("ALPHA", "DELTA", "EPSILON", "GAMMA", "BETA", "ZETA", "IOTA", "KAPPA", "LAMBDA");
        
        String[] an4 = new String[1];
        an4[0] = "EPSILON";
        q1[3].setAnswers(an4);
        
        //5
        q1[4].setQustion("Δ δ");
        q1[4].setChoices("ALPHA", "DELTA", "EPSILON", "GAMMA", "BETA", "ZETA", "IOTA", "KAPPA", "LAMBDA");
        
        String[] an5 = new String[1];
        an5[0] = "DELTA";
        q1[4].setAnswers(an5);
        
        /***********(2)************/
        Quiz[] q2 = new Quiz[5];
        
        q2[0] = new Quiz();
        q2[1] = new Quiz();
        q2[2] = new Quiz();
        q2[3] = new Quiz();
        q2[4] = new Quiz();
        
        //1
        q2[0].setQustion("H η");
        q2[0].setChoices("RHO", "UPSILON", "ETA", "GAMMA", "BETA", "ZETA", "NU", "KAPPA", "PSI");
        
        String[] s21 = new String[1];
        s21[0] = "ETA";
        q2[0].setAnswers(s21);
        

       //2
        q2[1].setQustion("Θ θ");
        q2[1].setChoices("THETA", "DELTA", "EPSILON", "CHI", "BETA", "ZETA", "GAMMA", "KAPPA", "SIGMA");
        String[] s22 = new String[1];
        s22[0] = "THETA" ;
        q2[1].setAnswers(s22);
       
        
        //3
        q2[2].setQustion("Z ζ");
        q2[2].setChoices("OMEGA", "DELTA", "SIGMA", "GAMMA", "BETA", "ZETA", "IOTA", "KAPPA", "CHI");
        
        String[] s23 = new String[1];
        s23[0] = "ZETA";
        q2[2].setAnswers(s23);
        
        //4
        q2[3].setQustion("K κ");
        q2[3].setChoices("ZETA", "DELTA", "EPSILON", "CHI", "BETA", "OMEGA", "IOTA", "KAPPA", "GAMMA");
        
        String[] s24 = new String[1];
        s24[0] = "KAPPA";
        q2[3].setAnswers(s24);
        
        //5
        q2[4].setQustion("I ι");
        q2[4].setChoices("CHI", "DELTA", "OMEGA", "ALPHA", "BETA", "ZETA", "IOTA", "KAPPA", "LAMBDA");
        
        String[] s25 = new String[1];
        s25[0] = "IOTA";
        q2[4].setAnswers(s25);
        
          /***********(3)************/
        Quiz[] q3 = new Quiz[5];
        
        q3[0] = new Quiz();
        q3[1] = new Quiz();
        q3[2] = new Quiz();
        q3[3] = new Quiz();
        q3[4] = new Quiz();
        
        //1
        q3[0].setQustion("N ν");
        q3[0].setChoices("RHO", "UPSILON", "ETA", "GAMMA", "BETA", "ZETA", "NU", "KAPPA", "PSI");
        String[] s31 = new String[1];
        s31[0] = "NU";
        q3[0].setAnswers(s31);
        

       //2
        q3[1].setQustion("M μ");
        q3[1].setChoices("THETA", "DELTA", "EPSILON", "MU", "BETA", "ZETA", "GAMMA", "KAPPA", "SIGMA");
        String[] s32 = new String[1];
        s32[0] = "MU" ;
        q3[1].setAnswers(s32);
       
        
        //3
        q3[2].setQustion("O ο");
        q3[2].setChoices("OMEGA", "DELTA", "SIGMA", "GAMMA", "BETA", "ZETA", "OMICRON", "KAPPA", "CHI");
        String[] s33 = new String[1];
        s33[0] = "OMICRON";
        q3[2].setAnswers(s33);
        
        //4
        q3[3].setQustion("Λ λ");
        q3[3].setChoices("ZETA", "DELTA", "EPSILON", "CHI", "BETA", "LAMBDA", "IOTA", "KAPPA", "GAMMA");
        String[] s34 = new String[1];
        s34[0] = "LAMBDA";
        q3[3].setAnswers(s34);
        
        //5
        q3[4].setQustion("Ξ ξ");
        q3[4].setChoices("XI", "DELTA", "OMEGA", "ALPHA", "BETA", "ZETA", "IOTA", "KAPPA", "LAMBDA");    
        String[] s35 = new String[1];
        s35[0] = "XI";
        q3[4].setAnswers(s35);
        
        /***********(4)************/
        Quiz[] q4 = new Quiz[5];
        
        q4[0] = new Quiz();
        q4[1] = new Quiz();
        q4[2] = new Quiz();
        q4[3] = new Quiz();
        q4[4] = new Quiz();
        
        //1
        q4[0].setQustion("Σ σ");
        q4[0].setChoices("RHO", "SIGMA", "ETA", "GAMMA", "BETA", "ZETA", "NU", "KAPPA", "PSI");
        String[] s41 = new String[1];
        s41[0] = "SIGMA";
        q4[0].setAnswers(s41);
        

       //2
        q4[1].setQustion("Π π");
        q4[1].setChoices("THETA", "DELTA", "EPSILON", "MU", "BETA", "ZETA", "GAMMA", "PI", "SIGMA");
        String[] s42 = new String[1];
        s42[0] = "PI" ;
        q4[1].setAnswers(s42);
       
        
        //3
        q4[2].setQustion("T τ");
        q4[2].setChoices("TAU", "DELTA", "SIGMA", "GAMMA", "BETA", "ZETA", "OMICRON", "KAPPA", "CHI");
        String[] s43 = new String[1];
        s43[0] = "TAU";
        q4[2].setAnswers(s43);
        
        //4
        q4[3].setQustion("P ρ");
        q4[3].setChoices("ZETA", "DELTA", "EPSILON", "RHO", "BETA", "LAMBDA", "IOTA", "KAPPA", "GAMMA");
        String[] s44 = new String[1];
        s44[0] = "RHO";
        q4[3].setAnswers(s44);
        
        //5
        q4[4].setQustion("Υ υ");
        q4[4].setChoices("XI", "UPSILON", "OMEGA", "ALPHA", "BETA", "ZETA", "IOTA", "KAPPA", "LAMBDA");    
        String[] s45 = new String[1];
        s45[0] = "UPSILON";
        q4[4].setAnswers(s45);
        
        
             /***********(5)************/
        Quiz[] q5 = new Quiz[4];
        
        q5[0] = new Quiz();
        q5[1] = new Quiz();
        q5[2] = new Quiz();
        q5[3] = new Quiz();
        
        
        //1
        q5[0].setQustion("X χ");
        q5[0].setChoices("RHO", "SIGMA", "ETA", "CHI", "BETA", "ZETA", "NU", "KAPPA", "PSI");
        String[] s51 = new String[1];
        s51[0] = "CHI";
        q5[0].setAnswers(s51);
        

       //2
        q5[1].setQustion("Φ ϕ");
        q5[1].setChoices("THETA", "DELTA", "EPSILON", "MU", "BETA", "ZETA", "GAMMA", "PHI", "SIGMA");
        String[] s52 = new String[1];
        s52[0] = "PHI" ;
        q5[1].setAnswers(s52);
       
        
        //3
        q5[2].setQustion("Ω ω");
        q5[2].setChoices("TAU", "DELTA", "OMEGA", "GAMMA", "BETA", "ZETA", "OMICRON", "KAPPA", "CHI");
        String[] s53 = new String[1];
        s53[0] = "OMEGA";
        q5[2].setAnswers(s53);
        
        //4
        q5[3].setQustion("Ψ ψ");
        q5[3].setChoices("PSI", "DELTA", "EPSILON", "RHO", "BETA", "LAMBDA", "IOTA", "KAPPA", "GAMMA");
        String[] s54 = new String[1];
        s54[0] = "PSI";
        q5[3].setAnswers(s54);
        
        
        
        
        
        /***************Slide**************/
        Slide slide1 = new Slide();
        slide1.setLettersGroup(group1);
        slide1.setQuiz(q1);
        
        Slide slide2 = new Slide();
        slide2.setLettersGroup(group2);
        slide2.setQuiz(q2);
        
        Slide slide3 = new Slide();
        slide3.setLettersGroup(group3);
        slide3.setQuiz(q3);
        
        Slide slide4 = new Slide();
        slide4.setLettersGroup(group4);
        slide4.setQuiz(q4);
        
        Slide slide5 = new Slide();
        slide5.setLettersGroup(group5);
        slide5.setQuiz(q5);
            
       
        /******************ListView*********************/
        ListView<String> list = new ListView<>();
       ImageView men_img =  new ImageView(new Image(TestCourse.class.getResourceAsStream("menu.png")));
       men_img.setFitHeight(30);
       men_img.setFitWidth(30);
       menu_btn = new Button("" ,men_img);
       menu_btn.getStyleClass().add("b_n_btns");
       menu_btn.setVisible(false);
       
        ImageView home = new ImageView(new Image(TestCourse.class.getResourceAsStream("Home.jpg")));
      list.getStyleClass().add("list");
        
        
        ObservableList<String> items =FXCollections.observableArrayList ("Home", "Letters α-ε", "Letters ζ-κ", "Letters λ-ο" , "Letters π-υ" ,"Letters ϕ-ω" );
        
        list.setItems(items);
        
        list.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>(){

            @Override
            public void changed(ObservableValue<? extends String> ov, String t, String newItem) {
                if(newItem == "Letters α-ε"){

                    layout.setCenter(slide1.getLayout(0));
                    layout.setLeft(menu_btn);
                    menu_btn.setVisible(true);
                    list.setVisible(false);
                
                }else if(newItem == "Letters ζ-κ"){
                    layout.setCenter(slide2.getLayout(0));
                    layout.setLeft(menu_btn);
                    menu_btn.setVisible(true);
                    list.setVisible(false);
                    
                }else if(newItem == "Letters λ-ο"){
                    layout.setCenter(slide3.getLayout(0));
                    layout.setLeft(menu_btn);
                    menu_btn.setVisible(true);
                    list.setVisible(false);
                    
                }else if(newItem == "Letters π-υ"){
                    layout.setCenter(slide4.getLayout(0));
                    layout.setLeft(menu_btn);
                    menu_btn.setVisible(true);
                    list.setVisible(false);
                    
                }else if(newItem == "Letters ϕ-ω"){
                    layout.setCenter(slide5.getLayout(0));
                    layout.setLeft(menu_btn);
                    menu_btn.setVisible(true);
                    list.setVisible(false);
                    
                }else if(newItem == "Home"){
                    layout.setCenter(home);
                    layout.setLeft(menu_btn);
                    menu_btn.setVisible(true);
                    list.setVisible(false);
                    
                }
                
            }
        
    });
        
       
           menu_btn.setOnAction(e -> {
                list.setVisible(true);
                 menu_btn.setVisible(false);
                 layout.setLeft(list);
           });
           
           
        
        
        
     /*****************MainLayout***************************/
        
     
      
      layout.setCenter(home);
      layout.setLeft(list);
       
       
       
       
       
       
        Scene scene = new Scene(layout, 800 , 550);
        
        scene.getStylesheets().add(TestCourse.class.getResource("Style.css").toExternalForm());
       
        window.getIcons().add(new Image(TestCourse.class.getResourceAsStream("greek_icon.png")));
        window.setResizable(false);
        window.setScene(scene);
        window.setTitle("TestCourse");
        window.show();
        
       
    }

    public static void main(String[] args) {
        launch(args);
    }
   
   
   /************************EventHandler******************************/

    
}
