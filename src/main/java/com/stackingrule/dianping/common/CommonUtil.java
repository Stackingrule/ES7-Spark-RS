package com.stackingrule.dianping.common;


import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

/*
 * Created by Stackingrule on 2019/12/29
 */
public class CommonUtil {
    public static String processErrorString(BindingResult bindingResult) {
        if (!bindingResult.hasErrors()) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (FieldError fieldError : bindingResult.getFieldErrors()) {
            stringBuilder.append(fieldError.getField());
        }

        return stringBuilder.substring(0, stringBuilder.length() - 1);
    }
}
