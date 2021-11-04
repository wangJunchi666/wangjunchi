package cn.gson.wangjunchi.controller;


import cn.gson.wangjunchi.model.posos.Relation;
import cn.gson.wangjunchi.model.posos.Rhospital;
import cn.gson.wangjunchi.model.service.RhospitalService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("wjc")
public class RhospitalControllere {


    @Autowired
    RhospitalService rhospitalService;

    @RequestMapping("addRhospital")
    public int addRhospital(@RequestBody Map<String,Object> date){

        String json2 = JSONObject.toJSONString(date.get("rhospital"));
        Rhospital rhospital1 = JSONObject.parseObject(json2,Rhospital.class);
        Timestamp time2= new Timestamp(new Date().getTime());
        rhospital1.setRysj(time2);
        return rhospitalService.addRhospital(rhospital1);
    };

    //查询入院
    @RequestMapping("aeleRhospital")
    public List<Rhospital> aeleRhospital(String name){
        return rhospitalService.aeleRhospital(name);
    };

    //查询关系
    @RequestMapping("seleRelation")
    public List<Relation> seleRelation(){
        return  rhospitalService.seleRelation();
    }
}
