package com.dnowogorski;

final class RGB {

    private final int red;
    private final int green;
    private final int blue;

    RGB(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RGB rgb = (RGB) o;

        if (red != rgb.red) return false;
        if (green != rgb.green) return false;
        return blue == rgb.blue;
    }

    @Override
    public int hashCode() {
        int result = red;
        result = 31 * result + green;
        result = 31 * result + blue;
        return result;
    }
}
