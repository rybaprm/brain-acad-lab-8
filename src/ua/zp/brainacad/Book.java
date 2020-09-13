package ua.zp.brainacad;

public class Book {
    private String title;
    private String author;
    private int size;
    private int chapter;
    private int format;
    private int language;
    private int currentPage;

    public static final int FORMAT_PDF = 0;
    public static final int FORMAT_TXT = 1;
    public static final int FORMAT_DOC = 3;

    public static final int LANGUAGE_RU = 0;
    public static final int LANGUAGE_EN = 1;
    public static final int LANGUAGE_UA = 2;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getChapter() {
        return chapter;
    }

    public void setChapter(int chapter) {
        this.chapter = chapter;
    }

    public int getFormat() {
        return format;
    }

    public void setFormat(int format) {
        this.format = format;
    }

    public int getLanguage() {
        return language;
    }

    public void setLanguage(int language) {
        this.language = language;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public void goToPage(int page) {
        currentPage = page <= size ? page : currentPage;
        System.out.println(page <= size ? "\nBook open on the page number - " + currentPage : "\nYou set wrong page number.");
    }

    public void goToPage(int chapter, int page) {
        int pageOfChapter = (chapter-1) * size / this.chapter + page;
        goToPage(pageOfChapter);
        whatChapterForPage(pageOfChapter);
    }


    public void listOfChapter() {
        String listOfChapter = "";
        for (int i = 0; i < chapter; i++) {
            listOfChapter += "\nChapter " + (i + 1);
        }
        System.out.println(listOfChapter);
    }

    public void whatChapterForPage(int page) {
        for (int i = 0; i < chapter; i++) {
            if (page > (i * size / chapter) & page <= ((i + 1) * size / chapter)) {
                System.out.println("This page in chapter - " + (i + 1));
            }
        }
        if (page > this.size) {
            System.out.println("You set wrong page number. The book is over.");
        }
    }
}
