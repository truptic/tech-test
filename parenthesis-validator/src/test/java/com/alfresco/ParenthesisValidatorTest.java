package com.alfresco;

import com.alfresco.validator.ParenthesisValidator;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import javax.annotation.Resource;


public class ParenthesisValidatorTest extends TestCase {

    public void testParenthesisValidator(){
        assertTrue(new ParenthesisValidator("[dog]").validate());
        assertTrue(new ParenthesisValidator("dog[A]").validate());
        assertTrue(new ParenthesisValidator("(dog[A])").validate());
        assertTrue(new ParenthesisValidator("({dog})").validate());

        assertFalse(new ParenthesisValidator("(A}B)C}").validate());
        assertFalse(new ParenthesisValidator("()(({}{}{}").validate());
        assertFalse(new ParenthesisValidator("(").validate());

    }
}
