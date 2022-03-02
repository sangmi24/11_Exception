package com.kh.exception.homework;
import java.util.Arrays;
public class Song {

	//필드부
	private String title;  //제목
	private String artist;  //가수
	private String album;   //앨범
	private String[] composer;  //작곡가 (작곡가 여러명 )
	private int year;  //연도
	private int track;  //트랙번호
	
	//생성자부
	public Song() {
	}
	public Song(String title, String artist, String album, String[] composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	//메소드부
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String[] getComposer() {
		return composer;
	}
	public void setComposer(String[] composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}

	public String show() {
		return "Song [노래 :" + title + ", 가수: " + artist + ", 앨범 제목: " + album + ", 작곡가: "
				+ Arrays.toString(composer) + ", 연도: " + year + ", 트랙 번호: " + track + "]";
	}
	

	
	
	
}
