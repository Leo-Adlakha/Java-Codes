package CEC07;

import java.awt.*;  
import java.applet.*;  
  
  
@SuppressWarnings({ "serial", "deprecation" })
public class DisplayImage extends Applet {  
  
  Image picture;  
  
  public void init() {  
    picture = getImage(getDocumentBase(),"../../../../Documents/my_image.jpg");  
  }  
    
  public void paint(Graphics g) {  
    g.drawImage(picture, 0,0, this);  
  }  
      
  }  