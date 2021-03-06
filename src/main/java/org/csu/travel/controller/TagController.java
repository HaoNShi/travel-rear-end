package org.csu.travel.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Tag;
import org.csu.travel.core.Result;
import org.csu.travel.core.ResultGenerator;
import org.csu.travel.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class TagController {

    @Autowired
    TagService tagService;

    @ApiOperation(value = "返回全部标签")
    @GetMapping("/allTags")
    public Result getAllTags() {
        List<Tag> tags = tagService.getAllTags();
        return ResultGenerator.success(tags);
    }

}
