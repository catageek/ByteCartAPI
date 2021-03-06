package com.github.catageek.ByteCartAPI.Wanderer;

public interface Counter {

	int getCount(int slot);

	boolean isAllFull(int i, int j);

	void resetAll();

	void setCount(int slot, int amount);

	void incrementCount(int i, int j);

}
