package flowerShop.characteristics;

public enum Fresh {

    NOT_FRESH,
    FRESH,
    VERY_FRESH;

    @Override
    public String toString() {
        String enumName = super.toString();
        final StringBuilder result = new StringBuilder(enumName.length());
        String[] words = enumName.split("_");
        for (int i = 0; i < words.length; ++i) {
            if (i > 0) {
                result.append(" ");
            }
            result.append(words[i].charAt(0))
                    .append(words[i].toLowerCase().substring(1));
        }
        return result.toString();
    }

}
