package mysql.erd.bbs;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 게시판 모델 클래스.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Board implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 글 아이디. */
	private Integer bid;

	/** 제목. */
	private String btitle;

	/** 본문. */
	private String bcontent;

	/** 사용자 테이블. */
	private Users users;

	/** 글쓴 시간. */
	private Date modtime;

	/** 조회수. */
	private Integer viewcount;

	/** 댓글수. */
	private Integer replycount;

	/** 삭제 여부. */
	private Integer isdel;

	/** 댓글 목록. */
	private Set<Reply> replySet;

	/**
	 * 생성자.
	 */
	public Board() {
		this.replySet = new HashSet<Reply>();
	}

	/**
	 * 글 아이디을 설정합니다..
	 * 
	 * @param bid
	 *            글 아이디
	 */
	public void setBid(Integer bid) {
		this.bid = bid;
	}

	/**
	 * 글 아이디을 가져옵니다..
	 * 
	 * @return 글 아이디
	 */
	public Integer getBid() {
		return this.bid;
	}

	/**
	 * 제목을 설정합니다..
	 * 
	 * @param btitle
	 *            제목
	 */
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	/**
	 * 제목을 가져옵니다..
	 * 
	 * @return 제목
	 */
	public String getBtitle() {
		return this.btitle;
	}

	/**
	 * 본문을 설정합니다..
	 * 
	 * @param bcontent
	 *            본문
	 */
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}

	/**
	 * 본문을 가져옵니다..
	 * 
	 * @return 본문
	 */
	public String getBcontent() {
		return this.bcontent;
	}

	/**
	 * 사용자 테이블을 설정합니다..
	 * 
	 * @param users
	 *            사용자 테이블
	 */
	public void setUsers(Users users) {
		this.users = users;
	}

	/**
	 * 사용자 테이블을 가져옵니다..
	 * 
	 * @return 사용자 테이블
	 */
	public Users getUsers() {
		return this.users;
	}

	/**
	 * 글쓴 시간을 설정합니다..
	 * 
	 * @param modtime
	 *            글쓴 시간
	 */
	public void setModtime(Date modtime) {
		this.modtime = modtime;
	}

	/**
	 * 글쓴 시간을 가져옵니다..
	 * 
	 * @return 글쓴 시간
	 */
	public Date getModtime() {
		return this.modtime;
	}

	/**
	 * 조회수을 설정합니다..
	 * 
	 * @param viewcount
	 *            조회수
	 */
	public void setViewcount(Integer viewcount) {
		this.viewcount = viewcount;
	}

	/**
	 * 조회수을 가져옵니다..
	 * 
	 * @return 조회수
	 */
	public Integer getViewcount() {
		return this.viewcount;
	}

	/**
	 * 댓글수을 설정합니다..
	 * 
	 * @param replycount
	 *            댓글수
	 */
	public void setReplycount(Integer replycount) {
		this.replycount = replycount;
	}

	/**
	 * 댓글수을 가져옵니다..
	 * 
	 * @return 댓글수
	 */
	public Integer getReplycount() {
		return this.replycount;
	}

	/**
	 * 삭제 여부을 설정합니다..
	 * 
	 * @param isdel
	 *            삭제 여부
	 */
	public void setIsdel(Integer isdel) {
		this.isdel = isdel;
	}

	/**
	 * 삭제 여부을 가져옵니다..
	 * 
	 * @return 삭제 여부
	 */
	public Integer getIsdel() {
		return this.isdel;
	}

	/**
	 * 댓글 목록을 설정합니다..
	 * 
	 * @param replySet
	 *            댓글 목록
	 */
	public void setReplySet(Set<Reply> replySet) {
		this.replySet = replySet;
	}

	/**
	 * 댓글를 추가합니다..
	 * 
	 * @param reply
	 *            댓글
	 */
	public void addReply(Reply reply) {
		this.replySet.add(reply);
	}

	/**
	 * 댓글 목록을 가져옵니다..
	 * 
	 * @return 댓글 목록
	 */
	public Set<Reply> getReplySet() {
		return this.replySet;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bid == null) ? 0 : bid.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Board other = (Board) obj;
		if (bid == null) {
			if (other.bid != null) {
				return false;
			}
		} else if (!bid.equals(other.bid)) {
			return false;
		}
		return true;
	}

}
