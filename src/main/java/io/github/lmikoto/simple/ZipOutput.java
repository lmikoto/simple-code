package io.github.lmikoto.simple;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author liuyang
 * 2020-09-03 20:52
 */
@Component
public class ZipOutput extends AbstractOutput {
    @Override
    public ScalableType type() {
        return OutputType.ZIP;
    }
}
