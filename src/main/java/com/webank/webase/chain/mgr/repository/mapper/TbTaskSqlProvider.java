package com.webank.webase.chain.mgr.repository.mapper;

import com.webank.webase.chain.mgr.repository.bean.TbTask;
import com.webank.webase.chain.mgr.repository.bean.TbTaskExample.Criteria;
import com.webank.webase.chain.mgr.repository.bean.TbTaskExample.Criterion;
import com.webank.webase.chain.mgr.repository.bean.TbTaskExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TbTaskSqlProvider {

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_task
     *
     * @mbg.generated
     */
    public static final String ALL_COLUMN_FIELDS = "id,task_type,task_status,chain_id,group_id,node_id,current_handler_host,gmt_create,gmt_modified,description,remark";

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_task
     *
     * @mbg.generated
     */
    public String countByExample(TbTaskExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("tb_task");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_task
     *
     * @mbg.generated
     */
    public String deleteByExample(TbTaskExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("tb_task");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_task
     *
     * @mbg.generated
     */
    public String insertSelective(TbTask record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("tb_task");
        if (record.getTaskType() != null) {
            sql.VALUES("task_type", "#{taskType,jdbcType=TINYINT}");
        }
        if (record.getTaskStatus() != null) {
            sql.VALUES("task_status", "#{taskStatus,jdbcType=TINYINT}");
        }
        if (record.getChainId() != null) {
            sql.VALUES("chain_id", "#{chainId,jdbcType=INTEGER}");
        }
        if (record.getGroupId() != null) {
            sql.VALUES("group_id", "#{groupId,jdbcType=INTEGER}");
        }
        if (record.getNodeId() != null) {
            sql.VALUES("node_id", "#{nodeId,jdbcType=VARCHAR}");
        }
        if (record.getCurrentHandlerHost() != null) {
            sql.VALUES("current_handler_host", "#{currentHandlerHost,jdbcType=VARCHAR}");
        }
        if (record.getGmtCreate() != null) {
            sql.VALUES("gmt_create", "#{gmtCreate,jdbcType=TIMESTAMP}");
        }
        if (record.getGmtModified() != null) {
            sql.VALUES("gmt_modified", "#{gmtModified,jdbcType=TIMESTAMP}");
        }
        if (record.getDescription() != null) {
            sql.VALUES("description", "#{description,jdbcType=VARCHAR}");
        }
        if (record.getRemark() != null) {
            sql.VALUES("remark", "#{remark,jdbcType=LONGVARCHAR}");
        }
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_task
     *
     * @mbg.generated
     */
    public String selectByExampleWithBLOBs(TbTaskExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("task_type");
        sql.SELECT("task_status");
        sql.SELECT("chain_id");
        sql.SELECT("group_id");
        sql.SELECT("node_id");
        sql.SELECT("current_handler_host");
        sql.SELECT("gmt_create");
        sql.SELECT("gmt_modified");
        sql.SELECT("description");
        sql.SELECT("remark");
        sql.FROM("tb_task");
        applyWhere(sql, example, false);
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_task
     *
     * @mbg.generated
     */
    public String selectByExample(TbTaskExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("task_type");
        sql.SELECT("task_status");
        sql.SELECT("chain_id");
        sql.SELECT("group_id");
        sql.SELECT("node_id");
        sql.SELECT("current_handler_host");
        sql.SELECT("gmt_create");
        sql.SELECT("gmt_modified");
        sql.SELECT("description");
        sql.FROM("tb_task");
        applyWhere(sql, example, false);
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        // add pagination for mysql with limit clause 
        StringBuilder sqlBuilder = new StringBuilder(sql.toString());
        if (example != null && (example.getStart() > -1 || example.getCount() > -1)) {
            sqlBuilder.append(" limit ");
            if (example.getStart() > -1 && example.getCount() > -1) {
                sqlBuilder.append(example.getStart()).append(",").append(example.getCount());
            } else if (example.getStart() > -1) {
                sqlBuilder.append(example.getStart());
            } else if (example.getCount() > -1) {
                sqlBuilder.append(example.getCount());
            }
        }
        return sqlBuilder.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_task
     *
     * @mbg.generated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        TbTask record = (TbTask) parameter.get("record");
        TbTaskExample example = (TbTaskExample) parameter.get("example");
        SQL sql = new SQL();
        sql.UPDATE("tb_task");
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        if (record.getTaskType() != null) {
            sql.SET("task_type = #{record.taskType,jdbcType=TINYINT}");
        }
        if (record.getTaskStatus() != null) {
            sql.SET("task_status = #{record.taskStatus,jdbcType=TINYINT}");
        }
        if (record.getChainId() != null) {
            sql.SET("chain_id = #{record.chainId,jdbcType=INTEGER}");
        }
        if (record.getGroupId() != null) {
            sql.SET("group_id = #{record.groupId,jdbcType=INTEGER}");
        }
        if (record.getNodeId() != null) {
            sql.SET("node_id = #{record.nodeId,jdbcType=VARCHAR}");
        }
        if (record.getCurrentHandlerHost() != null) {
            sql.SET("current_handler_host = #{record.currentHandlerHost,jdbcType=VARCHAR}");
        }
        if (record.getGmtCreate() != null) {
            sql.SET("gmt_create = #{record.gmtCreate,jdbcType=TIMESTAMP}");
        }
        if (record.getGmtModified() != null) {
            sql.SET("gmt_modified = #{record.gmtModified,jdbcType=TIMESTAMP}");
        }
        if (record.getDescription() != null) {
            sql.SET("description = #{record.description,jdbcType=VARCHAR}");
        }
        if (record.getRemark() != null) {
            sql.SET("remark = #{record.remark,jdbcType=LONGVARCHAR}");
        }
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_task
     *
     * @mbg.generated
     */
    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("tb_task");
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("task_type = #{record.taskType,jdbcType=TINYINT}");
        sql.SET("task_status = #{record.taskStatus,jdbcType=TINYINT}");
        sql.SET("chain_id = #{record.chainId,jdbcType=INTEGER}");
        sql.SET("group_id = #{record.groupId,jdbcType=INTEGER}");
        sql.SET("node_id = #{record.nodeId,jdbcType=VARCHAR}");
        sql.SET("current_handler_host = #{record.currentHandlerHost,jdbcType=VARCHAR}");
        sql.SET("gmt_create = #{record.gmtCreate,jdbcType=TIMESTAMP}");
        sql.SET("gmt_modified = #{record.gmtModified,jdbcType=TIMESTAMP}");
        sql.SET("description = #{record.description,jdbcType=VARCHAR}");
        sql.SET("remark = #{record.remark,jdbcType=LONGVARCHAR}");
        TbTaskExample example = (TbTaskExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_task
     *
     * @mbg.generated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("tb_task");
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("task_type = #{record.taskType,jdbcType=TINYINT}");
        sql.SET("task_status = #{record.taskStatus,jdbcType=TINYINT}");
        sql.SET("chain_id = #{record.chainId,jdbcType=INTEGER}");
        sql.SET("group_id = #{record.groupId,jdbcType=INTEGER}");
        sql.SET("node_id = #{record.nodeId,jdbcType=VARCHAR}");
        sql.SET("current_handler_host = #{record.currentHandlerHost,jdbcType=VARCHAR}");
        sql.SET("gmt_create = #{record.gmtCreate,jdbcType=TIMESTAMP}");
        sql.SET("gmt_modified = #{record.gmtModified,jdbcType=TIMESTAMP}");
        sql.SET("description = #{record.description,jdbcType=VARCHAR}");
        TbTaskExample example = (TbTaskExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_task
     *
     * @mbg.generated
     */
    public String updateByPrimaryKeySelective(TbTask record) {
        SQL sql = new SQL();
        sql.UPDATE("tb_task");
        if (record.getTaskType() != null) {
            sql.SET("task_type = #{taskType,jdbcType=TINYINT}");
        }
        if (record.getTaskStatus() != null) {
            sql.SET("task_status = #{taskStatus,jdbcType=TINYINT}");
        }
        if (record.getChainId() != null) {
            sql.SET("chain_id = #{chainId,jdbcType=INTEGER}");
        }
        if (record.getGroupId() != null) {
            sql.SET("group_id = #{groupId,jdbcType=INTEGER}");
        }
        if (record.getNodeId() != null) {
            sql.SET("node_id = #{nodeId,jdbcType=VARCHAR}");
        }
        if (record.getCurrentHandlerHost() != null) {
            sql.SET("current_handler_host = #{currentHandlerHost,jdbcType=VARCHAR}");
        }
        if (record.getGmtCreate() != null) {
            sql.SET("gmt_create = #{gmtCreate,jdbcType=TIMESTAMP}");
        }
        if (record.getGmtModified() != null) {
            sql.SET("gmt_modified = #{gmtModified,jdbcType=TIMESTAMP}");
        }
        if (record.getDescription() != null) {
            sql.SET("description = #{description,jdbcType=VARCHAR}");
        }
        if (record.getRemark() != null) {
            sql.SET("remark = #{remark,jdbcType=LONGVARCHAR}");
        }
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_task
     *
     * @mbg.generated
     */
    protected void applyWhere(SQL sql, TbTaskExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_task
     *
     * @mbg.generated
     */
    public String getOneByExample(TbTaskExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("task_type");
        sql.SELECT("task_status");
        sql.SELECT("chain_id");
        sql.SELECT("group_id");
        sql.SELECT("node_id");
        sql.SELECT("current_handler_host");
        sql.SELECT("gmt_create");
        sql.SELECT("gmt_modified");
        sql.SELECT("description");
        sql.SELECT("remark");
        sql.FROM("tb_task");
        applyWhere(sql, example, false);
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        StringBuilder sqlBuilder = new StringBuilder(sql.toString());
        sqlBuilder.append(" limit 1 ");
        return sqlBuilder.toString();
    }
}
