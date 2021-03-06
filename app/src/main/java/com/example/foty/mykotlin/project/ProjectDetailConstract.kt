package com.example.foty.mykotlin.project

import com.example.foty.mykotlin.base.BaseView
import com.example.foty.mykotlin.beans.ProjectBean

/**
 * Create by lxx
 * Date : 2020/3/11 17:35
 * Use by
 */
interface ProjectDetailConstract {

    interface View : BaseView {
        fun loadDetailSuccess(data: ProjectBean)
    }

    interface Presenter {
        fun getDetailArticle(pageNum: Int, cid: Int)
    }
}