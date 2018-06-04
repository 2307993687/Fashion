package com.accp.dao;

import com.accp.entity.Commodity;
import com.accp.entity.ThirdType;
import com.sun.org.glassfish.external.probe.provider.annotations.ProbeParam;
import org.springframework.web.bind.annotation.RequestParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommodityDao {
    /*
     * 分类查询
     * */
    public List<Commodity> findType(Commodity commodity);

    /**
     * 查询单个商品
     *
     * @param id
     * @return
     */
    public Commodity findId(@ProbeParam("id") Integer id);

    /*
     * 添加点击量
     * */
    public void UpdateHits(Commodity commodity);

    /*
     * 按热度与二级类型查询
     * */
    public List<Commodity> selectCommodityList(Integer[] thirdTypeArry);

    /*
     * 按用户IP查询
     * */
    public List<Commodity> selectCommodityListByIP(Integer[] IDArray);

    public List<Commodity> commodityList(@Param("type") Integer type,@Param("pageNo") Integer pageNo);

    public Integer commodityCount(@Param("type") Integer type);

}