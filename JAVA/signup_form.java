import java.awt.EventQueue;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class signup extends Application{
    @Override
    public void start(Stage stage){
        GridPane g = new GridPane();
        g.setAlignment(Pos.BASELINE_LEFT);
        g.setVgap(5);
        g.setHgap(5);
        g.setPadding(new Insets(40,40, 40, 40));
        Text text1 = new Text("Sign Up");
        text1.setFill(Color.PURPLE);
        text1.setFont(Font.font("Calibri(Heading)", FontWeight.BOLD, FontPosture.REGULAR, 30));
        g.add(text1, 3,0);
        Text text2 = new Text("First Name:");
        text2.setFill(Color.PURPLE);
        text2.setX(70); 
        text2.setY(160);
        text2.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 18));
        g.add(text2, 0, 2);
        TextField t1 = new TextField();
        g.add(t1,3,2);
        Text text3 = new Text("Middle Name:");
        text3.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 18));
        text3.setFill(Color.PURPLE);
        text3.setX(70); 
        text3.setY(160);
        g.add(text3, 0, 4);
        TextField t2 = new TextField();
        g.add(t2,3,4);
        Text text4 = new Text("Last Name:");
        text4.setFill(Color.PURPLE);
        text4.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 18));
        text4.setX(70); 
        text4.setY(160);
        g.add(text4, 0, 6);
        TextField t3 = new TextField();
        g.add(t3,3,6);
        Text text5 = new Text("Password:");
        text5.setFill(Color.PURPLE);
        text5.setX(70); 
        text5.setY(160);
        text5.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 18));
        g.add(text5, 0, 8);
        PasswordField t4 = new PasswordField();
        g.add(t4,3,8);
        Text text6 = new Text("Confirm Password:");
        text6.setFill(Color.PURPLE);
        text6.setX(70); 
        text6.setY(160);
        text6.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 18));
        g.add(text6, 0, 10);
        PasswordField t5 = new PasswordField();
        g.add(t5,3,10);
        Text text7 = new Text("Email:");
        text7.setFill(Color.PURPLE);
        text7.setX(70);
        text7.setY(160);
        text7.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 18));
        g.add(text7, 0, 12);
        TextField t6 = new TextField();
        g.add(t6,3,12);
        Text text8 = new Text("Contact No:");
        text8.setFill(Color.PURPLE);
        text8.setX(70); 
        text8.setY(160);
        text8.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 18));
        g.add(text8, 0, 14);
        TextField t7 = new TextField();
        g.add(t7,3,14);
        Text text9 = new Text("Gender:");
        text9.setFill(Color.PURPLE);
        text9.setX(70); 
        text9.setY(160);
        text9.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 18));
        g.add(text9, 0, 16);
        RadioButton rd1 = new RadioButton("Male ");
        RadioButton rd2 = new RadioButton("Female");
        HBox hb = new HBox(rd1,rd2);
        g.add(hb, 3, 16);
        Text text10 = new Text("Address:");
        text10.setFill(Color.PURPLE);
        text10.setX(70); 
        text10.setY(160);
        text10.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 18));
        g.add(text10, 0, 18);
        TextArea ta1 = new TextArea();
        double height=100.0;
        ta1.setPrefHeight(height);
        ta1.setPrefWidth(1);
        g.add(ta1, 3, 18);
        Text text11 = new Text("Pincode:");
        text11.setFill(Color.PURPLE);
        text11.setX(70); 
        text11.setY(160);
        text11.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 18));
        g.add(text11, 0, 20);
        TextField t8 = new TextField();
        g.add(t8,3,20);
        Text text12 = new Text("City:");
        text12.setFill(Color.PURPLE);
        text12.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 18));
        g.add(text12, 0, 22);
        ComboBox cb1 = new ComboBox();
        cb1.getItems().add("Delhi");
        cb1.getItems().add("Chennai");
        g.add(cb1, 3, 22);
        Text text13 = new Text("Country:");
        text13.setFill(Color.PURPLE);
        text13.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 18));
        g.add(text13, 0, 24);
        ComboBox cb2 = new ComboBox();
        cb2.getItems().add("Ireland");
        cb2.getItems().add("India");
        g.add(cb2, 3, 24);
        Text text14 = new Text("Skills:");
        text14.setFill(Color.PURPLE);
        text14.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 18));
        g.add(text14, 0, 26);
        CheckBox c1 = new CheckBox("PHP ");
        CheckBox c2 = new CheckBox("Java ");
        CheckBox c3 = new CheckBox("Ajax ");
        CheckBox c4 = new CheckBox("Jquery ");
        CheckBox c5 = new CheckBox(".NET ");
        HBox hb2 = new HBox(c1,c2,c3,c4,c5);
        g.add(hb2, 3, 26);
        CheckBox c6 = new CheckBox("I have read terms and conditions ");
        g.add(c6, 0, 32);
        Button button1 = new Button("Submit");
        g.add(button1, 0, 34);
        Group group=new Group(g);
        Scene scene = new Scene(group,700,700,Color.KHAKI);
        stage.setScene(scene);
        stage.setTitle("20BPS1109");
        stage.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}
