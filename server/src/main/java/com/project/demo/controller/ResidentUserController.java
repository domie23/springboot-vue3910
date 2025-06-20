package com.project.demo.controller;

import com.project.demo.entity.ResidentUser;
import com.project.demo.service.ResidentUserService;
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
 *居民用户：(ResidentUser)表控制层
 *
 */
@RestController
@RequestMapping("/resident_user")
public class ResidentUserController extends BaseController<ResidentUser,ResidentUserService> {

    /**
     *居民用户对象
     */
    @Autowired
    public ResidentUserController(ResidentUserService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        Map<String, String> mapcommunity_name = new HashMap<>();
        mapcommunity_name.put("community_name",String.valueOf(paramMap.get("community_name")));
        List listcommunity_name = service.select(mapcommunity_name, new HashMap<>()).getResultList();
        if (listcommunity_name.size()>0){
            return error(30000, "字段小区名称内容不能重复");
        }
        this.addMap(paramMap);
        return success(1);
    }

}
