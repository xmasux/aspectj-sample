package freefair.plugin.test;

import freefair.plugin.test.annotation.SampleAnnotation;

public class SampleClassChild extends SampleClassBase {

    @Override
    public void methodA(){
        System.out.println("child: methodA");
    }

    @Override
    @SampleAnnotation(component = "Child")
    public void methodB() {
        super.methodB();
        System.out.println("child: methodB");
    }

    public static void main(String[] args) {
        SampleClassChild sampleClassChild = new SampleClassChild();
        sampleClassChild.methodA();
        sampleClassChild.methodB();
        sampleClassChild.methodC();
    }
}
