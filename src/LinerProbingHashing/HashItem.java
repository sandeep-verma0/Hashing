package LinerProbingHashing;

//Programming Principles 1B
//Chapter 5 Lecture Notes Code

class HashItem {
	private String key;
	private String data;
	private boolean deleted;

	HashItem(String key, String data) {
		this.key = key;
		this.data = data;
		deleted = false;
	}

	public void setDeleted() {
		deleted = true;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public String getKey() {
		return key;
	}

	public String getData() {
		return data;
	}
}
