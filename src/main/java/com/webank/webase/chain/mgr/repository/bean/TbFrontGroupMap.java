package com.webank.webase.chain.mgr.repository.bean;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@EqualsAndHashCode
public class TbFrontGroupMap implements Serializable {

    public TbFrontGroupMap(Integer chainId, Integer frontId, Integer groupId) {
        this.chainId = chainId;
        this.frontId = frontId;
        this.groupId = groupId;
        Date now = new Date();
        this.createTime = now;
        this.modifyTime = now;
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_front_group_map.map_id
     *
     * @mbg.generated
     */
    private Integer mapId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_front_group_map.chain_id
     *
     * @mbg.generated
     */
    private Integer chainId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_front_group_map.front_id
     *
     * @mbg.generated
     */
    private Integer frontId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_front_group_map.group_id
     *
     * @mbg.generated
     */
    private Integer groupId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_front_group_map.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_front_group_map.modify_time
     *
     * @mbg.generated
     */
    private Date modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_front_group_map.front_status
     *
     * @mbg.generated
     */
    private Byte frontStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_front_group_map
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;
}
