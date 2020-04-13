package vn.de.example.parkingregistration.controller.dto;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.PropertyUtils;

public interface DTO {

    public default void copyProperties(Object dest, Object src) {
        try {
            PropertyUtils.copyProperties(dest, src);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
