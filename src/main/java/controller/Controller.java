package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.*;

public class Controller implements Initializable{
	
	Game game = new Game(new Player("Default", "PC", 30, new Gun("Pickaxe", 0)));

    @FXML
    private Button button25;

    @FXML
    private Button button24;

    @FXML
    private Label platformtxt;

    @FXML
    private Button button27;

    @FXML
    private Button button26;

    @FXML
    private TitledPane nintendoTable;

    @FXML
    private Button button21;

    @FXML
    private Button button20;

    @FXML
    private Button button23;

    @FXML
    private Button button22;

    @FXML
    private TableColumn<?, ?> nintendoC1;

    @FXML
    private Label bulletsTxt;

    @FXML
    private TableColumn<?, ?> nintendoC4;

    @FXML
    private Button addPlayerBut;

    @FXML
    private TableColumn<?, ?> nintendoC5;

    @FXML
    private TitledPane iPhoneTable;

    @FXML
    private Button button28;

    @FXML
    private TableColumn<?, ?> nintendoC2;

    @FXML
    private ListView<String> gunsList;

    @FXML
    private TableColumn<?, ?> nintendoC3;

    @FXML
    private Label gunName;

    @FXML
    private TableView<?> xboxTable;

    @FXML
    private Label numBullets;

    @FXML
    private Button ButtonAddGun;

    @FXML
    private Label pingtxt;

    @FXML
    private TextField platformArea;

    @FXML
    private Button button14;

    @FXML
    private Button button4;

    @FXML
    private Button button13;

    @FXML
    private Button button5;

    @FXML
    private Button button16;

    @FXML
    private Button button2;

    @FXML
    private Button button15;

    @FXML
    private Button button3;

    @FXML
    private Button button8;

    @FXML
    private Button button10;

    @FXML
    private Button button9;

    @FXML
    private Button button12;

    @FXML
    private Button button6;

    @FXML
    private Button button11;

    @FXML
    private Button button7;

    @FXML
    private Button button18;

    @FXML
    private Button button17;

    @FXML
    private Button button19;

    @FXML
    private TableColumn<?, ?> pcC4;

    @FXML
    private TableColumn<?, ?> pcC5;

    @FXML
    private TableColumn<?, ?> pcC1;

    @FXML
    private TableColumn<?, ?> pcC2;

    @FXML
    private TableColumn<?, ?> pcC3;

    @FXML
    private TableColumn<?, ?> playC5;

    @FXML
    private TableColumn<?, ?> xboxC4;

    @FXML
    private TableColumn<?, ?> playC3;

    @FXML
    private TableColumn<?, ?> xboxC5;

    @FXML
    private TableColumn<?, ?> playC4;

    @FXML
    private TableColumn<?, ?> xboxC2;

    @FXML
    private TableColumn<?, ?> playC1;

    @FXML
    private TableColumn<?, ?> xboxC3;

    @FXML
    private TableColumn<?, ?> playC2;

    @FXML
    private TableColumn<?, ?> xboxC1;

    @FXML
    private Label gunImage;

    @FXML
    private Button shootButton;

    @FXML
    private TitledPane psTable;

    @FXML
    private Button button1;

    @FXML
    private TableColumn<?, ?> iphoneC3;

    @FXML
    private TableColumn<?, ?> iphoneC2;

    @FXML
    private TableColumn<?, ?> iphoneC5;

    @FXML
    private TableColumn<?, ?> iphoneC4;

    @FXML
    private TextField userArea;

    @FXML
    private TableView<?> pcTable;

    @FXML
    private TextField pingArea;

    @FXML
    private TableColumn<?, ?> iphoneC1;

    @FXML
    private Label gunTxt;

    @FXML
    private Label usertxt;

    @FXML
    void butAddPlayer(ActionEvent event) {

    }

       @FXML
    void but28(ActionEvent event) {
        
        URL route28 = getClass().getResource("/data/guns/28b.png");
        Image imageGun28 = new Image(route28.toString());
        gunImage.setGraphic(new ImageView(imageGun28));
        gunName.setText("Stink bomb");

    }

    @FXML
    void but27(ActionEvent event) {
        
        URL route27 = getClass().getResource("/data/guns/27b.png");
        Image imageGun27 = new Image(route27.toString());
        gunImage.setGraphic(new ImageView(imageGun27));
        gunName.setText("Remote explosives");

    }

    @FXML
    void but24(ActionEvent event) {
        
        URL route24 = getClass().getResource("/data/guns/24b.png");
        Image imageGun24 = new Image(route24.toString());
        gunImage.setGraphic(new ImageView(imageGun24));
        gunName.setText("Compact SMG");

    }

