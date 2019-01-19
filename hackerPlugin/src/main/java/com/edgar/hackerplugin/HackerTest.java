package com.edgar.hackerplugin;


//import jdk.internal.org.objectweb.asm.Opcodes;
import org.objectweb.asm.ClassReader;
//import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
//import org.objectweb.asm.MethodVisitor;

import java.io.IOException;

import static org.objectweb.asm.Opcodes.ACC_PUBLIC;
import static org.objectweb.asm.Opcodes.ACC_STATIC;

public class HackerTest {

    public static void main(String... array) {
        try {
            ClassReader classReader = new ClassReader(HackerTest.class.getName());
            ClassWriter classWriter = new ClassWriter(classReader,ClassWriter.COMPUTE_MAXS);
//            ClassVisitor classVisitor = new MethodVisitor();
//            classReader.accept(classVisitor, Opcodes.ASM4);
//            classVisitor.visitMethod(ACC_PUBLIC + ACC_STATIC,"add","([Ljava/lang/String;)V",null,null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class MethodVisitor extends ClassVisitor {

        public MethodVisitor(int api) {
            super(api);
        }
    }
}
