package com.example.demo1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class HelloController {
    public TextField StrEnlace;
    public WebView webView;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {


        String link=StrEnlace.getText();
        Desktop enlace =Desktop.getDesktop();
        try {
            WebEngine webEngine=webView.getEngine();
            webEngine.load(link);
            enlace.browse(new URI(link));
        }catch (IOException | URISyntaxException e){
            e.printStackTrace();
        }
    }
}