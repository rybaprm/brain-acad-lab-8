package ua.zp.brainacad;

public class Farm {
    private int fieldNumber;
    private int typeOfGrain;
    private int fieldStatus;

    public static final int GRAIN_WHEAT = 0;
    public static final int GRAIN_CORN = 1;
    public static final int GRAIN_SUNFLOWER = 2;
    public static final int FIELD_IS_SOWN = 1;
    public static final int FIELD_COLLECTED = 2;

    public int getFieldNumber() {
        return fieldNumber;
    }

    public void setFieldNumber(int fieldNumber) {
        this.fieldNumber = fieldNumber;
    }

    public int getTypeOfGrain() {
        return typeOfGrain;
    }

    public void setTypeOfGrain(int typeOfGrain) {
        this.typeOfGrain = typeOfGrain;
    }

    public void setFieldIsSown() {
        fieldStatus = Farm.FIELD_IS_SOWN;
    }

    public void setFieldCollected() {
        fieldStatus = Farm.FIELD_COLLECTED;
    }

    public void fieldStatusInfo() {
        switch (fieldStatus) {
            case Farm.FIELD_IS_SOWN:
                System.out.println("The field is sown.");
                break;
            case Farm.FIELD_COLLECTED:
                System.out.println("The field is collected.");
                break;
            default:
                System.out.println("The status of the field is not defined.");
        }
    }
}
