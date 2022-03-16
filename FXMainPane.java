import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

//Beginning of old code.


/*
 * 
 * /**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
//public class FXMainPane extends VBox {

	//student Task #2:
	
	//In the FXMainPane class, declare five buttons, a label, and a textfield.  Declare two HBoxes that will hold the these components and go inside the VBox. 
	
	//  declare five buttons, a label, and a textfield
	
	/*
	
	Button firstButton = new Button();
	Button secondButton = new Button();
	Button thirdButton = new Button();
	Button fourthButton = new Button();
	Button fifthButton = new Button();
	
	*/
	
	//Label genericLabel;
	//TextField genericT_Field;
	
	//  declare two HBoxes
	
	//HBox box1;
	//HBox box2;
	
	//student Task #4:
	//  declare an instance of DataManager

	/*

	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	
	//DataManager output;
	
	//FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		//  instantiate the HBoxes
		
		/*
		
		firstButton.setText("Hello");
		secondButton.setText("Howdy");
		thirdButton.setText("Chinese");
		fourthButton.setText("Clear");
		fifthButton.setText("Exit");
		
		
		genericLabel  = new Label("Feedback ");
		genericT_Field = new TextField();
		
		box1 = new HBox();
		box2 = new HBox();
		
		//student Task #4:
		//  instantiate the DataManager instance
		//  set margins and set alignment of the components
		
		/*
		
		output = new DataManager();
		firstButton.setOnAction(new ButtonHandler());
		secondButton.setOnAction(new ButtonHandler());
		thirdButton.setOnAction(new ButtonHandler());
		fourthButton.setOnAction(new ButtonHandler());
		fifthButton.setOnAction(new ButtonHandler());
		
		box1.setAlignment(Pos.CENTER);
		box2.setAlignment(Pos.CENTER);
		
		box1.setPadding(new Insets(10));
		box2.setPadding(new Insets(10));
		
		HBox.setMargin(firstButton, new Insets(5));
		HBox.setMargin(secondButton, new Insets(5));
		HBox.setMargin(thirdButton, new Insets(5));
		HBox.setMargin(fourthButton, new Insets(5));
		HBox.setMargin(fifthButton, new Insets(5));
		
		setMargin(genericLabel, new Insets(100));
		setMargin(genericT_Field, new Insets(100));
		
		*/
		
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		
		/*
		
		box1.getChildren().addAll(firstButton, secondButton, thirdButton, fourthButton, fifthButton);
		box2.getChildren().addAll(genericLabel, genericT_Field);
		this.getChildren().addAll(box1, box2); */
		
		//I think you can remove this as well?
		
		//  add the buttons to the other HBox
		//  add the HBoxes to this FXMainPanel (a VBox)
		
	//}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	
	/*
	
	private class ButtonHandler implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent event) {
			
			if(event.getTarget() == firstButton) {
				genericT_Field.setText(output.getHello());
			}
			if(event.getTarget() == secondButton) {
				genericT_Field.setText(output.getHowdy());
			}
			if(event.getTarget() == thirdButton) {
				genericT_Field.setText(output.getChinese());
			}
			if(event.getTarget() == fourthButton) {
				genericT_Field.setText("");
			}
			if(event.getTarget() == fifthButton) {
				Platform.exit();
				System.exit(0);
			}
			
		}
		
	}
	*/
//} 

//End of old code (insert name here.)
	
//New code start here.

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;



public class FXMainPane extends BorderPane {

