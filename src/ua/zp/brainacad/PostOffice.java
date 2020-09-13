package ua.zp.brainacad;

public class PostOffice {
    private int postOfficeNumber;
    private String senderData;
    private String senderAddress;
    private String recipientData;
    private String recipientAddress;
    private int parcelNumber;
    private int packageFormat;
    private int parcelStatus = 0;

    public static final int PACKAGE_FORMAT_LETTER = 0;
    public static final int PACKAGE_FORMAT_SMALL = 1;
    public static final int PACKAGE_FORMAT_BIG = 3;

    public static final int PARCEL_ACCEPTED = 1;
    public static final int PARCEL_PACKED_AND_SENT = 2;

    public int getPostOfficeNumber() {
        return postOfficeNumber;
    }

    public void setPostOfficeNumber(int postOfficeNumber) {
        this.postOfficeNumber = postOfficeNumber;
    }

    public String getSenderData() {
        return senderData;
    }

    public void setSenderData(String senderData) {
        this.senderData = senderData;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getRecipientData() {
        return recipientData;
    }

    public void setRecipientData(String recipientData) {
        this.recipientData = recipientData;
    }

    public String getRecipientAddress() {
        return recipientAddress;
    }

    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress;
    }

    public int getParcelNumber() {
        return parcelNumber;
    }

    public void setParcelNumber(int parcelNumber) {
        this.parcelNumber = parcelNumber;
    }

    public int getPackageFormat() {
        return packageFormat;
    }

    public void setPackageFormat(int packageFormat) {
        this.packageFormat = packageFormat;
    }

    public void setParcelAccepted() {
        parcelStatus = PostOffice.PARCEL_ACCEPTED;
    }

    public void setParcelPackedAndSent() {
        parcelStatus = PostOffice.PARCEL_PACKED_AND_SENT;
    }

    public void parcelStatusInfo() {
        switch (parcelStatus) {
            case PostOffice.PARCEL_ACCEPTED:
                System.out.println("The parcel is accepted.");
                break;
            case PostOffice.PARCEL_PACKED_AND_SENT:
                System.out.println("The parcel is packed and send.");
                break;
            default:
                System.out.println("The status of the parcel is not defined.");
        }
    }

    public static double volumeWeight(double length, double width, double height, double density) {
        return length * width * height * density;

    }
}
