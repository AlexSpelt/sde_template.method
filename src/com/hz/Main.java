package com.hz;

import com.hz.cards.*;

public class Main {

    // READ THE INSTRUCTIONS IN THIS METHOD, PLEASE!!!
    public static void main(String[] args) {

        // Lets print some cards
        Printer printer = new Console();

        // Init instances of all card types
        Card postCard = new PostCard(printer);
        Card xMasCard = new XMasCard(printer);
        Card highSchoolGraduationCard = new HighSchoolGraduationCard(printer);

        // Print all types of cards
        postCard.print();
        xMasCard.print();
        highSchoolGraduationCard.print();
    }
}
