package coreJava;

/**
 * Created by DD on 2017-11-10.
 */
public class example {
    int a;

    public static void main(String[] args) {

        label1: System.out.println("");
       // label2: { LabelTest t = new LabelTest(); }

        example e = new example();
        example f = e.label();
        System.out.println(f);
    }

    public example label(){
        return this;
    }
}
