package cn.service.impl;

import cn.dao.AnchorDao;
import cn.domain.Anchor;
import cn.domain.ServerResponse;
import cn.service.AnchorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnchorServiceImpl implements AnchorService {

    @Autowired
    AnchorDao anchorDao;

    @Override
    public ServerResponse<List<Anchor>> selectAll() {
        List<Anchor> anchors = anchorDao.selectAll();
        if (anchors.size()>0){
            return ServerResponse.createBySuccess("查询成功",anchors,anchors.size());
        }else {
            return ServerResponse.createByError("查询结果为空");
        }
    }

    @Override
    public ServerResponse<Anchor> selectOne(Anchor anchor) {
        Anchor selectOne = anchorDao.selectOne(anchor);
        if (selectOne!=null){
            return ServerResponse.createBySuccess("查询成功",selectOne,1);
        }else {
            return ServerResponse.createByError("查询结果为空");
        }
    }

    @Override
    public ServerResponse delete(Anchor anchor) {
        try {
            anchorDao.delete(anchor);
            return ServerResponse.createBySuccess("操作成功",null);
        }catch (Exception e){
            return ServerResponse.createByError("操作失败");
        }
    }

    @Override
    public ServerResponse add(Anchor anchor) {
        try {
            anchorDao.add(anchor);
            return ServerResponse.createBySuccess("操作成功",null);
        }catch (Exception e){
            return ServerResponse.createByError("操作失败");
        }
    }

    @Override
    public ServerResponse update(Anchor anchor) {
        try {
            anchorDao.update(anchor);
            return ServerResponse.createBySuccess("操作成功",null);
        }catch (Exception e){
            return ServerResponse.createByError("操作失败");
        }
    }
}
