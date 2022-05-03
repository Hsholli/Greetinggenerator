package com.sparta.dw;


public class FilmClassifications {

    public static final String UNDER_TWELVE = "U, PG films are available.";
    public static final String UNDER_FIFTEEN = "U, PG, 12 & 15 films are available.";
    public static final String UNDER_EIGHTEEN = "U, PG, 12 & 15 films are available.";
    public static final String OVER_EIGHTEEN = "All films are available";

    public static String availableClassifications(int ageOfViewer) {

        if (ageOfViewer > 0 && ageOfViewer < 12) {
            return UNDER_TWELVE;
        } else if (ageOfViewer >= 12 && ageOfViewer < 15) {
            return UNDER_FIFTEEN;
        } else if (ageOfViewer >= 15 && ageOfViewer < 18) {
            return UNDER_EIGHTEEN;
        } else {
            return OVER_EIGHTEEN;


        }
    }
}