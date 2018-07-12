package vn.hieuruoi.recyclerviewdemo;

public class Data {
    private int mImage;
    private String mName;

    public Data(int image, String name) {
        this.mImage = image;
        this.mName = name;
    }

    public int getmImage() {
        return mImage;
    }

    public String getName() {
        return mName;
    }

    public void setmImage(int mImage) {
        this.mImage = mImage;
    }

    public void setName(String name) {
        this.mName = name;
    }
}

