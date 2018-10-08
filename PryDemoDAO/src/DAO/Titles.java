/*Entidad # 1*/
package DAO;

public class Titles {

    private String isbn;
    private String title;
    private int edition;
    private String copyright;
    private int pubID;
    private String file;
    private double price;

    public Titles(String isbn, String title, int edition, String copyright, int pubID, String file, double price) {
        this.isbn = isbn;
        this.title = title;
        this.edition = edition;
        this.copyright = copyright;
        this.pubID = pubID;
        this.file = file;
        this.price = price;
    }

    public Titles() {
    }

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the edition
     */
    public int getEdition() {
        return edition;
    }

    /**
     * @param edition the edition to set
     */
    public void setEdition(int edition) {
        this.edition = edition;
    }

    /**
     * @return the copyright
     */
    public String getCopyright() {
        return copyright;
    }

    /**
     * @param copyright the copyright to set
     */
    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    /**
     * @return the pubID
     */
    public int getPubID() {
        return pubID;
    }

    /**
     * @param pubID the pubID to set
     */
    public void setPubID(int pubID) {
        this.pubID = pubID;
    }

    /**
     * @return the file
     */
    public String getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(String file) {
        this.file = file;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Titles{" + "isbn=" + isbn + ", title=" + title + ", edition=" + edition + ", copyright=" + copyright + ", pubID=" + pubID + ", file=" + file + ", price=" + price + '}';
    }

    
} //Class Titles