    @FXML
    void but25(ActionEvent event) {
        
        URL route25 = getClass().getResource("/data/guns/25b.png");
        Image imageGun25 = new Image(route25.toString());
        gunImage.setGraphic(new ImageView(imageGun25));
        gunName.setText("Grenade");

    }

    @FXML
    void but26(ActionEvent event) {
        
        URL route26 = getClass().getResource("/data/guns/26b.png");
        Image imageGun26 = new Image(route26.toString());
        gunImage.setGraphic(new ImageView(imageGun26));
        gunName.setText("Clinger");

    }

    @FXML
    void but22(ActionEvent event) {
        
        URL route22 = getClass().getResource("/data/guns/22b.png");
        Image imageGun22 = new Image(route22.toString());
        gunImage.setGraphic(new ImageView(imageGun22));
        gunName.setText("Grenade launcher");

    }

    @FXML
    void but23(ActionEvent event) {
        
        URL route23 = getClass().getResource("/data/guns/23b.png");
        Image imageGun23 = new Image(route23.toString());
        gunImage.setGraphic(new ImageView(imageGun23));
        gunName.setText("Guided missile");

    }

    @FXML
    void but15(ActionEvent event) {
        
        URL route15 = getClass().getResource("/data/guns/15b.png");
        Image imageGun15 = new Image(route15.toString());
        gunImage.setGraphic(new ImageView(imageGun15));
        gunName.setText("Pump shotgun");

    }

    @FXML
    void but20(ActionEvent event) {
        
        URL route20 = getClass().getResource("/data/guns/20b.png");
        Image imageGun20 = new Image(route20.toString());
        gunImage.setGraphic(new ImageView(imageGun20));
        gunName.setText("Hunting rifle");

    }

    @FXML
    void but19(ActionEvent event) {
        
        URL route19 = getClass().getResource("/data/guns/19b.png");
        Image imageGun19 = new Image(route19.toString());
        gunImage.setGraphic(new ImageView(imageGun19));
        gunName.setText("Semi-auto sniper rifle");

    }

    @FXML
    void but18(ActionEvent event) {
        
        URL route18 = getClass().getResource("/data/guns/18b.png");
        Image imageGun18 = new Image(route18.toString());
        gunImage.setGraphic(new ImageView(imageGun18));
        gunName.setText("Bolt-action sniper rifle");

    }

    @FXML
    void but17(ActionEvent event) {
        
        URL route17 = getClass().getResource("/data/guns/17b.png");
        Image imageGun17 = new Image(route17.toString());
        gunImage.setGraphic(new ImageView(imageGun17));
        gunName.setText("Heavy shotgun");

    }

    @FXML
    void but16(ActionEvent event) {
        
        URL route16 = getClass().getResource("/data/guns/16b.png");
        Image imageGun16 = new Image(route16.toString());
        gunImage.setGraphic(new ImageView(imageGun16));
        gunName.setText("Tactical shotgun");

    }

    @FXML
    void but21(ActionEvent event) {
        
        URL route21 = getClass().getResource("/data/guns/21b.png");
        Image imageGun21 = new Image(route21.toString());
        gunImage.setGraphic(new ImageView(imageGun21));
        gunName.setText("Rocket launcher");

    }

    @FXML
    void but9(ActionEvent event) {
        
        URL route9 = getClass().getResource("/data/guns/9b.png");
        Image imageGun9 = new Image(route9.toString());
        gunImage.setGraphic(new ImageView(imageGun9));
        gunName.setText("Minigun");

    }

    @FXML
    void but8(ActionEvent event) {
        
        URL route8 = getClass().getResource("/data/guns/8b.png");
        Image imageGun8 = new Image(route8.toString());
        gunImage.setGraphic(new ImageView(imageGun8));
        gunName.setText("Submachine gun");
        

    }

    @FXML
    void but12(ActionEvent event) {
        
        URL route12 = getClass().getResource("/data/guns/12b.png");
        Image imageGun12 = new Image(route12.toString());
        gunImage.setGraphic(new ImageView(imageGun12));
        gunName.setText("Suppressed pistol");

    }

    @FXML
    void but11(ActionEvent event) {
        
        URL route11 = getClass().getResource("/data/guns/11b.png");
        Image imageGun11 = new Image(route11.toString());
        gunImage.setGraphic(new ImageView(imageGun11));
        gunName.setText("Revolver");

    }

