package cn.controller;

import cn.domain.Anchor;
import cn.domain.ServerResponse;
import cn.service.AnchorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@Controller
@RequestMapping("/anchor")
@CrossOrigin(origins = "*",maxAge = 3600)
public class AnchorController {

    @Autowired
    AnchorService anchorService;

    /**
     * 查询全部直播间信息
     * @return
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public ServerResponse selectAll(){
        return anchorService.selectAll();
    }

    /**
     * 根据ID查询对应的直播间信息
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ServerResponse selectOne(@PathVariable("id") Integer id){
        Anchor anchor = new Anchor();
        anchor.setId(id);
        return anchorService.selectOne(anchor);
    }

    /**
     * 根据ID删除对应的直播间信息
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ServerResponse delete(@PathVariable("id") Integer id){
        Anchor anchor = new Anchor();
        anchor.setId(id);
        return anchorService.delete(anchor);
    }

    /**
     * 新增直播间信息
     * @param anchor
     * @return
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    @CrossOrigin(origins = "*",maxAge = 3600)
    public ServerResponse add(Anchor anchor){
        //随机产生直播间ID
        int uid = new Random().nextInt(1000000000);
        System.out.println(uid);
        anchor.setUid(uid);
        anchor.setAddress("https://live.bilibili.com/"+uid);
        return anchorService.add(anchor);
    }

    /**
     * 更新直播间信息
     * @param anchor
     * @return
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.PUT)
    @CrossOrigin(origins = "*",maxAge = 3600)
    public ServerResponse update(Anchor anchor){
        return anchorService.update(anchor);
    }

}
