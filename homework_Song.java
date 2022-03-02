package com.kh.exception.homework;
import java.util.Arrays;
public class Song {

	//�ʵ��
	private String title;  //����
	private String artist;  //����
	private String album;   //�ٹ�
	private String[] composer;  //�۰ (�۰ ������ )
	private int year;  //����
	private int track;  //Ʈ����ȣ
	
	//�����ں�
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
	//�޼ҵ��
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
		return "Song [�뷡 :" + title + ", ����: " + artist + ", �ٹ� ����: " + album + ", �۰: "
				+ Arrays.toString(composer) + ", ����: " + year + ", Ʈ�� ��ȣ: " + track + "]";
	}
	

	
	
	
}
