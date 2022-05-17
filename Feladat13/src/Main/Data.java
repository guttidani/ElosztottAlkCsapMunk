/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Czuth Dominik
 */
public class Data {
    SimpleStringProperty fileName;
   SimpleStringProperty path;
   SimpleStringProperty size;
   SimpleStringProperty dateModified;
   Data(String fileName, String path, String size, String dateModified) {
      this.fileName = new SimpleStringProperty(fileName);
      this.path = new SimpleStringProperty(path);
      this.size = new SimpleStringProperty(size);
      this.dateModified = new SimpleStringProperty(dateModified);
   }
   public String getFileName(){
      return fileName.get();
   }
   public void setFileName(String fname){
      fileName.set(fname);
   }
   public String getPath(){
      return path.get();
   }
   public void setPath(String fpath){
      path.set(fpath);
   }
   public String getSize(){
      return size.get();
   }
   public void setSize(String fsize){
      size.set(fsize);
   }
   public String getDateModified(){
      return dateModified.get();
   }
   public void setModified(String fmodified){
      dateModified.set(fmodified);
   }
}
