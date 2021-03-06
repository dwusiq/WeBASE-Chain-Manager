package com.webank.webase.chain.mgr.repository.mapper;

import com.webank.webase.chain.mgr.repository.bean.TbFront;
import com.webank.webase.chain.mgr.repository.bean.TbFrontExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import java.util.List;
import java.util.Optional;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;

public interface TbFrontMapper {

    @Select({ "select * from tb_front where chain_id = #{chainId} and node_id = #{nodeId}" })
    TbFront getByChainIdAndNodeId(@Param("chainId") int chainId, @Param("nodeId") String nodeId);

    @Delete({ "delete from tb_front where chain_id=#{chainId}" })
    int deleteByChainId(@Param("chainId") int chainId);

    @Select({ "select ", TbFrontSqlProvider.ALL_COLUMN_FIELDS, " from tb_front where chain_id=#{chainId}" })
    List<TbFront> selectByChainId(@Param("chainId") int chainId);

    @Select({ "select ", TbFrontSqlProvider.ALL_COLUMN_FIELDS, " from tb_front where chain_id=#{chainId} and front_status=#{frontStatus}" })
    List<TbFront> selectByChainIdAndStatus(@Param("chainId") int chainId, @Param("frontStatus") int frontStatus);

    @Select({ "select ", TbFrontSqlProvider.ALL_COLUMN_FIELDS, " from tb_front where chain_id=#{chainId} and ext_agency_id=#{agencyId}" })
    List<TbFront> selectByChainIdAndAgencyId(@Param("chainId") int chainId, @Param("agencyId") int agencyId);

    @Update({ "update tb_front set `front_status`=#{frontStatus},modify_time=NOW() where front_id = #{frontId}" })
    int updateStatus(@Param("frontId") int frontId, @Param("frontStatus") int frontStatus);

