package Validator;

import junit.framework.Assert;
import org.junit.Test;

public class PasswordValidatorTest {

    @Test
    public void shouldHaveBetween5And10Characters() {
        Assert.assertTrue(PasswordValidator.isValid("123C!"));
        Assert.assertTrue(PasswordValidator.isValid("12347C90!c"));
        Assert.assertTrue(PasswordValidator.isValid("12345C7!"));
        Assert.assertFalse(PasswordValidator.isValid("1$c4"));
        Assert.assertFalse(PasswordValidator.isValid("123c5678901^"));
    }

    @Test
    public void shouldNotContainSpaces() {
        Assert.assertFalse(PasswordValidator.isValid("12345 6c"));
        Assert.assertFalse(PasswordValidator.isValid("12 c 345 6"));
    }

    @Test
    public void shouldHaveAtLeastOneSymbolAndOneDigit() {
        Assert.assertTrue(PasswordValidator.isValid("12345f?"));
        Assert.assertTrue(PasswordValidator.isValid("12345F!"));
        Assert.assertTrue(PasswordValidator.isValid("fffff1@"));
        Assert.assertTrue(PasswordValidator.isValid("DDDDD5!"));
        Assert.assertFalse(PasswordValidator.isValid("DDDDDD!"));
        Assert.assertFalse(PasswordValidator.isValid("5555555!"));
    }

    @Test
    public void shouldHaveAtLeastOneSpecialCharacter() {
        Assert.assertTrue(PasswordValidator.isValid("123cc5f!"));
        Assert.assertFalse(PasswordValidator.isValid("123cc5f"));
    }
}