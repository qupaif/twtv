package com.lizongying.mytv

import android.content.Context
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.io.IOException

object TVList {
    var list = mapOf(
        "电影频道" to listOf(
            TV(
                0,
                "东森洋片",
                "东森洋片",
                listOf("https://ctrl.laotv.la/live/DongsenForeignMovie/index.m3u8"),
                0,
                "电影频道",
                "https://static.wikia.nocookie.net/logos/images/b/be/EBC%E6%9D%B1%E6%A3%AE%E6%B4%8B%E7%89%87_HD.png/revision/latest/scale-to-width-down/1000?cb=20231213092418&path-prefix=vi",
                "600001859",
                "2022576801",
                "600001859",
                false,
                mustToken = false
            ),
        ),
        "地方频道" to listOf(
            TV(
                33,
                "东方卫视",
                "东方卫视",
                listOf("http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226217/index.m3u8"),
                0,
                "地方频道",
                "https://resources.yangshipin.cn/assets/oms/image/202306/9bd372ca292a82ce3aa08772b07efc4af1f85c21d1f268ea33440c49e9a0a488.png?imageMogr2/format/webp",
                "600002483",
                "2000292403",
                "600002483",
                true,
                mustToken = false
            ),
            TV(
                34,
                "湖南卫视",
                "湖南卫视",
                listOf(
                    "http://ottrrs.hl.chinamobile.com/PLTV/88888888/224/3221226307/index.m3u8",
                    "http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226211/index.m3u8"
                ),
                0,
                "地方频道",
                "https://resources.yangshipin.cn/assets/oms/image/202306/4120e89d3079d08aa17d382f69a2308ec70839b278367763c34a34666c75cb88.png?imageMogr2/format/webp",
                "600002475",
                "2000296203",
                "600002475",
                true,
                mustToken = false
            ),
            TV(
                35,
                "湖北卫视",
                "湖北卫视",
                listOf(
                    "http://ottrrs.hl.chinamobile.com/PLTV/88888888/224/3221226477/index.m3u8",
                    "http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226194/index.m3u8"
                ),
                0,
                "地方频道",
                "https://resources.yangshipin.cn/assets/oms/image/202306/7a6be5a2bb1dc53a945c016ff1f525dc4a84c51db371c15c89aa55404b0ba784.png?imageMogr2/format/webp",
                "600002508",
                "2000294503",
                "600002508",
                true,
                mustToken = false
            ),
            TV(
                36,
                "辽宁卫视",
                "辽宁卫视",
                listOf(
                    "http://ottrrs.hl.chinamobile.com/PLTV/88888888/224/3221226546/index.m3u8",
                    "http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226201/index.m3u8"
                ),
                0,
                "地方频道",
                "https://resources.yangshipin.cn/assets/oms/image/202306/ac4ed6058a87c101ae7147ebc38905d0cae047fb73fd277ee5049b84f52bda36.png?imageMogr2/format/webp",
                "600002505",
                "2000281303",
                "600002505",
                true,
                mustToken = false
            ),
            TV(
                37,
                "江苏卫视",
                "江苏卫视",
                listOf(
                    "http://39.134.24.166/dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226200/index.m3u8",
                    "http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226200/index.m3u8"
                ),
                0,
                "地方频道",
                "https://resources.yangshipin.cn/assets/oms/image/202306/380ad685c0c1d5b2c902246b8d2df6d3f9b45e2837abcfe493075bbded597a31.png?imageMogr2/format/webp",
                "600002521",
                "2000295603",
                "600002521",
                true,
                mustToken = false
            ),
            TV(
                38,
                "江西卫视",
                "江西卫视",
                listOf(
                    "http://ottrrs.hl.chinamobile.com/PLTV/88888888/224/3221226344/index.m3u8",
                    "http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225764/index.m3u8"
                ),
                0,
                "地方频道",
                "https://resources.yangshipin.cn/assets/oms/image/202306/3c760d0d00463855890e8a1864ea4a6b6dd66b90c29b4ac714a4b17c16519871.png?imageMogr2/format/webp",
                "600002503",
                "2000294103",
                "600002503",
                true,
                mustToken = false
            ),
            TV(
                39,
                "山东卫视",
                "山东卫视",
                listOf("http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226209/index.m3u8"),
                0,
                "地方频道",
                "https://resources.yangshipin.cn/assets/oms/image/202306/22d403f07a7cf5410b3ad3ddb65a11aa229a32475fac213f5344c9f0ec330ca1.png?imageMogr2/format/webp",
                "600002513",
                "2000294803",
                "600002513",
                true,
                mustToken = false
            ),
            TV(
                40,
                "广东卫视",
                "广东卫视",
                listOf("http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226216/index.m3u8"),
                0,
                "地方频道",
                "https://resources.yangshipin.cn/assets/oms/image/202306/28886880a4dc0f06fb7e0a528a1def0591d61a65870e29176ede0cc92033bbfd.png?imageMogr2/format/webp",
                "600002485",
                "2000292703",
                "600002485",
                true,
                mustToken = false
            ),
            TV(
                41,
                "广西卫视",
                "广西卫视",
                listOf(
                    "http://live.gxrb.com.cn/tv/gxtvlive03/index.m3u8",
                    "http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225770/index.m3u8"
                ),
                0,
                "地方频道",
                "https://resources.yangshipin.cn/assets/oms/image/202306/54b7e97cb816bb223fe05f3fc44da2c7820eb66e8550c19d23100f2c414ecc38.png?imageMogr2/format/webp",
                "600002509",
                "2000294203",
                "600002509",
                true,
                mustToken = false
            ),
            TV(
                42,
                "重庆卫视",
                "重庆卫视",
                listOf(
                    "http://ottrrs.hl.chinamobile.com/PLTV/88888888/224/3221226409/index.m3u8",
                    "http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226202/index.m3u8"
                ),
                0,
                "地方频道",
                "https://resources.yangshipin.cn/assets/oms/image/202306/657651f411de2673d1770d9a78b44c1265704f7468cc41d4be7f51d630768494.png?imageMogr2/format/webp",
                "600002531",
                "2000297803",
                "600002531",
                true,
                mustToken = false
            ),
            TV(
                43,
                "河南卫视",
                "河南卫视",
                listOf(
                    "http://ottrrs.hl.chinamobile.com/PLTV/88888888/224/3221226480/index.m3u8",
                    "http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225767/index.m3u8"
                ),
                0,
                "地方频道",
                "https://resources.yangshipin.cn/assets/oms/image/202306/74925962148a6d31c85808b6cd4e444c2a54bab393d2c5fc85e960b50e22fa86.png?imageMogr2/format/webp",
                "600002525",
                "2000296103",
                "600002525",
                true,
                mustToken = false
            ),
            TV(
                44,
                "河北卫视",
                "河北卫视",
                listOf(
                    "http://ottrrs.hl.chinamobile.com/PLTV/88888888/224/3221226406/index.m3u8",
                    "http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225750/index.m3u8"
                ),
                0,
                "地方频道",
                "https://resources.yangshipin.cn/assets/oms/image/202306/d545becdc81c60197b08c7f47380705e4665ed3fe55efc8b855e486f6e655378.png?imageMogr2/format/webp",
                "600002493",
                "2000293403",
                "600002493",
                true,
                mustToken = false
            ),
            TV(
                45,
                "贵州卫视",
                "贵州卫视",
                listOf(
                    "http://ottrrs.hl.chinamobile.com/PLTV/88888888/224/3221226474/index.m3u8",
                    "http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225793/index.m3u8"
                ),
                0,
                "地方频道",
                "https://resources.yangshipin.cn/assets/oms/image/202306/4eb45f4781d33d872af027dc01c941559aab55667dd99cc5c22bef7037807b13.png?imageMogr2/format/webp",
                "600002490",
                "2000293303",
                "600002490",
                true,
                mustToken = false
            ),
            TV(
                46,
                "北京卫视",
                "北京卫视",
                listOf(
                    "http://ottrrs.hl.chinamobile.com/PLTV/88888888/224/3221225728/index.m3u8",
                    "http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226222/index.m3u8"
                ),
                0,
                "地方频道",
                "https://resources.yangshipin.cn/assets/oms/image/202306/f4f23633c578beea49a3841d88d3490100f029ee349059fa532869db889872c5.png?imageMogr2/format/webp",
                "600002309",
                "2000272103",
                "600002309",
                true,
                mustToken = false
            ),
            TV(
                47,
                "黑龙江卫视",
                "黑龙江卫视",
                listOf(
                    "http://ottrrs.hl.chinamobile.com/PLTV/88888888/224/3221226327/index.m3u8",
                    "http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226215/index.m3u8"
                ),
                0,
                "地方频道",
                "https://resources.yangshipin.cn/assets/oms/image/202306/d8273ae9be698ce2db21f5b886ecac95a73429593f93713c60ed8c12c38bf0d3.png?imageMogr2/format/webp",
                "600002498",
                "2000293903",
                "600002498",
                true,
                mustToken = false
            ),
            TV(
                48,
                "浙江卫视",
                "浙江卫视",
                listOf(
                    "http://hw-m-l.cztv.com/channels/lantian/channel01/1080p.m3u8",
                    "http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226199/index.m3u8"
                ),
                0,
                "地方频道",
                "https://resources.yangshipin.cn/assets/oms/image/202306/a66c836bd98ba3e41a2e9a570d4b9c50dedc6839e9de333e2e78212ad505f37e.png?imageMogr2/format/webp",
                "600002520",
                "2000295503",
                "600002520",
                true,
                mustToken = false
            ),
            TV(
                49,
                "安徽卫视",
                "安徽卫视",
                listOf(
                    "http://ottrrs.hl.chinamobile.com/PLTV/88888888/224/3221226391/index.m3u8",
                    "http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226203/index.m3u8"
                ),
                0,
                "地方频道",
                "https://resources.yangshipin.cn/assets/oms/image/202306/f35fa04b51b1ee4984b03578b65403570868ebca03c6c01e11b097f999a58d9b.png?imageMogr2/format/webp",
                "600002532",
                "2000298003",
                "600002532",
                true,
                mustToken = false
            ),
            TV(
                50,
                "深圳卫视",
                "深圳卫视",
                listOf(
                    "http://39.134.24.166/dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226205/index.m3u8",
                    "http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226205/index.m3u8"
                ),
                0,
                "地方频道",
                "https://resources.yangshipin.cn/assets/oms/image/202306/d59fec04c902e3581c617136d02d4b9b8c4cbe64272781ddd3525e80c823edb7.png?imageMogr2/format/webp",
                "600002481",
                "2000292203",
                "600002481",
                true,
                mustToken = false
            ),
            TV(
                51,
                "四川卫视",
                "四川卫视",
                listOf(
                    "http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225768/index.m3u8",
                    "http://39.134.24.166/dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225768/index.m3u8"
                ),
                0,
                "地方频道",
                "https://resources.yangshipin.cn/assets/oms/image/202306/3276a414ae0eaa0f116f2045cd913367967d0c7c1e978e8621ac3879436c6ed7.png?imageMogr2/format/webp",
                "600002516",
                "2000295003",
                "600002516",
                true,
                mustToken = false
            ),
            TV(
                52,
                "东南卫视",
                "福建东南卫视",
                listOf(
                    "http://ottrrs.hl.chinamobile.com/PLTV/88888888/224/3221226341/index.m3u8",
                    "http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225766/index.m3u8"
                ),
                0,
                "地方频道",
                "https://resources.yangshipin.cn/assets/oms/image/202306/3208fe6564a293c21b711333fb3edb05bb5b406cff840573c9a8d839680a1579.png?imageMogr2/format/webp",
                "600002484",
                "2000292503",
                "600002484",
                true,
                mustToken = false
            ),
            TV(
                53,
                "海南卫视",
                "海南卫视",
                listOf(
                    "http://ottrrs.hl.chinamobile.com/PLTV/88888888/224/3221226465/index.m3u8",
                    "http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225769/index.m3u8"
                ),
                0,
                "地方频道",
                "https://resources.yangshipin.cn/assets/oms/image/202306/6e060391fde0469801fc3d84dbf204b4f8d650d251f17d7595a6964c0bb99e81.png?imageMogr2/format/webp",
                "600002506",
                "2000291503",
                "600002506",
                true,
                mustToken = false
            ),
            TV(
                54,
                "天津卫视",
                "天津卫视",
                listOf(),
                0,
                "地方频道",
                "",
                "600152137",
                "2019927003",
                "",
                true,
                mustToken = false
            ),
            TV(
                55,
                "新疆卫视",
                "新疆卫视",
                listOf(),
                0,
                "地方频道",
                "",
                "600152138",
                "2019927403",
                "",
                true,
                mustToken = false
            ),
        ),
        "国际频道" to listOf(
            TV(
                56,
                "CGTN",
                "CGTN",
                listOf("http://live.cgtn.com/1000/prog_index.m3u8"),
                0,
                "国际频道",
                "https://resources.yangshipin.cn/assets/oms/image/202306/a72dff758ca1c17cd0ecc8cedc11b893d208f409d5e6302faa0e9d298848abc3.png?imageMogr2/format/webp",
                "600014550",
                "2022575001",
                "600014550",
                false,
                mustToken = false
            ),
            TV(
                57,
                "CGTN 法语频道",
                "CGTN法语频道",
                listOf("https://livefr.cgtn.com/1000f/prog_index.m3u8"),
                0,
                "国际频道",
                "https://resources.yangshipin.cn/assets/oms/image/202306/a8d0046a47433d952bf6ed17062deb8bd2184ba9aec0f7781df6bf9487a3ffcf.png?imageMogr2/format/webp",
                "600084704",
                "2022574901",
                "600084704",
                false,
                mustToken = false
            ),
            TV(
                58,
                "CGTN 俄语频道",
                "CGTN俄语频道",
                listOf("http://liveru.cgtn.com/1000r/prog_index.m3u8"),
                0,
                "国际频道",
                "https://resources.yangshipin.cn/assets/oms/image/202306/bf0a820893cbaf20dd0333e27042e1ef9c8806e5b602b6a8c95af399db0bc77a.png?imageMogr2/format/webp",
                "600084758",
                "2022574801",
                "600084758",
                false,
                mustToken = false
            ),
            TV(
                59,
                "CGTN 阿拉伯语频道",
                "CGTN阿拉伯语频道",
                listOf("http://livear.cgtn.com/1000a/prog_index.m3u8"),
                0,
                "国际频道",
                "https://resources.yangshipin.cn/assets/oms/image/202306/2e44e2aa3e7a1cedf07fd0ae59fe69e86a60a2632660a006e3e9e7397b2d107e.png?imageMogr2/format/webp",
                "600084782",
                "2022574601",
                "600084782",
                false,
                mustToken = false
            ),
            TV(
                60,
                "CGTN 西班牙语频道",
                "CGTN西班牙语频道",
                listOf(
                    "http://livees.cgtn.com/500e/prog_index.m3u8",
                    "http://livees.cgtn.com/1000e/prog_index.m3u8"
                ),
                0,
                "国际频道",
                "https://resources.yangshipin.cn/assets/oms/image/202309/7c337e3dbe64402ec7e4678a619a4a6d95144e42f35161181ff78e143b7cf67a.png?imageMogr2/format/webp",
                "600084744",
                "2022571701",
                "600084744",
                false,
                mustToken = false
            ),
            TV(
                61,
                "CGTN 纪录频道",
                "CGTN外语纪录频道",
                listOf("https://livedoc.cgtn.com/500d/prog_index.m3u8"),
                0,
                "国际频道",
                "https://resources.yangshipin.cn/assets/oms/image/202309/74d3ac436a7e374879578de1d87a941fbf566d39d5632b027c5097891ed32bd5.png?imageMogr2/format/webp",
                "600084781",
                "2022574701",
                "600084781",
                false,
                mustToken = false
            ),
        )
    )

