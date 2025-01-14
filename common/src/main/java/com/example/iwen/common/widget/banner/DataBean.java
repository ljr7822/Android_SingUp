package com.example.iwen.common.widget.banner;

import com.example.iwen.common.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 轮播图数据
 *
 * @author : Iwen大大怪
 * create : 11-19 019 13:35
 */
public class DataBean {
    public Integer imageRes;
    public String imageUrl;
    public String title;
    public String content;
    public String url;
    public int viewType;

    public DataBean(Integer imageRes, String title,String content,String url,int viewType) {
        this.imageRes = imageRes;
        this.title = title;
        this.content = content;
        this.url = url;
        this.viewType = viewType;
    }

    public DataBean(String imageUrl, String title, int viewType) {
        this.imageUrl = imageUrl;
        this.title = title;
        this.viewType = viewType;
    }

    public static List<DataBean> getTestData() {
        List<DataBean> list = new ArrayList<>();
        list.add(new DataBean(R.drawable.img_0,"广告一","相信自己,你努力的样子真的很美", "https://www.baidu.com/",1));
        list.add(new DataBean(R.drawable.c_img3,"广告二","极致简约,梦幻小屋","https://www.baidu.com/", 3));
        list.add(new DataBean(R.drawable.c_img2, "广告三","超级卖梦人","https://www.baidu.com/", 3));
        list.add(new DataBean(R.drawable.img_3, "广告四","夏季新搭配", "https://www.baidu.com/",1));
        list.add(new DataBean(R.drawable.img_4, "广告五","绝美风格搭配", "https://www.baidu.com/",1));
        list.add(new DataBean(R.drawable.img_5, "广告六","微微一笑 很倾城", "https://www.baidu.com/",3));
        list.add(new DataBean(R.drawable.c_img5, "广告七","微微一笑 很倾城", "https://www.baidu.com/",3));
        list.add(new DataBean(R.drawable.c_img6, "广告八","微微一笑 很倾城", "https://www.baidu.com/",3));
        return list;
    }

    public static List<DataBean> getTestData2() {
        List<DataBean> list = new ArrayList<>();
        list.add(new DataBean(R.drawable.img_0, "广告一","听风.赏雨", "https://www.baidu.com/",3));
        list.add(new DataBean(R.drawable.img_3, "广告一","迪丽热巴.迪力木拉提","https://www.baidu.com/", 1));
        list.add(new DataBean(R.drawable.img_4, "广告一","爱美.人间有之", "https://www.baidu.com/",3));
        list.add(new DataBean(R.drawable.img_5, "广告一","洋洋洋.气质篇", "https://www.baidu.com/",1));
        list.add(new DataBean(R.drawable.img_1, "广告一","生活的态度", "https://www.baidu.com/",3));
        return list;
    }

    /**
     * 仿淘宝商品详情第一个是视频
     *
     * @return
     */
    public static List<DataBean> getTestDataVideo() {
        List<DataBean> list = new ArrayList<>();
        list.add(new DataBean("http://vfx.mtime.cn/Video/2019/03/09/mp4/190309153658147087.mp4", "第一个放视频", 2));
        list.add(new DataBean(R.drawable.img_0, "广告一","听风.赏雨", "https://www.baidu.com/",1));
        list.add(new DataBean(R.drawable.img_5, "广告一","迪丽热巴.迪力木拉提","https://www.baidu.com/", 1));
        list.add(new DataBean(R.drawable.img_4, "广告一","爱美.人间有之", "https://www.baidu.com/",1));
        list.add(new DataBean(R.drawable.img_0, "广告一","洋洋洋.气质篇", "https://www.baidu.com/",1));
        list.add(new DataBean(R.drawable.img_1, "广告一","生活的态度", "https://www.baidu.com/",1));
        return list;
    }

    public static List<DataBean> getTestData3() {
        List<DataBean> list = new ArrayList<>();
        list.add(new DataBean("https://img.zcool.cn/community/013de756fb63036ac7257948747896.jpg", null, 1));
        list.add(new DataBean("https://img.zcool.cn/community/01639a56fb62ff6ac725794891960d.jpg", null, 1));
        list.add(new DataBean("https://img.zcool.cn/community/01270156fb62fd6ac72579485aa893.jpg", null, 1));
        list.add(new DataBean("https://img.zcool.cn/community/01233056fb62fe32f875a9447400e1.jpg", null, 1));
        list.add(new DataBean("https://img.zcool.cn/community/016a2256fb63006ac7257948f83349.jpg", null, 1));
        return list;
    }

    public static List<String> getColors(int size) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(getRandColor());
        }
        return list;
    }

    /**
     * 获取十六进制的颜色代码.例如  "#5A6677"
     * 分别取R、G、B的随机值，然后加起来即可
     *
     * @return String
     */
    public static String getRandColor() {
        String R, G, B;
        Random random = new Random();
        R = Integer.toHexString(random.nextInt(256)).toUpperCase();
        G = Integer.toHexString(random.nextInt(256)).toUpperCase();
        B = Integer.toHexString(random.nextInt(256)).toUpperCase();

        R = R.length() == 1 ? "0" + R : R;
        G = G.length() == 1 ? "0" + G : G;
        B = B.length() == 1 ? "0" + B : B;

        return "#" + R + G + B;
    }
}
