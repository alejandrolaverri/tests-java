package com.alejandromo.javatests;

import com.alejandromo.javatests.util.StringUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtilTest {
    @Test
    public void repeat_string_once() {
        Assert.assertEquals("hola", StringUtil.repeat("hola", 1));
    }
    @Test
    public void repeat_string_multiple_times() {
        Assert.assertEquals("holaholahola", StringUtil.repeat("hola", 3));
    }
    @Test
    public void repeat_string_zero_times() {
        Assert.assertEquals("", StringUtil.repeat("hola", 0));
    }
    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times() {
        Assert.assertEquals("", StringUtil.repeat("hola", -1));
    }
    @Test
    public void string_is_not_empty() {
        assertFalse(StringUtil.isEmpty("no esta vacía"));
    }
    @Test
    public void string_is_null_is_empty() {
        assertTrue(StringUtil.isEmpty(null));
    }
    @Test
    public void string_is_empty() {
        assertTrue(StringUtil.isEmpty(""));
    }
}