    @FXML
    void but10(ActionEvent event) {
        
        URL route10 = getClass().getResource("/data/guns/10b.png");
        Image imageGun10 = new Image(route10.toString());
        gunImage.setGraphic(new ImageView(imageGun10));
        gunName.setText("Pistol");

    }

    @FXML
    void but14(ActionEvent event) {
        
        URL route14 = getClass().getResource("/data/guns/14b.png");
        Image imageGun14 = new Image(route14.toString());
        gunImage.setGraphic(new ImageView(imageGun14));
        gunName.setText("Dual pistol");

    }

    @FXML
    void but13(ActionEvent event) {
        
        URL route13 = getClass().getResource("/data/guns/13b.png");
        Image imageGun13 = new Image(route13.toString());
        gunImage.setGraphic(new ImageView(imageGun13));
        gunName.setText("Hand cannon");

    }

    @FXML
    void but3(ActionEvent event) {
        
        URL route3 = getClass().getResource("/data/guns/3b.png");
        Image imageGun3 = new Image(route3.toString());
        gunImage.setGraphic(new ImageView(imageGun3));
        gunName.setText("Assault rifle (M4)");

    }

    @FXML
    void but2(ActionEvent event) {
        
        URL route2 = getClass().getResource("/data/guns/2b.png");
        Image imageGun2 = new Image(route2.toString());
        gunImage.setGraphic(new ImageView(imageGun2));
        gunName.setText("Assault rifle (BURST)");

    }

    @FXML
    void but1(ActionEvent event) {
        
        URL route1 = getClass().getResource("/data/guns/1b.png");
        Image imageGun1 = new Image(route1.toString());
        gunImage.setGraphic(new ImageView(imageGun1));
        gunName.setText("Assault rifle (SCOPED)");

    }

    @FXML
    void but7(ActionEvent event) {
        
        URL route7 = getClass().getResource("/data/guns/7b.png");
        Image imageGun7 = new Image(route7.toString());
        gunImage.setGraphic(new ImageView(imageGun7));
        gunName.setText("Suppressed submachine gun");

    }

    @FXML
    void but6(ActionEvent event) {
        
        URL route6 = getClass().getResource("/data/guns/6b.png");
        Image imageGun6 = new Image(route6.toString());
        gunImage.setGraphic(new ImageView(imageGun6));
        gunName.setText("Light machine gun");

    }

    @FXML
    void but5(ActionEvent event) {
        
        URL route5 = getClass().getResource("/data/guns/5b.png");
        Image imageGun5 = new Image(route5.toString());
        gunImage.setGraphic(new ImageView(imageGun5));
        gunName.setText("Assault rifle (BURST RARE)");
        
    }

    @FXML
    void but4(ActionEvent event) {

        URL route4 = getClass().getResource("/data/guns/4b.png");
        Image imageGun4 = new Image(route4.toString());
        gunImage.setGraphic(new ImageView(imageGun4));
        gunName.setText("Assault rifle (SCAR)");
        
    }

