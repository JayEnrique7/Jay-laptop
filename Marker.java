/**
 * Created by JuanFernandez on 2016-02-19.
 */
public enum Marker {

    X("X"),
    O("O"),
    EMPTY(" ");

    public final char input;
    Marker(String input){
        this.input = input.charAt(0);
    }

    public char getInput(){
        return this.input;
    }


}
