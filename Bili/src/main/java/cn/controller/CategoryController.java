package cn.controller;

import cn.domain.Category;
import cn.domain.ServerResponse;
import cn.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/category")
@CrossOrigin(origins = "*",maxAge = 3600)
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    /**
     * 查询所有分类信息
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse selectAll(){
        return categoryService.selectAll();
    };

    /**
     * 新增分类信息
     * @param category
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse add(Category category){
        System.out.println(category);
        return categoryService.add(category);
    }

    /**
     * 根据Id删除对应分类
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public ServerResponse delete(@PathVariable("id") Integer id){
        return categoryService.delete(new Category(id));
    }

    /**
     * 根据ID更改分类信息
     * @param category
     * @return
     */
    @RequestMapping(method = RequestMethod.PUT)
    @ResponseBody
    public ServerResponse update(Category category){
        System.out.println(category);
        return categoryService.update(category);
    }


}
