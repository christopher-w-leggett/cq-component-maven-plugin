package com.citytechinc.cq.component.annotations.config;

import com.citytechinc.cq.component.editconfig.maker.InPlaceEditorMaker;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface InPlaceEditor {

    Class<? extends Annotation> annotationClass();

    Class<? extends InPlaceEditorMaker> makerClass();

    String editorType();

}
