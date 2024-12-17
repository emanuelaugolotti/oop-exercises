package com.oopexercises1.oopexercises.exceptions;

import com.oopexercises.exceptions.CheckLicencePlate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CheckLicencePlateTest {

    @Test
    void checkLicencePlate() {
        assertDoesNotThrow(() -> CheckLicencePlate.checkLicencePlate("AA958LV"));
        assertThrows(IllegalArgumentException.class, () -> CheckLicencePlate.checkLicencePlate("BO95889"));
        assertThrows(IllegalArgumentException.class, () -> CheckLicencePlate.checkLicencePlate("1295889"));
        assertThrows(IllegalArgumentException.class, () -> CheckLicencePlate.checkLicencePlate("AA958L"));
        assertThrows(IllegalArgumentException.class, () -> CheckLicencePlate.checkLicencePlate("AA958LVA"));
    }
}
