/**@author Asimiea Sobomate-Victor
**/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.canvas.*;
import javafx.scene.web.*;
import javafx.scene.layout.*;
import javafx.scene.image.*;
import java.io.*;
import javafx.geometry.*;
import javafx.scene.Group;
import javafx.scene.text.Text;
import javafx.scene.text.Font; 
import javafx.scene.paint.Color;



public class EightballGUI extends Application{
  private Text welcome;
  private Label message;
  private TextField first;
  private Button shake;
  private Text answer;

  public void start(Stage primaryStage){
    primaryStage.setTitle("Magic 8 Ball");

    welcome = new Text("Magic 8Ball");
    welcome.setFont(Font.font("Bradley Hand ITC", 30));
    welcome.setStrokeWidth(3); 
    welcome.setStroke(Color.PURPLE);//DARKSLATEBLUE 
    
    message = new Label("Enter your question:");
    message.setFont(new Font("Bradley Hand ITC", 25));

    first = new TextField("");
    first.setMaxWidth(200);

    shake = new Button("Shake");
    shake.setOnAction(this::processShakeButtonPress);
    Font font = Font.font("Bradley Hand ITC", 20);
    shake.setFont(font);
        
    answer = new Text("");
    answer.setFont(new Font("Bradley Hand ITC", 20));
    
        
    VBox vbox = new VBox(welcome, message, first, shake, answer);
    vbox.setSpacing(20);
    vbox.setAlignment(Pos.CENTER);
    Scene scene = new Scene(vbox, 250, 270);

    BackgroundFill background_fill = new BackgroundFill(Color.YELLOW, 
                                          CornerRadii.EMPTY, Insets.EMPTY);
    Background background = new Background(background_fill);
    vbox.setBackground(background);
  
		primaryStage.setScene(scene);
		primaryStage.show();
  }

  public void processShakeButtonPress(ActionEvent e){
    answer.setText(randomAnswer());
  }

  public static String randomAnswer() {
    String answerStr;
    int answerIndex;
      
    answerIndex = (int) (Math.random() * 20 + 1);
    switch (answerIndex) {
      case 1:
        answerStr = "Signs point to yes.";
        break;
      case 2:
        answerStr = "Yes.";
        break;
      case 3:
        answerStr = "Don't think so.";
        break;
      case 4:
        answerStr = "Without a doubt.";
        break;
      case 5:
        answerStr = "HAHAHAHAHAHA.";
        break;
      case 6:
        answerStr = "As I see it, yes.";
        break;
      case 7:
        answerStr = "You may rely on it.";
        break;
      case 8:
        answerStr = "You're certainly joking.";
        break;
      case 9:
        answerStr = "Outlook not so good.";
        break;
      case 10:
        answerStr = "It is decidedly so.";
        break;
      case 11:
        answerStr = "Better not tell you now.";
        break;
      case 12:
        answerStr = "Very doubtful.";
        break;
      case 13:
        answerStr = "Sure.";
        break;
      case 14:
        answerStr = "It is certain.";
        break;
      case 15:
        answerStr = "Too early to tell.";
        break;
      case 16:
        answerStr = "Most likely.";
        break;
      case 17:
        answerStr = "Ask again later.";
        break;
      case 18:
        answerStr = "NO.";
        break;
      case 19:
        answerStr = "Definitely.";
        break;
      case 20:
        answerStr = "Don't count on it.";
        break;
      default:
        answerStr = "What?";
        break;
      }
      return answerStr;
  }

}