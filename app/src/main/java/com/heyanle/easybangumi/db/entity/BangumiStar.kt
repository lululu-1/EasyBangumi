package com.heyanle.easybangumi.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.heyanle.lib_anim.entity.Bangumi
import com.heyanle.lib_anim.entity.BangumiDetail

/**
 * Created by HeYanLe on 2023/1/18 21:41.
 * https://github.com/heyanLE
 */
@Entity
data class BangumiStar (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String ,
    val cover: String,
    val source: String,
    val detailUrl: String,
    val createTime: Long,
){

    companion object {
        fun fromBangumi(bangumi: Bangumi): BangumiStar {
            return BangumiStar(
                name = bangumi.name,
                cover = bangumi.cover,
                source = bangumi.source,
                detailUrl = bangumi.detailUrl,
                createTime = System.currentTimeMillis()
            )
        }
        fun fromBangumi(bangumi: BangumiDetail): BangumiStar {
            return BangumiStar(
                name = bangumi.name,
                cover = bangumi.cover,
                source = bangumi.source,
                detailUrl = bangumi.detailUrl,
                createTime = System.currentTimeMillis()
            )
        }
    }

}