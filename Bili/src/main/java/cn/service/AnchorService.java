package cn.service;

import cn.domain.Anchor;
import cn.domain.ServerResponse;

import java.util.List;

public interface AnchorService {

    /**
     * 查询所有直播间信息
     * @return
     */
    public ServerResponse<List<Anchor>> selectAll();

    /**
     * 根据ID查询对应的直播间信息
     * @param anchor
     * @return
     */
    public ServerResponse<Anchor> selectOne(Anchor anchor);

    /**
     * 根据ID删除对应的直播间信息
     * @param anchor
     * @return
     */
    public ServerResponse delete(Anchor anchor);

    /**
     * 新增一条直播间信息
     * @param anchor
     * @return
     */
    public ServerResponse add(Anchor anchor);

    /**
     * 根据ID更新对应的直播间信息
     * @param anchor
     * @return
     */
    public ServerResponse update(Anchor anchor);
}
