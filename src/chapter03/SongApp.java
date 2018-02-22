package chapter03;

public class SongApp {
	
	public static void main(String[] args) {
		
//		Song s = new Song();
//		
//		
//		s.setArtist("아이유");
//		s.setTitle("좋은날");
//		s.setAlbum("Real");
//		s.setYear(2010);
//		s.setTrack(3);
//		s.setComposer("이민수");
		
		Song s = new Song("좋은날","아이유","Real","이민수",2010,3);
		s.show();
		
		Song s2 = new Song("꽃이야","JBJ");
		s2.show();
	}

}
