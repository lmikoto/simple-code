package io.github.lmikoto.simple;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author liuyang
 * 2020-09-03 20:58
 */
@Getter
@AllArgsConstructor
public enum  OutputType implements ScalableType {
    ZIP("zip压缩包");

    private final String desc;
}
