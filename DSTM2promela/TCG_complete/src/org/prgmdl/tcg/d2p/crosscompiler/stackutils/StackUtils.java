package org.prgmdl.tcg.d2p.crosscompiler.stackutils;

import java.util.Stack;

public class StackUtils {
	
	public static void monOp(Stack<String> stack, String prefix) {
		StackUtils.monOp(stack,prefix,")");
	}
	
	public static void monOp(Stack<String> stack) {
		StackUtils.monOp(stack,"(",")");
	}

	public static void monOp(Stack<String> stack, String prefix, String postfix) {
        String term = stack.pop();
        String translation = prefix + term + postfix; 
        stack.push(translation);
	}
	
	public static void terOp(Stack<String> stack) {
        String second = stack.pop();
        String op = stack.pop();
        String first = stack.pop();
        String translation = "(" + first + op + second + ")"; 
        stack.push(translation);
	}

	public static void binOp(Stack<String> stack, String separator) {
        String second = stack.pop();
        String first = stack.pop();
        String translation = first + separator + second; 
        stack.push(translation);
	}
}
