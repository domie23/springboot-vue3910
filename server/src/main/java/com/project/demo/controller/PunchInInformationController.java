package com.project.demo.controller;

import com.project.demo.entity.PunchInInformation;
import com.project.demo.service.PunchInInformationService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *打卡信息：(PunchInInformation)表控制层
 *
 */
@RestController
@RequestMapping("/punch_in_information")
public class PunchInInformationController extends BaseController<PunchInInformation,PunchInInformationService> {

    /**
     *打卡信息对象
     */
    @Autowired
    public PunchInInformationController(PunchInInformationService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
