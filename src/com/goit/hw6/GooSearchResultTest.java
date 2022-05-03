package com.goit.hw6;

class GooSearchResultTest {
    public static void main(String[] args) {
        //test.com
        System.out.println(new GooSearchResult("https://test.com").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());
    }
}

class GooSearchResult {

    private final String url;

    public GooSearchResult(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String parseDomain() {
        String result = "";

        String[] split = url.split("//");
        if (split.length > 0) result = split[1].split("/")[0];
        return result;
    }
}
