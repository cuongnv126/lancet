package me.ele.lancet.plugin.internal.preprocess;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.Opcodes;

import me.ele.lancet.weaver.internal.util.AsmUtil;

/**
 * Created by gengwanpeng on 17/4/27.
 */
public class AsmClassProcessorImpl implements PreClassProcessor {

    @Override
    public PreClassProcessor.ProcessResult process(byte[] classBytes) {
        ClassReader cr = new ClassReader(classBytes);
        PreProcessClassVisitor cv = new PreProcessClassVisitor(AsmUtil.ASM_VERSION);
        cr.accept(cv, ClassReader.SKIP_CODE | ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);
        return cv.getProcessResult();
    }
}