    /**
     * 初始化
     *
     * @param context Context
     */
    fun init(context: Context) {
        CoroutineScope(Dispatchers.Default).launch {
            //获取本地版本号
            val localVersion = ChannelUtils.getLocalVersion(context)
            //获取服务器版本号
            val serverVersion = try {
                ChannelUtils.getServerVersion(context)
            } catch (e: IOException) {
                Log.e("TVList", "无法从服务器获取版本信息", e)
                Integer.MIN_VALUE
            }
            //频道列表
            val channelTVMap: MutableMap<String, MutableList<TV>> = mutableMapOf()
            //是否从服务器更新
            var updateFromServer = false
            //获取频道列表
            val tvList: List<TV> = if (localVersion < serverVersion) {
                //获取服务器地址
                val url = ChannelUtils.getServerUrl(context)
                //是否从服务器更新
                updateFromServer = true
                Log.i("TVList", "从服务器获取频道信息")
                try {
                    ChannelUtils.getServerChannel(url)
                } catch (e: IOException) {
                    Log.e("TVList", "无法从服务器获取频道信息", e)
                    updateFromServer = false
                    ChannelUtils.getLocalChannel(context)
                }
            } else {
                Log.i("TVList", "从本地获取频道信息")
                //获取本地频道
                ChannelUtils.getLocalChannel(context)
            }
            //按频道分类
            for (tv in tvList) {
                val key = tv.channel
                if (channelTVMap.containsKey(key)) {
                    val list = channelTVMap[key]!!
                    list.add(tv)
                    channelTVMap[key] = list
                } else {
                    channelTVMap[key] = mutableListOf(tv)
                }
            }
            //保存频道列表
            list = channelTVMap
            //保存版本号
            if (updateFromServer) {
                ChannelUtils.updateLocalChannel(context, serverVersion, tvList)
            }
        }
    }
}