    @Select({ "select ", TbFrontSqlProvider.ALL_COLUMN_FIELDS, " from tb_front where front_id=#{frontId}" })
    TbFront getById(@Param("frontId") int frontId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_front
     *
     * @mbg.generated
     */
    @SelectProvider(type = TbFrontSqlProvider.class, method = "countByExample")
    long countByExample(TbFrontExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_front
     *
     * @mbg.generated
     */
    @DeleteProvider(type = TbFrontSqlProvider.class, method = "deleteByExample")
    int deleteByExample(TbFrontExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_front
     *
     * @mbg.generated
     */
    @Delete({ "delete from tb_front", "where front_id = #{frontId,jdbcType=INTEGER}" })
    int deleteByPrimaryKey(Integer frontId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_front
     *
     * @mbg.generated
     */
    @Insert({ "insert into tb_front (chain_id, front_peer_name, ", "node_id, front_ip, ", "front_port, agency, ", "description, create_time, ", "modify_time, front_status, ", "version, container_name, ", "jsonrpc_port, p2p_port, ", "channel_port, chain_name, ", "ext_company_id, ext_agency_id, ", "ext_host_id, host_index, ", "ssh_user, ssh_port, ", "docker_port, root_on_host, ", "node_root_on_host)", "values (#{chainId,jdbcType=INTEGER}, #{frontPeerName,jdbcType=VARCHAR}, ", "#{nodeId,jdbcType=VARCHAR}, #{frontIp,jdbcType=VARCHAR}, ", "#{frontPort,jdbcType=INTEGER}, #{agency,jdbcType=VARCHAR}, ", "#{description,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ", "#{modifyTime,jdbcType=TIMESTAMP}, #{frontStatus,jdbcType=INTEGER}, ", "#{version,jdbcType=VARCHAR}, #{containerName,jdbcType=VARCHAR}, ", "#{jsonrpcPort,jdbcType=INTEGER}, #{p2pPort,jdbcType=INTEGER}, ", "#{channelPort,jdbcType=INTEGER}, #{chainName,jdbcType=VARCHAR}, ", "#{extCompanyId,jdbcType=INTEGER}, #{extAgencyId,jdbcType=INTEGER}, ", "#{extHostId,jdbcType=INTEGER}, #{hostIndex,jdbcType=INTEGER}, ", "#{sshUser,jdbcType=VARCHAR}, #{sshPort,jdbcType=INTEGER}, ", "#{dockerPort,jdbcType=INTEGER}, #{rootOnHost,jdbcType=VARCHAR}, ", "#{nodeRootOnHost,jdbcType=VARCHAR})" })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "frontId", before = false, resultType = Integer.class)
    int insert(TbFront record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_front
     *
     * @mbg.generated
     */
    @InsertProvider(type = TbFrontSqlProvider.class, method = "insertSelective")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "frontId", before = false, resultType = Integer.class)
    int insertSelective(TbFront record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_front
     *
     * @mbg.generated
     */
    @SelectProvider(type = TbFrontSqlProvider.class, method = "selectByExample")
    @Results({ @Result(column = "front_id", property = "frontId", jdbcType = JdbcType.INTEGER, id = true), @Result(column = "chain_id", property = "chainId", jdbcType = JdbcType.INTEGER), @Result(column = "front_peer_name", property = "frontPeerName", jdbcType = JdbcType.VARCHAR), @Result(column = "node_id", property = "nodeId", jdbcType = JdbcType.VARCHAR), @Result(column = "front_ip", property = "frontIp", jdbcType = JdbcType.VARCHAR), @Result(column = "front_port", property = "frontPort", jdbcType = JdbcType.INTEGER), @Result(column = "agency", property = "agency", jdbcType = JdbcType.VARCHAR), @Result(column = "description", property = "description", jdbcType = JdbcType.VARCHAR), @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP), @Result(column = "modify_time", property = "modifyTime", jdbcType = JdbcType.TIMESTAMP), @Result(column = "front_status", property = "frontStatus", jdbcType = JdbcType.INTEGER), @Result(column = "version", property = "version", jdbcType = JdbcType.VARCHAR), @Result(column = "container_name", property = "containerName", jdbcType = JdbcType.VARCHAR), @Result(column = "jsonrpc_port", property = "jsonrpcPort", jdbcType = JdbcType.INTEGER), @Result(column = "p2p_port", property = "p2pPort", jdbcType = JdbcType.INTEGER), @Result(column = "channel_port", property = "channelPort", jdbcType = JdbcType.INTEGER), @Result(column = "chain_name", property = "chainName", jdbcType = JdbcType.VARCHAR), @Result(column = "ext_company_id", property = "extCompanyId", jdbcType = JdbcType.INTEGER), @Result(column = "ext_agency_id", property = "extAgencyId", jdbcType = JdbcType.INTEGER), @Result(column = "ext_host_id", property = "extHostId", jdbcType = JdbcType.INTEGER), @Result(column = "host_index", property = "hostIndex", jdbcType = JdbcType.INTEGER), @Result(column = "ssh_user", property = "sshUser", jdbcType = JdbcType.VARCHAR), @Result(column = "ssh_port", property = "sshPort", jdbcType = JdbcType.INTEGER), @Result(column = "docker_port", property = "dockerPort", jdbcType = JdbcType.INTEGER), @Result(column = "root_on_host", property = "rootOnHost", jdbcType = JdbcType.VARCHAR), @Result(column = "node_root_on_host", property = "nodeRootOnHost", jdbcType = JdbcType.VARCHAR) })
    List<TbFront> selectByExample(TbFrontExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_front
     *
     * @mbg.generated
     */
    @Select({ "select", "front_id, chain_id, front_peer_name, node_id, front_ip, front_port, agency, ", "description, create_time, modify_time, front_status, version, container_name, ", "jsonrpc_port, p2p_port, channel_port, chain_name, ext_company_id, ext_agency_id, ", "ext_host_id, host_index, ssh_user, ssh_port, docker_port, root_on_host, node_root_on_host", "from tb_front", "where front_id = #{frontId,jdbcType=INTEGER}" })
    @Results({ @Result(column = "front_id", property = "frontId", jdbcType = JdbcType.INTEGER, id = true), @Result(column = "chain_id", property = "chainId", jdbcType = JdbcType.INTEGER), @Result(column = "front_peer_name", property = "frontPeerName", jdbcType = JdbcType.VARCHAR), @Result(column = "node_id", property = "nodeId", jdbcType = JdbcType.VARCHAR), @Result(column = "front_ip", property = "frontIp", jdbcType = JdbcType.VARCHAR), @Result(column = "front_port", property = "frontPort", jdbcType = JdbcType.INTEGER), @Result(column = "agency", property = "agency", jdbcType = JdbcType.VARCHAR), @Result(column = "description", property = "description", jdbcType = JdbcType.VARCHAR), @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP), @Result(column = "modify_time", property = "modifyTime", jdbcType = JdbcType.TIMESTAMP), @Result(column = "front_status", property = "frontStatus", jdbcType = JdbcType.INTEGER), @Result(column = "version", property = "version", jdbcType = JdbcType.VARCHAR), @Result(column = "container_name", property = "containerName", jdbcType = JdbcType.VARCHAR), @Result(column = "jsonrpc_port", property = "jsonrpcPort", jdbcType = JdbcType.INTEGER), @Result(column = "p2p_port", property = "p2pPort", jdbcType = JdbcType.INTEGER), @Result(column = "channel_port", property = "channelPort", jdbcType = JdbcType.INTEGER), @Result(column = "chain_name", property = "chainName", jdbcType = JdbcType.VARCHAR), @Result(column = "ext_company_id", property = "extCompanyId", jdbcType = JdbcType.INTEGER), @Result(column = "ext_agency_id", property = "extAgencyId", jdbcType = JdbcType.INTEGER), @Result(column = "ext_host_id", property = "extHostId", jdbcType = JdbcType.INTEGER), @Result(column = "host_index", property = "hostIndex", jdbcType = JdbcType.INTEGER), @Result(column = "ssh_user", property = "sshUser", jdbcType = JdbcType.VARCHAR), @Result(column = "ssh_port", property = "sshPort", jdbcType = JdbcType.INTEGER), @Result(column = "docker_port", property = "dockerPort", jdbcType = JdbcType.INTEGER), @Result(column = "root_on_host", property = "rootOnHost", jdbcType = JdbcType.VARCHAR), @Result(column = "node_root_on_host", property = "nodeRootOnHost", jdbcType = JdbcType.VARCHAR) })
    TbFront selectByPrimaryKey(Integer frontId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_front
     *
     * @mbg.generated
     */
    @UpdateProvider(type = TbFrontSqlProvider.class, method = "updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TbFront record, @Param("example") TbFrontExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_front
     *
     * @mbg.generated
     */
    @UpdateProvider(type = TbFrontSqlProvider.class, method = "updateByExample")
    int updateByExample(@Param("record") TbFront record, @Param("example") TbFrontExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_front
     *
     * @mbg.generated
     */
    @UpdateProvider(type = TbFrontSqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TbFront record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_front
     *
     * @mbg.generated
     */
    @Update({ "update tb_front", "set chain_id = #{chainId,jdbcType=INTEGER},", "front_peer_name = #{frontPeerName,jdbcType=VARCHAR},", "node_id = #{nodeId,jdbcType=VARCHAR},", "front_ip = #{frontIp,jdbcType=VARCHAR},", "front_port = #{frontPort,jdbcType=INTEGER},", "agency = #{agency,jdbcType=VARCHAR},", "description = #{description,jdbcType=VARCHAR},", "create_time = #{createTime,jdbcType=TIMESTAMP},", "modify_time = #{modifyTime,jdbcType=TIMESTAMP},", "front_status = #{frontStatus,jdbcType=INTEGER},", "version = #{version,jdbcType=VARCHAR},", "container_name = #{containerName,jdbcType=VARCHAR},", "jsonrpc_port = #{jsonrpcPort,jdbcType=INTEGER},", "p2p_port = #{p2pPort,jdbcType=INTEGER},", "channel_port = #{channelPort,jdbcType=INTEGER},", "chain_name = #{chainName,jdbcType=VARCHAR},", "ext_company_id = #{extCompanyId,jdbcType=INTEGER},", "ext_agency_id = #{extAgencyId,jdbcType=INTEGER},", "ext_host_id = #{extHostId,jdbcType=INTEGER},", "host_index = #{hostIndex,jdbcType=INTEGER},", "ssh_user = #{sshUser,jdbcType=VARCHAR},", "ssh_port = #{sshPort,jdbcType=INTEGER},", "docker_port = #{dockerPort,jdbcType=INTEGER},", "root_on_host = #{rootOnHost,jdbcType=VARCHAR},", "node_root_on_host = #{nodeRootOnHost,jdbcType=VARCHAR}", "where front_id = #{frontId,jdbcType=INTEGER}" })
    int updateByPrimaryKey(TbFront record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_front
     *
     * @mbg.generated
     */
    @Options(useGeneratedKeys = true, keyProperty = "frontId", keyColumn = "front_id")
    @Insert({ "<script>", "insert into tb_front (chain_id, ", "front_peer_name, node_id, ", "front_ip, front_port, ", "agency, description, ", "create_time, modify_time, ", "front_status, version, ", "container_name, jsonrpc_port, ", "p2p_port, channel_port, ", "chain_name, ext_company_id, ", "ext_agency_id, ext_host_id, ", "host_index, ssh_user, ", "ssh_port, docker_port, ", "root_on_host, node_root_on_host)", "values<foreach collection=\"list\" item=\"detail\" index=\"index\" separator=\",\">(#{detail.chainId,jdbcType=INTEGER}, ", "#{detail.frontPeerName,jdbcType=VARCHAR}, #{detail.nodeId,jdbcType=VARCHAR}, ", "#{detail.frontIp,jdbcType=VARCHAR}, #{detail.frontPort,jdbcType=INTEGER}, ", "#{detail.agency,jdbcType=VARCHAR}, #{detail.description,jdbcType=VARCHAR}, ", "#{detail.createTime,jdbcType=TIMESTAMP}, #{detail.modifyTime,jdbcType=TIMESTAMP}, ", "#{detail.frontStatus,jdbcType=INTEGER}, #{detail.version,jdbcType=VARCHAR}, ", "#{detail.containerName,jdbcType=VARCHAR}, #{detail.jsonrpcPort,jdbcType=INTEGER}, ", "#{detail.p2pPort,jdbcType=INTEGER}, #{detail.channelPort,jdbcType=INTEGER}, ", "#{detail.chainName,jdbcType=VARCHAR}, #{detail.extCompanyId,jdbcType=INTEGER}, ", "#{detail.extAgencyId,jdbcType=INTEGER}, #{detail.extHostId,jdbcType=INTEGER}, ", "#{detail.hostIndex,jdbcType=INTEGER}, #{detail.sshUser,jdbcType=VARCHAR}, ", "#{detail.sshPort,jdbcType=INTEGER}, #{detail.dockerPort,jdbcType=INTEGER}, ", "#{detail.rootOnHost,jdbcType=VARCHAR}, #{detail.nodeRootOnHost,jdbcType=VARCHAR})</foreach></script>" })
    int batchInsert(List<TbFront> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_front
     *
     * @mbg.generated
     */
    @SelectProvider(type = TbFrontSqlProvider.class, method = "getOneByExample")
    @Results({ @Result(column = "front_id", property = "frontId", jdbcType = JdbcType.INTEGER, id = true), @Result(column = "chain_id", property = "chainId", jdbcType = JdbcType.INTEGER), @Result(column = "front_peer_name", property = "frontPeerName", jdbcType = JdbcType.VARCHAR), @Result(column = "node_id", property = "nodeId", jdbcType = JdbcType.VARCHAR), @Result(column = "front_ip", property = "frontIp", jdbcType = JdbcType.VARCHAR), @Result(column = "front_port", property = "frontPort", jdbcType = JdbcType.INTEGER), @Result(column = "agency", property = "agency", jdbcType = JdbcType.VARCHAR), @Result(column = "description", property = "description", jdbcType = JdbcType.VARCHAR), @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP), @Result(column = "modify_time", property = "modifyTime", jdbcType = JdbcType.TIMESTAMP), @Result(column = "front_status", property = "frontStatus", jdbcType = JdbcType.INTEGER), @Result(column = "version", property = "version", jdbcType = JdbcType.VARCHAR), @Result(column = "container_name", property = "containerName", jdbcType = JdbcType.VARCHAR), @Result(column = "jsonrpc_port", property = "jsonrpcPort", jdbcType = JdbcType.INTEGER), @Result(column = "p2p_port", property = "p2pPort", jdbcType = JdbcType.INTEGER), @Result(column = "channel_port", property = "channelPort", jdbcType = JdbcType.INTEGER), @Result(column = "chain_name", property = "chainName", jdbcType = JdbcType.VARCHAR), @Result(column = "ext_company_id", property = "extCompanyId", jdbcType = JdbcType.INTEGER), @Result(column = "ext_agency_id", property = "extAgencyId", jdbcType = JdbcType.INTEGER), @Result(column = "ext_host_id", property = "extHostId", jdbcType = JdbcType.INTEGER), @Result(column = "host_index", property = "hostIndex", jdbcType = JdbcType.INTEGER), @Result(column = "ssh_user", property = "sshUser", jdbcType = JdbcType.VARCHAR), @Result(column = "ssh_port", property = "sshPort", jdbcType = JdbcType.INTEGER), @Result(column = "docker_port", property = "dockerPort", jdbcType = JdbcType.INTEGER), @Result(column = "root_on_host", property = "rootOnHost", jdbcType = JdbcType.VARCHAR), @Result(column = "node_root_on_host", property = "nodeRootOnHost", jdbcType = JdbcType.VARCHAR) })
    Optional<TbFront> getOneByExample(TbFrontExample example);
}
