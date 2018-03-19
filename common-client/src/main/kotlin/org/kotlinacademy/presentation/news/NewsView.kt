package org.kotlinacademy.presentation.news

import org.kotlinacademy.data.Article
import org.kotlinacademy.data.*import org.kotlinacademy.presentation.BaseView

interface NewsView : BaseView {
    var loading: Boolean
    var refresh: Boolean
    fun showList(articles: List<Article>)
}