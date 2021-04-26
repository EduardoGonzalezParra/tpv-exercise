package oop.inheritance.verifone.v240m;

import java.util.Properties;

public class VerifoneV240mStorageSystem {

    public static VerifoneV240mStorageSystem uniqueInsatance;

    private VerifoneV240mStorageSystem(){

    }

    public static VerifoneV240mStorageSystem getInstance(){
        if(uniqueInsatance == null){
            uniqueInsatance = new VerifoneV240mStorageSystem();
        }
        return uniqueInsatance;
    }

    private Properties properties = new Properties();

    public void save(String key, String value) {
        properties.setProperty(key, value);
    }

    public String get(String key) {
        return properties.getProperty(key);
    }

}
