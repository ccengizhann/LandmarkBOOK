package com.cengizhancivelek.landmarkbook;

import java.io.Serializable;

public class Landmark implements Serializable {

    String name;
    String country;
    int image;
    //image ı integer olarak tanımlama sebbeimiz android studio imagelerı bir sayıya ataryarak kullanır
    // bu sebeble integer tanımlarız


    public Landmark(String name, String country, int image){
        this.name = name;
        this.country = country;
        this.image = image;
    }
}
