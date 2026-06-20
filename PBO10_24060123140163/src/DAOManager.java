/*
    File        : DAOManager.java
    Deskripsi   : La manager
    Nama/NIM    : Nasywa Alya Kamila / 24060123140163
    Tanggal     : 12 Mei 2026
*/

public class DAOManager {
    /* Atribut */
    private PersonDAO personDAO;

    /* Method */
    public void setPersonDAO(PersonDAO person) {
        this.personDAO = person;
    }

    public PersonDAO getPersonDAO() {
        return this.personDAO;
    }
}