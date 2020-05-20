package cn.service.impl;

import cn.dao.CategoryDao;
import cn.domain.Category;
import cn.domain.ServerResponse;
import cn.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryDao categoryDao;

    @Override
    public ServerResponse<List<Category>> selectAll() {
        List<Category> categories = categoryDao.selectAll();
        if (categories.size()>0){
            return ServerResponse.createBySuccess("查询成功",categories,categories.size());
        }else {
            return ServerResponse.createByError("查询结果为空");
        }
    }

    @Override
    public ServerResponse add(Category category) {
        try {
            categoryDao.add(category);
            return ServerResponse.createBySuccess("操作成功",null);
        }catch (Exception e){
            return ServerResponse.createByError("操作失败");
        }
    }

    @Override
    public ServerResponse delete(Category category) {
        try {
            categoryDao.delete(category);
            return ServerResponse.createBySuccess("操作成功",null);
        }catch (Exception e){
            return ServerResponse.createByError("操作失败");
        }
    }

    @Override
    public ServerResponse update(Category category) {
        try {
            categoryDao.update(category);
            return ServerResponse.createBySuccess("操作成功",null);
        }catch (Exception e){
            return ServerResponse.createByError("操作失败");
        }
    }
}
