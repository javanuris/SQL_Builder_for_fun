/**
 * Created by User on 12.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        String stringBuilder = Sql.create().select().all().from().vl("book").where().vl("id_author").eq().vl("1").build();
        System.out.println(stringBuilder);
    }
}
