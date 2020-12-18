package method;
/*
    Author Arya Dwi Putra (STMIK Eresha)
*/

public class entitas {
    private static String username;
    private static String level;
    public String subTotal;

    public static String getUsername(){
        return username;
    }
    public static void setUsername(String username){
        entitas.username = username;
    }
    
    public static String getLevel(){
        return level;
    }
    
    public static void setLevel(String level){
        entitas.level = level;
    }
    
    public String getSubTotal() {
        return subTotal;
    }
            
    public void setSubTotal(String total) {
        this.subTotal = subTotal;
    }
}
