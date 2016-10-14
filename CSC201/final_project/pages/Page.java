
/*
Creates a class to represent a page that needs to be scraped
Final Project
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 12 October 2016
*/

package pages;

import java.io.Serializable;

public class Page implements Serializable 
{
    private String url;
    private String currentHash;

    public Page(String url){
        this.url = url;
        this.currentHash = "0";
    }

    public String getURL(){
        return url;
    }

    public void setCurrentHash(String hash){
        this.currentHash = hash;
    }

    public String getCurrentHash(){
        return currentHash;
    }
}
