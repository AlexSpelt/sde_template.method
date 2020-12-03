package com.hz.cards;

import com.hz.Printer;

public class XMasCard extends Card {

    public XMasCard(Printer printer) {
        super(printer);
    }

    void printFooter() {
        this.printer.printLine("****************************************");
    }

    void printImage() {
        this.printer.printLine("(             )");
        this.printer.printLine(" `--(_   _)--'");
        this.printer.printLine("      Y-Y");
        this.printer.printLine("     /@@ \\");
        this.printer.printLine("    /     \\");
        this.printer.printLine("    `--'.  \\             ,");
        this.printer.printLine("        |   `.__________/)");
    }

    void printMessage() {
        this.printer.printLine("Merry X-mas and a happy new year!");
    }

    void printHeader() {
        this.printer.printLine("****************************************");
    }

}
