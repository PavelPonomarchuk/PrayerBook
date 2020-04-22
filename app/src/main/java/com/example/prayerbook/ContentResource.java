package com.example.prayerbook;

public class ContentResource {
    private ContentItem[] resource;

    public ContentResource(ContentItem[] resource){
        this.resource = resource;
    }

    public String getPrayerName(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= resource.length)
            throw new IndexOutOfBoundsException();

        return resource[index].getPrayerName();
    }

    public String getPrayerText(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= resource.length)
            throw new IndexOutOfBoundsException();

        return resource[index].getPrayerText();
    }

}
