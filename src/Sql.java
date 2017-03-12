/**
 * Created by User on 12.03.2017.
 */
public class Sql {

    private final StringBuilder stringBuilder = new StringBuilder();

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }

    public void setStringBuilder(String str) {
        this.stringBuilder.append(str);
    }

    private Sql() {

    }

    public static Builder create() {
        return new Sql().new Builder();
    }

    public class Builder {

        private Builder() {

        }

        public Builder select(){
            Sql.this.setStringBuilder("select ");
            return this;
        }
        public Builder from(){
            Sql.this.setStringBuilder("from ");
            return this;
        }
        public Builder all(){
            Sql.this.setStringBuilder("*");
            return this;
        }
        public Builder where(){
            Sql.this.setStringBuilder("where ");
            return this;
        }
        public Builder eq(){
            Sql.this.setStringBuilder(" = ");
            return this;
        }
        public Builder vl(String s){
            Sql.this.setStringBuilder(s+" ");
            return this;
        }

        public String build() {
            return Sql.this.getStringBuilder().toString();
        }

    }

}