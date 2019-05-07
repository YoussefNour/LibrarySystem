package oodproject;

public class bookcopy {

    //protected  String parentID;
    protected String name;
    protected String ID;
    protected String status;

    /**
     *
     * @param name name of book copy
     * @param ID id of book
     * @param status availability status of book
     */
    public bookcopy(String name, String ID) {
        this.name = name;
        this.ID = ID;
        this.status = "available";
    }

    /**
     *
     * @param i enter 1 for available enter 0 for unavailable
     */
    public void setstatus(int i) {
        switch (i) {
            case 1: {
                status = "available";
                break;
            }
            case 0: {
                status = "unavailable";
                break;
            }
        }
    }

}
