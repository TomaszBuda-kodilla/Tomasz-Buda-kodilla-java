package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String myText, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(myText);
        System.out.println("Result equals: " + result);
    }
}
