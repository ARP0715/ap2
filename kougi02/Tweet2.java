/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kougi02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Tweet2 {

    private int tweetNo;	//ツイートの番号
    private String twitterID;	//twitterID
    private String name;	//氏名
    private Date tweetTime;	//投稿日時
    private String text;	//投稿内容

    public Tweet2() {
        //とりあえず何もしない
    }

    public void setNo(int tn) {
        this.tweetNo = tn;
    }

    public void setTID(String tid) {
        this.twitterID = tid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTweetTime(String tT) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm");
            Date date = sdf.parse(tT);
            this.tweetTime = date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public Date getTweetTime() {
        return tweetTime;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void printTweet() {
        System.out.println(tweetNo + ":"
                + twitterID + "(" + name + ")\n"
                + tweetTime + "\n" + text);
    }

}
