/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kougi02;

/**
 *
 * @author Admin
 */
public class Tweet {

    private int tweetNo;	//ツイートの番号
    private String twitterID;	//twitterID
    private String name;	//氏名
    private String tweetTime;	//投稿日時
    private String text;	//投稿内容

    public Tweet() {
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
        this.tweetTime = tT;
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