    @FXML
    void butAdd(ActionEvent event) {
    
        Gun gun = new Gun(gunName.getText(), 3);
        try {
            game.getPlayer().addGun(gun);
            gunsList.getItems().add(0, game.gunName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        numBullets.setText(String.valueOf(game.bullets()));

    }
    
    void paintGuns() {
        
        if(gunsList.getItems().isEmpty()) {
            
            try {
            gunsList.getItems().add(gunsList.getItems().size(), game.gunName());    
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
        
        numBullets.setText(String.valueOf(game.bullets()));
        
        
        
    }       
   
    
    @FXML
    void butShoot(ActionEvent event) {
        
        if(gunsList.getItems().get(0).toString() != "Pickaxe") {
            
            game.shoot();
            numBullets.setText(String.valueOf(game.bullets()));
            
            if(game.bullets() == 0) {
                
                gunsList.getItems().removeAll(game.gunName());
                numBullets.setText(String.valueOf(game.bullets()));

                
                
            }
            
        }
   
    }
    
    public void images() {
    
        URL route1 = getClass().getResource("/data/guns/1.png");
        Image imageGun1 = new Image(route1.toString());
        button1.setGraphic(new ImageView(imageGun1));
        
        URL route2 = getClass().getResource("/data/guns/2.png");
        Image imageGun2 = new Image(route2.toString());
        button2.setGraphic(new ImageView(imageGun2));
        
        URL route3 = getClass().getResource("/data/guns/3.png");
        Image imageGun3 = new Image(route3.toString());
        button3.setGraphic(new ImageView(imageGun3));
        
        URL route4 = getClass().getResource("/data/guns/4.png");
        Image imageGun4 = new Image(route4.toString());
        button4.setGraphic(new ImageView(imageGun4));
        
        URL route5 = getClass().getResource("/data/guns/5.png");
        Image imageGun5 = new Image(route5.toString());
        button5.setGraphic(new ImageView(imageGun5));
        
        URL route6 = getClass().getResource("/data/guns/6.png");
        Image imageGun6 = new Image(route6.toString());
        button6.setGraphic(new ImageView(imageGun6));
        
        URL route7 = getClass().getResource("/data/guns/7.png");
        Image imageGun7 = new Image(route7.toString());
        button7.setGraphic(new ImageView(imageGun7));
        
        URL route8 = getClass().getResource("/data/guns/8.png");
        Image imageGun8 = new Image(route8.toString());
        button8.setGraphic(new ImageView(imageGun8));
        
        URL route9 = getClass().getResource("/data/guns/9.png");
        Image imageGun9 = new Image(route9.toString());
        button9.setGraphic(new ImageView(imageGun9));
        
        URL route10 = getClass().getResource("/data/guns/10.png");
        Image imageGun10 = new Image(route10.toString());
        button10.setGraphic(new ImageView(imageGun10));
        
        URL route11 = getClass().getResource("/data/guns/11.png");
        Image imageGun11 = new Image(route11.toString());
        button11.setGraphic(new ImageView(imageGun11));
        
        URL route12 = getClass().getResource("/data/guns/12.png");
        Image imageGun12 = new Image(route12.toString());
        button12.setGraphic(new ImageView(imageGun12));
        
        URL route13 = getClass().getResource("/data/guns/13.png");
        Image imageGun13 = new Image(route13.toString());
        button13.setGraphic(new ImageView(imageGun13));
        
        URL route14 = getClass().getResource("/data/guns/14.png");
        Image imageGun14 = new Image(route14.toString());
        button14.setGraphic(new ImageView(imageGun14));
        
        URL route15 = getClass().getResource("/data/guns/15.png");
        Image imageGun15 = new Image(route15.toString());
        button15.setGraphic(new ImageView(imageGun15));
        
        URL route16 = getClass().getResource("/data/guns/16.png");
        Image imageGun16 = new Image(route16.toString());
        button16.setGraphic(new ImageView(imageGun16));
        
        URL route17 = getClass().getResource("/data/guns/17.png");
        Image imageGun17 = new Image(route17.toString());
        button17.setGraphic(new ImageView(imageGun17));
        
        URL route18 = getClass().getResource("/data/guns/18.png");
        Image imageGun18 = new Image(route18.toString());
        button18.setGraphic(new ImageView(imageGun18));
        
        URL route19 = getClass().getResource("/data/guns/19.png");
        Image imageGun19 = new Image(route19.toString());
        button19.setGraphic(new ImageView(imageGun19));
        
        URL route20 = getClass().getResource("/data/guns/20.png");
        Image imageGun20 = new Image(route20.toString());
        button20.setGraphic(new ImageView(imageGun20));
        
        URL route21 = getClass().getResource("/data/guns/21.png");
        Image imageGun21 = new Image(route21.toString());
        button21.setGraphic(new ImageView(imageGun21));
        
        URL route22 = getClass().getResource("/data/guns/22.png");
        Image imageGun22 = new Image(route22.toString());
        button22.setGraphic(new ImageView(imageGun22));
        
        URL route23 = getClass().getResource("/data/guns/23.png");
        Image imageGun23 = new Image(route23.toString());
        button23.setGraphic(new ImageView(imageGun23));
        
        URL route24 = getClass().getResource("/data/guns/24.png");
        Image imageGun24 = new Image(route24.toString());
        button24.setGraphic(new ImageView(imageGun24));
        
        URL route25 = getClass().getResource("/data/guns/25.png");
        Image imageGun25 = new Image(route25.toString());
        button25.setGraphic(new ImageView(imageGun25));
        
        URL route26 = getClass().getResource("/data/guns/26.png");
        Image imageGun26 = new Image(route26.toString());
        button26.setGraphic(new ImageView(imageGun26));
        
        URL route27 = getClass().getResource("/data/guns/27.png");
        Image imageGun27 = new Image(route27.toString());
        button27.setGraphic(new ImageView(imageGun27));
        
        URL route28 = getClass().getResource("/data/guns/28.png");
        Image imageGun28 = new Image(route28.toString());
        button28.setGraphic(new ImageView(imageGun28));

    }

	public void initialize(URL location, ResourceBundle resources) {
	
		 images();
	        paintGuns();
	        gunsList.setMouseTransparent( true );
	        gunsList.setFocusTraversable( false );
		
	}




}