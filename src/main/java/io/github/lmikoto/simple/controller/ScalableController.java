package io.github.lmikoto.simple.controller;

import io.github.lmikoto.simple.OutputType;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author liuyang
 * 2020-09-03 21:01
 * 获取可扩展对象的字典值
 */
@RestController
@RequestMapping("/api/v1/scalable")
@RequiredArgsConstructor
public class ScalableController {

    @GetMapping("/output")
    public List<OutputType> outputTypes(){
        return Arrays.asList(OutputType.values());
    }
}
