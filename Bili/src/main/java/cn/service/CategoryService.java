package cn.service;

import cn.domain.Category;
import cn.domain.ServerResponse;

import java.util.List;

public interface CategoryService {

    /**
     * 查询所有分类信息
     */
    public ServerResponse<List<Category>> selectAll();

    /**
     * 新增一条分类信息
     * @param category
     */
    public ServerResponse add(Category category);

    /**
     * 删除一条分类信息
     * @param category
     */
    public ServerResponse delete(Category category);

    /**
     * 编辑一条分类信息
     * @param category
     */
    public ServerResponse update(Category category);
}
