package HashTable;

public class SimpleHashTable {

    private Firm[] firm;

    public SimpleHashTable (){
        firm = new Firm[10];
    }

    public void put (String key, Firm firm){
        int hashedKey = hashKey(key);
        if (this.firm[hashedKey] != null){
            System.out.println("This key has been picked. No operation was carried out");
        }else {
            this.firm[hashedKey] = firm;
        }
    }

    public Firm get (String key){
        int hashedKey = hashKey(key);
        return this.firm[hashedKey];
    }

    private int hashKey(String key) {
        return key.length() % firm.length;
    }

    @Override
    public String toString (){
        String result = "";
        for (Firm f : firm){
            result += f.toString() + "\n";
        }
        return result;
    }

}
