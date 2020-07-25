import java.util.LinkedList;
import java.util.List;

public class PhoneBook {
    //тут и ниже LinkedList использую потому, что не нужен доступ по индексу
    private List<PhoneBookRecord> phoneBook = new LinkedList<>();

    public void add(String surname, String phone){
        phoneBook.add(new PhoneBookRecord(surname, phone));
    }

    public List<PhoneBookRecord> get(String surname){
        System.out.printf("Поиск по фамилии:%s\n",surname);
        List<PhoneBookRecord> ret = new LinkedList<>();
        for(PhoneBookRecord record : phoneBook){
            if (record.getSurname().equals(surname)){
                ret.add(record);
            }
        }
        return ret;
    }

    public void printAll(){
        print(phoneBook);
    }

    public static void print(List<PhoneBookRecord> list){
        System.out.println("Содержимое:");
        for (PhoneBookRecord r : list ){
            System.out.println(r);
        }
    }


}
