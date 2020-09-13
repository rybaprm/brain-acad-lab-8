package ua.zp.brainacad;

public class Main {

    public static void main(String[] args) {
//        Необходимо доработать созданные в ЛР7 (7. Обзор класса Java (Практика)) классы,
//            дополнить их методами. Методы должны касаться специфики работы с объектом.
//            Примеры методов:
//    Для класса «Книга»: метод, который перелистывает на определенную страницу; метод,
//            который возвращает список глав; метод, определяющий главу для указанной страницы.
//        Для класса «Отделение почты»: метод приема списка посылок; метод, упаковки и
//        отправки списка посылок;
//        Для класса «Клиент магазина»: метод добавления товара в корзину; метод, просмотра
//        накопленных бонусов; метод покупки товаров.
//                Для своего варианта – свои методы.
//        1.1 Дополнить классы нужными методами, для эмуляции действий просто выводить
//        описание действия на экран.
//        1.2 Вызвать методы в тестовом классе (Main)


        Book book1 = new Book();
        book1.setAuthor("Mr. First");
        book1.setTitle("First book");
        book1.setSize(111);
        book1.setChapter(10);
        book1.setFormat(Book.FORMAT_PDF);
        book1.setLanguage(Book.LANGUAGE_RU);
        book1.setCurrentPage(1);
        System.out.println("Class name: " + book1.getClass());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Size: " + book1.getSize());
        System.out.println("Chapter: " + book1.getChapter());
        System.out.println("Format: " + book1.getFormat());
        System.out.println("Language: " + book1.getLanguage());
        System.out.println("Current Page: " + book1.getCurrentPage());

        //test methods of object of Book class
        book1.goToPage(110);
        book1.goToPage(111);
        book1.goToPage(112);
        book1.listOfChapter();
        book1.whatChapterForPage(10);
        book1.whatChapterForPage(11);
        book1.whatChapterForPage(12);
        book1.whatChapterForPage(111);
        book1.whatChapterForPage(112);


        PostOffice postOffice1 = new PostOffice();
        postOffice1.setPostOfficeNumber(1);
        postOffice1.setParcelNumber(1);
        postOffice1.setPackageFormat(PostOffice.PACKAGE_FORMAT_LETTER);
        postOffice1.setSenderData("Mr. Sender");
        postOffice1.setSenderAddress("Zaporozhue");
        postOffice1.setRecipientData("Mr. Recipient");
        postOffice1.setRecipientAddress("Kiev");
        System.out.println("\nClass name: " + postOffice1.getClass());
        System.out.println("Post office number: " + postOffice1.getPostOfficeNumber());
        System.out.println("Parcel number: " + postOffice1.getParcelNumber());
        System.out.println("Package format: " + postOffice1.getPackageFormat());
        System.out.println("Sender data: " + postOffice1.getSenderData());
        System.out.println("Sender address: " + postOffice1.getSenderAddress());
        System.out.println("Recipient data: " + postOffice1.getRecipientData());
        System.out.println("Recipient address: " + postOffice1.getRecipientAddress());
        //test methods of object of PostOffice class
        postOffice1.parcelStatusInfo();
        postOffice1.setParcelAccepted();
        postOffice1.parcelStatusInfo();
        postOffice1.setParcelPackedAndSent();
        postOffice1.parcelStatusInfo();

        StoreClient client1 = new StoreClient();
        client1.setClientData("Mr. First Client");
        client1.setBonusAccount(3);
        client1.setProductName(StoreClient.PRODUCT_MILK);
        System.out.println("\nClass name: " + client1.getClass());
        System.out.println("Client Data: " + client1.getClientData());
        System.out.println("Bonus Account: " + client1.getBonusAccount());
        System.out.println("Product Name: " + client1.getProductName());
        //test methods of object of StoreClient class
        client1.productStatusInfo();
        client1.setItemInCart();
        client1.productStatusInfo();
        client1.bonusAccountInfo();
        client1.setItemPurchased();
        client1.productStatusInfo();
        client1.bonusAccountInfo();

        Farm farm1 = new Farm();
        farm1.setFieldNumber(4);
        farm1.setTypeOfGrain(Farm.GRAIN_WHEAT);
        System.out.println("\nClass name: " + farm1.getClass());
        System.out.println("Field Number: " + farm1.getFieldNumber());
        System.out.println("Type Of Grain: " + farm1.getTypeOfGrain());
        //test methods of object of Farm class
        farm1.fieldStatusInfo();
        farm1.setFieldIsSown();
        farm1.fieldStatusInfo();
        farm1.setFieldCollected();
        farm1.fieldStatusInfo();

//        1.3 Перегрузить метод водном из классов. Например, метод, который перелистывает на
//        определенную страницу перегрузить методом, который перелистывает на
//        определенную главу.
        book1.goToPage(10,1);
        book1.goToPage(10,2);
        book1.goToPage(10,3);
        book1.goToPage(10,4);
        book1.goToPage(10,10);
        book1.goToPage(10,11);
        book1.goToPage(10,12);
        book1.goToPage(10,13);


//        1.4 Создать статический метод в любом из классов. Например, создать статический метод
//        в классе «Отделение почты», который будет рассчитывать объемный вес посылки, в
//        зависимости от переданных параметров.
        System.out.println("\nVolume weight is: "+ PostOffice.volumeWeight(1,2,3,2.2));
        System.out.println("\nVolume weight is: "+ PostOffice.volumeWeight(2,3,3.5,4.5));
        System.out.println("\nVolume weight is: "+ PostOffice.volumeWeight(1.1,2.2,3.3,0.6));

    }
}
