package com.project.demo.controller;

import com.project.demo.entity.IsolationApplication;
import com.project.demo.service.IsolationApplicationService;
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
 *隔离申请：(IsolationApplication)表控制层
 *
 */
@RestController
@RequestMapping("/isolation_application")
public class IsolationApplicationController extends BaseController<IsolationApplication,IsolationApplicationService> {

    /**
     *隔离申请对象
     */
    @Autowired
    public IsolationApplicationController(IsolationApplicationService service) {
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
