package freefair.plugin.test.aspectj;

import freefair.plugin.test.annotation.SampleAnnotation;
import freefair.plugin.test.events.BaseEvent;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@Aspect
public class SampleAspect {

    @Around(value = "@annotation(sampleAnnotation)", argNames = "proceedingJoinPoint,sampleAnnotation")
    public Object around(ProceedingJoinPoint proceedingJoinPoint, SampleAnnotation sampleAnnotation) throws Throwable {
        System.out.println("Aspect");
        BaseEvent event = new BaseEvent();
        event.methodName = proceedingJoinPoint.getSignature().getName();
        event.fullyQualifiedClassName = proceedingJoinPoint.getSignature().getDeclaringTypeName();
        event.methodOffset = proceedingJoinPoint.getSourceLocation().getLine();
        event.component = sampleAnnotation.component();
        event.begin();
        Object result = proceedingJoinPoint.proceed();
        event.commit();
        return result;
    }
}
