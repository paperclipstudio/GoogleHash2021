public class Street {
    int start, end;
    String name;
    int time;

    public Street(int start, int end, String name, int time){
        this.start = start;
        this.end = end;
        this.name = name;
        this.time = time;
    }

    @Override
    public String toString(){
        return  "" + start + " " + end + " " + name + " " + time;
    }
}