	private Button decryption, exitButton, encryption, test, clearButton;
	private TextField plainTextTextField, inputForEncryptionTextField, encryptedStringTextField3, decryptedTextField4;
	private Label plainTextLabel, descriptionForInputLabel, encryptedLabel3, decriptedLabel4, blankLabel1, blankLabel2, blankLabel3, blankLabel4;
	private RadioButton radioButton1, radioButton2;
	private int shiftInt = 0;
	FXMainPane() {
		
		Insets inset = new Insets(10); //for setting margins
		
		plainTextTextField = new TextField();
	    plainTextLabel = new Label("Enter plain-text string to encrypt");
	    inputForEncryptionTextField = new TextField();
	    descriptionForInputLabel = new Label("Cyber Key - enter an integer for Caesar Cipher");
	    encryptedStringTextField3 = new TextField();
	    encryptedLabel3 = new Label("Encrypted string");
	    decryptedTextField4 = new TextField();
	    decriptedLabel4 = new Label("Decrypted string");
	    blankLabel1 = new Label("                 ");
	    blankLabel2 = new Label("                 ");
	    blankLabel3 = new Label("                 ");
	    blankLabel4 = new Label("                 ");
	    
	    //create three radio button instances
	    radioButton1 = new RadioButton("Use Caesar cipher");
	    radioButton2 = new RadioButton("Use Bellaso cipher");
	    
	    //create a group to make the radio buttons mutually exclusive
	    ToggleGroup radioButtonGroup = new ToggleGroup();
	    radioButton1.setToggleGroup(radioButtonGroup);
	    radioButton2.setToggleGroup(radioButtonGroup);
	    
	    radioButton1.setSelected(true);

	    RadioButtonListener radioButtonListener = new RadioButtonListener();
	    radioButton1.setOnAction(radioButtonListener);
	    radioButton2.setOnAction(radioButtonListener);
	    
	    radioButton1.setAlignment(Pos.CENTER);
	    radioButton2.setAlignment(Pos.CENTER);
		
	    HBox topBox = new HBox();
	    HBox.setMargin(radioButton1, inset);
	    topBox.setAlignment(Pos.CENTER);
	    topBox.getChildren().addAll(radioButton1, radioButton2); 
	    topBox.setStyle("-fx-border-color: gray;");
	    
	    //create the leftPanel
	    VBox centerBox = new VBox(10);
	    centerBox.getChildren().addAll(plainTextLabel, plainTextTextField, 	encryptedLabel3, encryptedStringTextField3, 
	    		decriptedLabel4, decryptedTextField4, descriptionForInputLabel, inputForEncryptionTextField);
	    setCenter(centerBox);
		 
	    setRight(blankLabel1);
	    setLeft(blankLabel2);
	    setTop(topBox);
	    
	    //create the exit Button
	    exitButton = new Button("E_xit");
		//_ in label specifies that the next character is the mnemonic, ie, type Alt-m as a shortcut
	    //this activates the mnemonic on exitButton when the Alt key is pressed
	    exitButton.setMnemonicParsing(true);  
	    exitButton.setTooltip(new Tooltip("Select to close the application"));
	    //use a lambda expression for the EventHandler class for exitButton
        exitButton.setOnAction(
        		event -> {
            	 Platform.exit();
                 System.exit(0);
        		}
        	);
	    
        //create the clear Button
	    clearButton = new Button("_Clear");
	    clearButton.setMnemonicParsing(true);  
	    clearButton.setTooltip(new Tooltip("Select this to clear the text fields"));
	    //create a listener for the other button using a lambda expression
	    clearButton.setOnAction(event -> {
			System.out.println("...clearing text fields...");
			plainTextTextField.setText("");
			inputForEncryptionTextField.setText("");
			encryptedStringTextField3.setText("");
			decryptedTextField4.setText("");
		});
	    
	    //create the decryption Button
	    decryption = new Button("_Decrypt a string");
	    decryption.setMnemonicParsing(true);  
	    decryption.setTooltip(new Tooltip("Select this to decrypt a string"));
	    //create a listener for the other button using a lambda expression
	    decryption.setOnAction(event -> {
	    	String encryptedText = "";
	    	String bellasoStr = "";
	    	String decryptedText;
			System.out.println("...decrypting...");
			encryptedText = encryptedStringTextField3.getText();
			if (radioButton1.isSelected()) {
				shiftInt = Integer.parseInt(inputForEncryptionTextField.getText());
				decryptedText = CryptoManager.decryptCaesar(encryptedText, shiftInt);
			}
			else {
				bellasoStr = inputForEncryptionTextField.getText().toUpperCase();
				inputForEncryptionTextField.setText(bellasoStr);
				decryptedText = CryptoManager.decryptBellaso(encryptedText, bellasoStr);
			}
			decryptedTextField4.setText(decryptedText);
		});
	    
	  
	    //create the encryption Button
	    encryption = new Button("Encrypt a string");
	    encryption.setMnemonicParsing(true);  
	    encryption.setTooltip(new Tooltip("Encrypt the string in the upper textfield"));
	    encryption.setVisible(true);
	    //create a listener for the exit button using a lambda expression
	    encryption.setOnAction(event -> {
	    	try {
				System.out.println("...encrypting...");
				String bellasoStr = "";
				String encryptedStr = "";
				
				if (radioButton1.isSelected()) {
					shiftInt = Integer.parseInt(inputForEncryptionTextField.getText());
					encryptedStr = CryptoManager.encryptCaesar(plainTextTextField.getText().toUpperCase(), shiftInt);
				}
				else {
					bellasoStr = inputForEncryptionTextField.getText().toUpperCase();
					inputForEncryptionTextField.setText(bellasoStr);
					encryptedStr = CryptoManager.encryptBellaso(plainTextTextField.getText().toUpperCase(), bellasoStr);
				}
					
				plainTextTextField.setText(plainTextTextField.getText().toUpperCase());
				if (encryptedStr.equals(""))
					encryptedStringTextField3.setText("encryption failed");
				else
					encryptedStringTextField3.setText(encryptedStr);
			} catch (NumberFormatException e) {
				System.out.println(inputForEncryptionTextField.getText()+" should be an integer");	
			}
		});
	    
	    
	  //create the encryption Button
	    test = new Button("Test toStudent File");
	    test.setMnemonicParsing(true);  
	    test.setTooltip(new Tooltip("Test the toStudent java file"));
	    test.setVisible(true);
	    //create a listener for the exit button using a lambda expression
	    test.setOnAction(event -> {
			System.out.println("...testing...");
			try {
				CryptoManager.stringInBounds("TEST");
			} catch (RuntimeException e) {
				System.out.println("stringInBounds "+e.getMessage());
			}try {
				CryptoManager.encryptCaesar("TEST", 3);
			} catch (RuntimeException e) {
				System.out.println("encryptCaesar "+e.getMessage());
			}
			try {
				CryptoManager.encryptBellaso("TEST", "CMSC");
			} catch (RuntimeException e) {
				System.out.println("encryptBellaso "+e.getMessage());
			}
			try {
				CryptoManager.decryptCaesar("TEST", 3);
			} catch (RuntimeException e) {
				System.out.println("decryptCaesar "+e.getMessage());
			}
			try {
				CryptoManager.decryptBellaso("TEST", "CMSC");
			} catch (RuntimeException e) {
				System.out.println("decryptBellaso "+e.getMessage());
			}

		});
	    
	    HBox bottomBox = new HBox();
	    //HBox.setMargin(breakEncryption, inset);
	    HBox.setMargin(decryption, inset);
	    HBox.setMargin(encryption, inset);
	    HBox.setMargin(clearButton, inset);
	    HBox.setMargin(exitButton, inset);
	    //bottomBox.getChildren().addAll(encryption, decryption, clearButton, test, exitButton); // 
	    bottomBox.getChildren().addAll(encryption, decryption, clearButton, exitButton);
	    setBottom(bottomBox);
	    bottomBox.setAlignment(Pos.CENTER);
		
	    
	}
	class RadioButtonListener implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event) {
			Object source = event.getTarget();
			if (source == radioButton1)
			{
				descriptionForInputLabel.setText("Cyber Key - enter an integer for Caesar Cipher"); 
			}
			else if(source == radioButton2)
			{
				descriptionForInputLabel.setText("Cyber Key - enter a string for Bellaso Cipher"); 
			}
		}
	}
}
	
