package cn.gson.wangjunchi.model.service;

import cn.gson.wangjunchi.model.mappers.RhospitalMapper;
import cn.gson.wangjunchi.model.posos.Relation;
import cn.gson.wangjunchi.model.posos.Rhospital;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class RhospitalService {

    @Autowired
    RhospitalMapper rhospitalMapper;

    public int addRhospital(Rhospital rhospital){

        return rhospitalMapper.addRhospital(rhospital);
    };

    //查询入院登记
    public List<Rhospital> aeleRhospital(String name){
        return rhospitalMapper.aeleRhospital(name);
    };

    //查询关系
    public List<Relation> seleRelation(){
        return  rhospitalMapper.seleRelation();
    }

}
