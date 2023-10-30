class stuff<T>{
    private  T _thing;

    public stuff(){}
    public stuff(T t){_thing = t;}

    public void setThing(T t){_thing = t;}
    public T getThing(){return _thing;}
    public <S> S convertThing(){
        if (_thing instanceof Integer)
            return (S)String.valueOf((Integer)_thing);
        else if (_thing instanceof String)
            return (S)Integer.valueOf((String)_thing);
        else
            return (S)_thing;
    }
}

public class Main {
    public static void main(String[] args) {
        stuff<String> s1 = new stuff<String>();
        s1.setThing("Word");
        System.out.println(s1.getThing());
        stuff<Integer> s2 = new stuff<Integer>();
        s2.setThing(34);
        System.out.println(s2.getThing());
        //Implementing Student Class
        //stuff<Student> s3 = new stuff<Student>();
        //s3.setThing(new Student());
        //System.out.println(s3.getThing());
        //s3.getThing().setID("100");
    }
}