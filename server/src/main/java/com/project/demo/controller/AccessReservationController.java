package com.project.demo.controller;

import com.project.demo.entity.AccessReservation;
import com.project.demo.service.AccessReservationService;
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
 *出入预约：(AccessReservation)表控制层
 *
 */
@RestController
@RequestMapping("/access_reservation")
public class AccessReservationController extends BaseController<AccessReservation,AccessReservationService> {

    /**
     *出入预约对象
     */
    @Autowired
    public AccessReservationController(AccessReservationService service) {
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
