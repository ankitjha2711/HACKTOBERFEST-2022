import java.util.List;
import javafx.application.Application; 
import javafx.collections.FXCollections; 
import javafx.collections.ObservableList; 
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.control.CheckBox; 
import javafx.scene.control.ChoiceBox; 
import javafx.scene.control.DatePicker; 
import javafx.scene.control.ListView; 
import javafx.scene.control.RadioButton; 
import javafx.scene.layout.GridPane; 
import javafx.scene.text.Text; 
import javafx.scene.control.TextField; 
import javafx.scene.control.ToggleGroup; 
import javafx.scene.control.ToggleButton; 
import javafx.stage.Stage; 
public class UI extends Application { 
@Override
public void start(Stage stage) { 
Text nameLabel = new Text("Username"); 
TextField nameText = new TextField(); 
Text passLabel = new Text("Password"); 
TextField passText = new TextField(); 
Text empLabel = new Text("City of Employment"); 
TextField empText = new TextField(); 
Text webLabel = new Text("Web Server"); 
ChoiceBox<String> webBox = new ChoiceBox(); 
webBox.getItems().addAll("Choose a server"); 
Text roleLabel = new Text("Please specify your role"); 
ToggleGroup groupGender = new ToggleGroup(); 
RadioButton adminRadio = new RadioButton("Admin"); 
adminRadio.setToggleGroup(groupGender); 
RadioButton EngineerRadio = new RadioButton("Engineer"); 
EngineerRadio.setToggleGroup(groupGender); 
RadioButton managerRadio = new RadioButton("Manager"); 
managerRadio.setToggleGroup(groupGender); 
RadioButton GuestRadio = new RadioButton("Guest"); 
GuestRadio.setToggleGroup(groupGender); 
Text newLabel = new Text("Single sign-on to the following"); 
CheckBox mailCheckBox = new CheckBox("Mail"); 
mailCheckBox.setIndeterminate(false); 
CheckBox payrollCheckBox = new CheckBox("Payroll"); 
payrollCheckBox.setIndeterminate(false);
CheckBox selfCheckBox = new CheckBox("Self-Service"); 
selfCheckBox.setIndeterminate(false);
Button buttonRegister = new Button("Login"); 
Button buttonRegister2 = new Button("Reset"); 
GridPane gridPane = new GridPane(); 
//Setting size for the pane 
gridPane.setMinSize(500, 500); 
//Setting the padding 
gridPane.setPadding(new Insets(10, 10, 10, 10)); 
//Setting the vertical and horizontal gaps between the columns 
gridPane.setVgap(5); 
gridPane.setHgap(5); 
//Setting the Grid alignment 
gridPane.setAlignment(Pos.CENTER); 
//Arranging all the nodes in the grid 
gridPane.add(nameLabel, 0, 0); 
gridPane.add(nameText, 1, 0); 
gridPane.add(passLabel, 0, 1); 
gridPane.add(passText, 1, 1); 
gridPane.add(empLabel, 0, 2);
gridPane.add(empText, 1, 2); 
gridPane.add(webLabel, 0, 3); 
gridPane.add(webBox, 1, 3); 
gridPane.add(roleLabel, 0, 6); 
gridPane.add(adminRadio, 1, 5); 
gridPane.add(EngineerRadio, 1, 6); 
gridPane.add(managerRadio, 1, 7);
gridPane.add(GuestRadio, 1, 8);  
gridPane.add(newLabel, 0, 10); 
gridPane.add(mailCheckBox, 1, 9); 
gridPane.add(payrollCheckBox, 1, 10); 
gridPane.add(selfCheckBox, 1, 11); 
gridPane.add(buttonRegister, 1, 12); 
gridPane.add(buttonRegister2,1,12);
//Creating a scene object 
Scene scene = new Scene(gridPane); 
//Setting title to the Stage 
stage.setTitle("Registration Form"); 
//Adding scene to the stage 
stage.setScene(scene); 
//Displaying the contents of the stage 
stage.show(); 
} 
public static void main(String args[]){ 
launch(args); 
} }