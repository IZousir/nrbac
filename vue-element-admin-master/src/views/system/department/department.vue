<template>
    <el-main>
        <!-- 查询条件 -->
        <el-form ref="searchForm" label-width="80px" :inline="true" size="small">
            <el-form-item>
                <el-input placeholder="请输入部门名称"></el-input>
            </el-form-item>
            <el-form-item>
                <el-button type="primary" icon="el-icon-search">查询</el-button>
                <el-button icon="el-icon-refresh-right">重置</el-button>
                <el-button type="success" icon="el-icon-plus">新增</el-button>
            </el-form-item>
        </el-form>
        <!-- 数据表格 -->
        <el-table :data="tableData" border stripe style="width: 100%; margin-bottom: 20px" row-key="id" default-expand-all
            :tree-props="{ children: 'children' }">
            <el-table-column prop="name" label="部门名称"></el-table-column>
            <el-table-column prop="parentName" label="所属部门"></el-table-column>
            <el-table-column prop="deptCode" label="部门编码"></el-table-column>
            <el-table-column prop="deptPhone" label="部门电话"></el-table-column>
            <el-table-column label="操作" width="200" align="center">
                <template slot-scope="scope">
                    <el-button icon="el-icon-edit-outline" type="primary" size="small" @click="handleEdit(scope.row)">编辑
                    </el-button>
                    <el-button icon="el-icon-close" type="danger" size="small" @click="handleDelete(scope.row)">删除
                    </el-button>
                </template>
            </el-table-column>
        </el-table>
    </el-main>
</template>
<script>
export default {
    name: 'department',
    data() {
        return {
            tableData: []//表格数据列表
        }
    },
    methods: {
        /**
        * 编辑部门
        * @param row
        */
        handleEdit(row) {
        },
        /**
        * 删除部门
        * @param row
        */
        handleDelete(row) {
        },
    },
    created() {
    }
}
</script>
<style lang="scss" scoped></style>