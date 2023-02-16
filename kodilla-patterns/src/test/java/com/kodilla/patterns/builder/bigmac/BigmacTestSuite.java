package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BigmacTestSuite {

    @Test
    void testBigmacNew() {
        //given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient("onion")
                .bun("classic")
                .sauce("classic")
                .burgers(1)
                .ingredient("pickles")
                .build();
        //when
        int res = bigmac.getIngredients().size();
        //then
        assertEquals(2, res);
    }

    @Test
    void testBigmacWithoutBun() {
        //given
        try {
            Bigmac bigmac = new Bigmac.BigmacBuilder()
                    .ingredient("onion")
                    .sauce("classic")
                    .burgers(1)
                    .ingredient("pickles")
                    .build();
        }//when
        catch (IllegalStateException e) {
            //then
            assertEquals("Cant make a burger without bun!", e.getMessage());
        }

    }
}
