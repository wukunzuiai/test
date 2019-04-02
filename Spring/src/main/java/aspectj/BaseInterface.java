package aspectj;

public interface BaseInterface {

	/**
	 * 新增歌曲
	 *
	 * @param author
	 *            作者
	 * @param songTitle
	 *            歌曲名
	 *
	 * @return java.lang.Integer 返回当前歌曲总数
	 *
	 * @author xxx 2019/3/4
	 * @version 1.0
	 **/
	Integer addSong(String author, String songTitle);

	/**
	 * 删除歌曲
	 *
	 * @param author
	 *            作者
	 * @param songTitle
	 *            歌曲名
	 *
	 * @return java.lang.Integer 返回当前歌曲总数
	 *
	 * @author xxx 2019/3/4
	 * @version 1.0
	 **/
	Integer delSong(String author, String songTitle);
}
