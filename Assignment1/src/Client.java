import java.util.Arrays;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie french = new Movie("/Users/stevenyuan/Documents/dzx文件/董子轩小可爱的生日视频/法语.mp4",
				"法语", "French", "Youtube");
		try {
			Movie error = new Movie("/Users/stevenyuan/Documents/dzx文件/董子轩小可爱的生日视频/法语.mp3",
						"法语", "French", "Youtube");
			error.getTitle();
		}
		catch (AssertionError e){
			System.out.println("Successfully deal with the wrong format");
		}
		Movie japanese = new Movie("/Users/stevenyuan/Documents/dzx文件/董子轩小可爱的生日视频/日语.mp4",
				"日语", "Japanese", "Youtube");
		Movie korean = new Movie("/Users/stevenyuan/Documents/dzx文件/董子轩小可爱的生日视频/韩语.mp4",
				"韩语", "Korean", "Youtube");
		Movie portuguese = new Movie("/Users/stevenyuan/Documents/dzx文件/董子轩小可爱的生日视频/葡萄牙语.mp4",
				"葡萄牙语", "Portuguese", "Youtube");
		Movie spanish = new Movie("/Users/stevenyuan/Documents/dzx文件/董子轩小可爱的生日视频/西班牙语.mp4",
				"西班牙语", "Spanish", "Youtube");
		Movie english = new Movie("/Users/stevenyuan/Documents/dzx文件/董子轩小可爱的生日视频/英文.mp4",
				"英文", "English", "Youtube");
		Movie russian = new Movie("/Users/stevenyuan/Documents/dzx文件/董子轩小可爱的生日视频/俄语.mp4",
				"俄语", "Russian", "Youtube");
		Movie german = new Movie("/Users/stevenyuan/Documents/dzx文件/董子轩小可爱的生日视频/德语.mp4",
				"德语", "German", "Youtube");
		Movie arabic = new Movie("/Users/stevenyuan/Documents/dzx文件/董子轩小可爱的生日视频/阿拉伯语.mp4",
				"阿拉伯语", "Arabic", "Youtube");
		Movie chinese = new Movie("/Users/stevenyuan/Documents/dzx文件/董子轩小可爱的生日视频/中文.mp4",
				"中文", "Chinese", "Youtube");
		Movie surprise = new Movie("/Users/stevenyuan/Documents/dzx文件/董子轩小可爱的生日视频/惊喜.mp4",
				"惊喜", "Chinese", "Tencent");
		Movie love = new Movie("/Users/stevenyuan/Documents/dzx文件/董子轩小可爱的生日视频/我爱你集锦.mp4",
				"我爱你集锦", "Chinese", "iMovie");
		Movie photos = new Movie("/Users/stevenyuan/Documents/dzx文件/董子轩小可爱的生日视频/照片.mp4",
				"照片", "Chinese", "Album");
		Movie wishes = new Movie("/Users/stevenyuan/Documents/dzx文件/董子轩小可爱的生日视频/同学祝福.mp4",
				"同学祝福", "Chinese", "Album");
		Movie finalCut = new Movie("/Users/stevenyuan/Documents/dzx文件/董子轩小可爱的生日视频/董子轩的生日祝福总.mp4",
				"正片", "Chinese", "iMovie");
		WatchList loves = new WatchList("表白视频");
		loves.add(french);
		loves.add(japanese);
		loves.add(korean);
		loves.add(portuguese);
		loves.add(spanish);
		loves.add(english);
		loves.add(russian);
		loves.add(german);
		loves.add(arabic);
		loves.add(chinese);
		WatchList parts = new WatchList("合集");
		parts.add(surprise);
		parts.add(love);
		parts.add(photos);
		parts.add(wishes);
		WatchList finalVersion = new WatchList("正片");
		finalVersion.add(finalCut);
		System.out.println(french.getValidity());
		System.out.println(french.getTitle());
		System.out.println(french.getStudio());
		System.out.println(french.getLanguage());
		System.out.println(french.getFormat());
		french.addPair("备注", "这是法语版的我爱你视频");
		french.addPair("法语我爱你怎么说", "Je t'aime");
		french.modifyPair("备注", "啦啦啦啦啦");
		french.removePair("法语我爱你怎么说");
		System.out.println(loves.getName());
		loves.setName("newLoves");
		System.out.println(loves.getName());
		System.out.println(loves.validMovies());
		Movie invalid = new Movie("/lala.mp4", "invalid", "heyhey", "dutch");
		loves.add(invalid);
		System.out.println(loves.validMovies());
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(Arrays.deepToString(loves.accessAll()));
		loves.watchOne();
		System.out.println(Arrays.deepToString(loves.accessAll()));
		
	}

}
