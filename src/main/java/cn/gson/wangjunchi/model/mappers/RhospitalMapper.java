package cn.gson.wangjunchi.model.mappers;

import cn.gson.wangjunchi.model.posos.Relation;
import cn.gson.wangjunchi.model.posos.Rhospital;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RhospitalMapper {

    public int addRhospital(Rhospital rhospital);

    //查询入院登记
    public List<Rhospital>aeleRhospital(@Param("name") String name);

    //查询关系
    public List<Relation> seleRelation();

}
