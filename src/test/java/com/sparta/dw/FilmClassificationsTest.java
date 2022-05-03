package com.sparta.dw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.sparta.dw.FilmClassifications.*;

class FilmClassificationsTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 11})
    public void underTwelveTest(int ageOfViewer) {
        //act
        String actualResult = FilmClassifications.availableClassifications(ageOfViewer);
        //assert
        Assertions.assertEquals(UNDER_TWELVE, actualResult);
    }
    @ParameterizedTest
    @ValueSource(ints = {12, 14})
    public void underFifteenTest(int ageOfViewer) {
        //act
        String actualResult = FilmClassifications.availableClassifications(ageOfViewer);
        //assert
        Assertions.assertEquals(UNDER_FIFTEEN, actualResult);
    }
    @ParameterizedTest
            @ValueSource(ints = {15, 17})
            public void underEighteenTest(int ageOfViewer) {
        //act
        String actualResult = FilmClassifications.availableClassifications(ageOfViewer);
        //assert
        Assertions.assertEquals(UNDER_EIGHTEEN, actualResult);
            }
            @ParameterizedTest
                    @ValueSource(ints = {18, 29})
    public void overEighteenTest(int ageOfViewer) {
        //act
                String actualResult = FilmClassifications.availableClassifications(ageOfViewer);
                //assert
                Assertions.assertEquals(OVER_EIGHTEEN, actualResult);

            }
}

