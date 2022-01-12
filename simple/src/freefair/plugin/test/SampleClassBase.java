package freefair.plugin.test;

import freefair.plugin.test.annotation.SampleAnnotation;

public class SampleClassBase {

    @SampleAnnotation(component = "Base")
    public void methodA() {
        System.out.println("base: methodA");
    }

    @SampleAnnotation(component = "Base")
    public void methodB() {
        System.out.println("base: methodB");
    }

    public void methodC() {
        System.out.println("base: methodC");
    }
}
