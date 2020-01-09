package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(codeToExecute);

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("New examples of text");
        poemBeautifier.beautify("My example", myText -> "ABC " + myText + " ABC" );
        poemBeautifier.beautify("My example", myText -> myText.toUpperCase());
        poemBeautifier.beautify("My example", myText -> myText.toLowerCase());
        poemBeautifier.beautify("My example", myText -> myText.replace("My example", "elpmaxe yM"));
    }
}