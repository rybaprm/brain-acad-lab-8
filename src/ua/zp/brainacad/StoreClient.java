package ua.zp.brainacad;

public class StoreClient {
    private String clientData;
    private int bonusAccount;
    private int productName;
    private int productStatus;

    public static final int PRODUCT_MILK = 0;
    public static final int PRODUCT_BREAD = 1;
    public static final int PRODUCT_MEAT = 2;

    public static final int ITEM_IN_CART = 1;
    public static final int ITEM_PURCHASED = 2;

    public String getClientData() {
        return clientData;
    }

    public void setClientData(String clientData) {
        this.clientData = clientData;
    }

    public int getBonusAccount() {
        return bonusAccount;
    }

    public void setBonusAccount(int bonusAccount) {
        this.bonusAccount = bonusAccount;
    }

    public int getProductName() {
        return productName;
    }

    public void setProductName(int productName) {
        this.productName = productName;
    }

    public void setItemInCart() {
        productStatus = StoreClient.ITEM_IN_CART;
    }

    public void setItemPurchased() {
        productStatus = StoreClient.ITEM_PURCHASED;
        bonusAccount += 1;
    }

    public void productStatusInfo() {
        switch (productStatus) {
            case StoreClient.ITEM_IN_CART:
                System.out.println("The product is in a cart.");
                break;
            case StoreClient.ITEM_PURCHASED:
                System.out.println("The product is purchased.");
                break;
            default:
                System.out.println("The status of the product is not defined.");
        }
    }

    public void bonusAccountInfo() {
        System.out.println("Bonus account value is: " + bonusAccount);
    }
}
