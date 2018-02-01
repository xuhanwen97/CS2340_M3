package cs2340.gatech.edu.lab3.model;

/**
 * Created by xuhan on 2/1/2018.
 */

public enum ClassStanding {
    FRESHMAN("FR"),
    SOPHOMORE("SO"),
    JUNIOR("JR"),
    SENIOR("SR");

    private String code;

    ClassStanding(String code) {
        this.code = code;
    }
}
